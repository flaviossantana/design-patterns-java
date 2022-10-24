package io.com.store.imposto.contract;

import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private final Imposto outroImposto;

    protected Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;

        if(outroImposto != null) {
            valorOutroImposto = outroImposto.realizarCalculo(orcamento);
        }

        return valorImposto.add(valorOutroImposto);
    }

}
