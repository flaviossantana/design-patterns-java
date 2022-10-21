package io.com.store.desconto.chain;

import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoZero extends Desconto {

    public DescontoZero() {
        super(null);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

}
