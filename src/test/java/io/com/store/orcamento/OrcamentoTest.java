package io.com.store.orcamento;

import io.com.store.orcamento.builder.OrcamentoBuilder;
import io.com.store.orcamento.exception.SituacaoOrcamentoException;
import io.com.store.orcamento.proxy.OrcamentoProxy;
import junit.framework.TestCase;

import java.math.BigDecimal;

public class OrcamentoTest extends TestCase {

    private Orcamento orcamento;

    public void setUp() throws Exception {
        super.setUp();
        this.orcamento = new OrcamentoProxy(OrcamentoBuilder.init().addItem("100").build());
    }

    public void testCalcularValor() {
        assertEquals(new BigDecimal("100"), orcamento.getValor());
    }

    public void testCalcularValorComDescontoExtra() {
        Orcamento orcamento = OrcamentoBuilder.init().addItem("100").build();
        orcamento.aplicarDescontoExtra();
        assertEquals(new BigDecimal("95.00"), orcamento.getValor());
    }

    public void testCalcularValorComDescontoExtraAprovado() {
        Orcamento orcamento = OrcamentoBuilder.init().addItem("100").build();
        orcamento.aprovar();
        orcamento.aplicarDescontoExtra();
        assertEquals(new BigDecimal("98.00"), orcamento.getValor());
    }

    public void testCalcularValorComDescontoExtraFinalizado() {
        orcamento.aprovar();
        orcamento.finalizar();
        orcamento.aplicarDescontoExtra();
        assertEquals(new BigDecimal("100"), orcamento.getValor());
    }

    public void testCalcularValorComDescontoExtraReprovado() {
        orcamento.reprovar();
        orcamento.aplicarDescontoExtra();
        assertEquals(new BigDecimal("100"), orcamento.getValor());
    }

    public void testTransitarSituacaoReprovadoParaAprovado() {
        Orcamento orcamento = new Orcamento();
        orcamento.reprovar();
        try {
            orcamento.aprovar();
        } catch (SituacaoOrcamentoException e) {
            assertEquals("Orcamentos não pode ser aprovado", e.getMessage());
        }
    }

    public void testTransitarParaSituacaoFinalizado() {
        orcamento.reprovar();
        orcamento.finalizar();
        orcamento.aplicarDescontoExtra();
        assertEquals(new BigDecimal("100"), orcamento.getValor());
    }

    public void testReprovarSituacaoJaReprovada() {
        try {
            orcamento.reprovar();
            orcamento.reprovar();
        } catch (SituacaoOrcamentoException e) {
            assertEquals("Orcamentos não pode ser reprovado", e.getMessage());
        }
    }

    public void testFinalizarSituacaoAindaEmAnalise() {
        try {
            orcamento.finalizar();
        } catch (SituacaoOrcamentoException e) {
            assertEquals("Orcamentos não pode ser finalizado", e.getMessage());
        }
    }

    public void testDeveriaAdcionarOOrcamentoAnterior() {
        Orcamento novoOrcamento = OrcamentoBuilder.init().addItem("100").build();
        novoOrcamento.adicionarItem(orcamento);

        assertEquals(new BigDecimal("200"), novoOrcamento.getValor());
    }

}
