package io.com.store.desconto.chain;

import io.com.store.desconto.template.Desconto;
import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoPorValorDaCompra extends Desconto {

    public DescontoPorValorDaCompra(Desconto proximo) {
        super(proximo);
    }

    @Override
    public boolean isDeveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

}
