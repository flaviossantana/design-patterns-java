package io.com.store.imposto.strategy;

import io.com.store.imposto.contract.Imposto;
import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {
    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.06));
    }

}
