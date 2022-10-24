package io.com.store.desconto.service;

import io.com.store.orcamento.Orcamento;
import io.com.store.orcamento.OrcamentoBuilder;
import junit.framework.TestCase;

import java.math.BigDecimal;

public class CalculadoraDeDescontoTest extends TestCase {

    public void testDeveriaCalcularOrcamentoSemDesconto() {
        Orcamento orcamentoSemDesconto = new Orcamento();
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        assertEquals(0, calculadoraDeDesconto.calcular(orcamentoSemDesconto).compareTo(BigDecimal.ZERO));
    }

    public void testDeveriaCalcularDescontoComOrcamentoComMaisDeCincoItens() {
        Orcamento orcamentoSeisItens = OrcamentoBuilder.init()
                .addItem("400")
                .addItem("100")
                .addItem("100")
                .addItem("100")
                .addItem("100")
                .addItem("100")
                .addItem("100")
                .build();

        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        assertEquals(new BigDecimal("100.0"), calculadoraDeDesconto.calcular(orcamentoSeisItens));
    }

    public void testDeveriaCalcularDescontoOrcamentoMaiorQueMilReais() {
        Orcamento orcamentoSeisItens =  OrcamentoBuilder.init().addItem("1000").build();
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        assertEquals(new BigDecimal("50.00"), calculadoraDeDesconto.calcular(orcamentoSeisItens));
    }

}
