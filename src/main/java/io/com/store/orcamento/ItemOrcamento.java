package io.com.store.orcamento;

import io.com.store.orcamento.composite.Orcavel;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel {

    private final BigDecimal valor;

    public ItemOrcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

}
