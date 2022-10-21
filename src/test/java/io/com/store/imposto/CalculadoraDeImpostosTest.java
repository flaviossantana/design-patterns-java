package io.com.store.imposto;

import io.com.store.imposto.service.CalculadoraDeImpostos;
import io.com.store.imposto.strategy.ICMS;
import io.com.store.imposto.strategy.ISS;
import io.com.store.orcamento.Orcamento;
import junit.framework.TestCase;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraDeImpostosTest extends TestCase {

    public void testDeveriaCalcularImpostDeICMS() {
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(100), 1);

        BigDecimal imposto = calculadoraDeImpostos.calcular(orcamento, new ICMS());
        assertEquals(BigDecimal.valueOf(10.0), imposto);
    }

    public void testDeveriaCalcularImpostDeISS() {
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(100), 1);

        BigDecimal imposto = calculadoraDeImpostos.calcular(orcamento, new ISS());
        assertEquals(BigDecimal.valueOf(6).setScale(2, RoundingMode.HALF_UP), imposto);
    }

}
