package io.com.store.desconto.service;

import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraDeDesconto {

        public BigDecimal calcular(Orcamento orcamento) {

            if (orcamento.getQuantidadeItens() > 5) {
                return orcamento.getValor().multiply(new BigDecimal("0.1")).setScale(2, RoundingMode.HALF_UP);
            }

            if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
                return orcamento.getValor().multiply(new BigDecimal("0.1")).setScale(2, RoundingMode.HALF_UP);
            }

            return BigDecimal.ZERO;
        }

}
