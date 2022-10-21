package io.com.store.desconto.chain;

import io.com.store.desconto.template.Desconto;
import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoZero extends Desconto {

    public DescontoZero() {
        super(null);
    }

    @Override
    public boolean isDeveAplicarDesconto(Orcamento orcamento) {
        return true;
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

}
