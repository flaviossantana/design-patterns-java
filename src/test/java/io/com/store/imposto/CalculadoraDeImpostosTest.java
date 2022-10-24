package io.com.store.imposto;

import io.com.store.imposto.service.CalculadoraDeImpostos;
import io.com.store.imposto.strategy.ICMS;
import io.com.store.imposto.strategy.ISS;
import io.com.store.orcamento.Orcamento;
import io.com.store.orcamento.builder.OrcamentoBuilder;
import junit.framework.TestCase;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraDeImpostosTest extends TestCase {

    public void testDeveriaCalcularImpostDeICMS() {
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        Orcamento orcamento = OrcamentoBuilder.init().addItem("100").build();
        BigDecimal imposto = calculadoraDeImpostos.calcular(orcamento, new ICMS(null));
        assertEquals(BigDecimal.valueOf(10.0), imposto);
    }

    public void testDeveriaCalcularImpostDeISS() {
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        Orcamento orcamento = OrcamentoBuilder.init().addItem("100").build();
        BigDecimal imposto = calculadoraDeImpostos.calcular(orcamento, new ISS(null));
        assertEquals(BigDecimal.valueOf(6).setScale(2, RoundingMode.HALF_UP), imposto);
    }

    public void testDeveriaCalcularImpostDeISSEICMS() {
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        Orcamento orcamento = OrcamentoBuilder.init().addItem("100").build();
        BigDecimal imposto = calculadoraDeImpostos.calcular(orcamento, new ISS(new ICMS(null)));
        assertEquals(new BigDecimal("16.00"), imposto);
    }

}
