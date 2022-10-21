package io.com.store.desconto.chain;

import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoPorValorDaCompra extends Desconto {

    public DescontoPorValorDaCompra(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        return proximo.calcular(orcamento);
    }
}
