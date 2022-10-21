package io.com.store.desconto.service;

import io.com.store.orcamento.Orcamento;
import junit.framework.TestCase;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraDeDescontoTest extends TestCase {

    public void testDeveriaCalcularOrcamentoSemDesconto() {
        Orcamento orcamentoSemDesconto = new Orcamento(new BigDecimal("10"), 1);
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        assertEquals(0, calculadoraDeDesconto.calcular(orcamentoSemDesconto).compareTo(BigDecimal.ZERO));
    }

    public void testDeveriaCalcularDescontoComOrcamentoComMaisDeCincoItens() {
        Orcamento orcamentoSeisItens = new Orcamento( new BigDecimal("1000"), 6);
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        assertEquals(new BigDecimal("100.0"), calculadoraDeDesconto.calcular(orcamentoSeisItens));
    }

    public void testDeveriaCalcularDescontoOrcamentoMaiorQueMilReais() {
        Orcamento orcamentoSeisItens = new Orcamento( new BigDecimal("1000"), 1);
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        assertEquals(new BigDecimal("50.00"), calculadoraDeDesconto.calcular(orcamentoSeisItens));
    }

}
