package io.com.store.desconto.template;

import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    protected Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    public abstract boolean isDeveAplicarDesconto(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {

        if (isDeveAplicarDesconto(orcamento)) {
            return efetuarCalculo(orcamento);
        }

        return proximo.calcular(orcamento);
    }

}
