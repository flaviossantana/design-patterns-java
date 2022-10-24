package io.com.store.imposto.strategy;

import io.com.store.imposto.contract.Imposto;
import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMSComISS implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return new ICMS().calcular(orcamento)
                .add(new ISS().calcular(orcamento));
    }

}
