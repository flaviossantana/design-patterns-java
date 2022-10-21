package io.com.store.imposto.service;

import io.com.store.imposto.contract.Imposto;
import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }

}
