package io.com.store.orcamento.proxy;

import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento {

    private BigDecimal valor;
    private final Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if (valor == null) {
            valor = orcamento.getValor();
        }

        return this.valor;
    }
}
