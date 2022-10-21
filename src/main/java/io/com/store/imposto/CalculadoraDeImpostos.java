package io.com.store.imposto;

import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
        return orcamento.getValor().multiply(tipoImposto.percentual());
    }

}
