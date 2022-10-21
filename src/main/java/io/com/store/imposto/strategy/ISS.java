package io.com.store.imposto.strategy;

import io.com.store.imposto.actions.Imposto;
import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.06));
    }

}
