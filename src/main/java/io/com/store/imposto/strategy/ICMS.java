package io.com.store.imposto.strategy;

import io.com.store.imposto.contract.Imposto;
import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
    }

}
