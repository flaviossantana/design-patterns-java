package io.com.store.imposto;

import io.com.store.orcamento.Orcamento;
import junit.framework.TestCase;

import java.math.BigDecimal;

public class CalculadoraDeImpostosTest extends TestCase {

    public void deveriaCalcularImpostDeICMS() {
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(100));
        BigDecimal imposto = calculadoraDeImpostos.calcular(orcamento, TipoImposto.ICMS);
        assertEquals(BigDecimal.valueOf(10.0), imposto);
    }

}
