package io.com.store.orcamento;

import io.com.store.orcamento.exception.SituacaoOrcamentoException;
import io.com.store.orcamento.state.EmAnalise;
import junit.framework.TestCase;

import java.math.BigDecimal;

public class OrcamentoTest extends TestCase {

    public void testCalcularValor() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        assertEquals(new BigDecimal("100"), orcamento.getValor());
    }

    public void testCalcularValorComDescontoExtra() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        orcamento.setSituacao(new EmAnalise());
        orcamento.aplicarDescontoExtra();
        assertEquals(new BigDecimal("95.00"), orcamento.getValor());
    }

    public void testCalcularValorComDescontoExtraAprovado() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        orcamento.setSituacao(new EmAnalise());
        orcamento.aprovar();
        orcamento.aplicarDescontoExtra();
        assertEquals(new BigDecimal("98.00"), orcamento.getValor());
    }

    public void testCalcularValorComDescontoExtraFinalizado() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        orcamento.setSituacao(new EmAnalise());
        orcamento.aprovar();
        orcamento.finalizar();
        orcamento.aplicarDescontoExtra();
        assertEquals(new BigDecimal("100"), orcamento.getValor());
    }

    public void testCalcularValorComDescontoExtraReprovado() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        orcamento.setSituacao(new EmAnalise());
        orcamento.reprovar();
        orcamento.aplicarDescontoExtra();
        assertEquals(new BigDecimal("100"), orcamento.getValor());
    }

    public void testTransitarSituacaoReprovadoParaAprovado() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        orcamento.setSituacao(new EmAnalise());
        orcamento.reprovar();
        try {
            orcamento.aprovar();
        }catch (SituacaoOrcamentoException e) {
            assertEquals("Orcamentos não pode ser aprovado", e.getMessage());
        }
    }

    public void testTransitarParaSituacaoFinalizado() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        orcamento.setSituacao(new EmAnalise());
        orcamento.reprovar();
        orcamento.finalizar();
        orcamento.aplicarDescontoExtra();
        assertEquals(new BigDecimal("100"), orcamento.getValor());
    }

    public void testReprovarSituacaoJaReprovada() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        orcamento.setSituacao(new EmAnalise());
        orcamento.reprovar();
        try {
            orcamento.reprovar();
        }catch (SituacaoOrcamentoException e) {
            assertEquals("Orcamentos não pode ser reprovado", e.getMessage());
        }
    }

    public void testFinalizarSituacaoAindaEmAnalise() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        orcamento.setSituacao(new EmAnalise());
        try {
            orcamento.finalizar();
        }catch (SituacaoOrcamentoException e) {
            assertEquals("Orcamentos não pode ser finalizado", e.getMessage());
        }
    }

}
