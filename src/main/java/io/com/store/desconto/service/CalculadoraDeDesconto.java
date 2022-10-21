package io.com.store.desconto.service;

import io.com.store.desconto.chain.Desconto;
import io.com.store.desconto.chain.DescontoPorQuantidadeDeItens;
import io.com.store.desconto.chain.DescontoPorValorDaCompra;
import io.com.store.desconto.chain.DescontoZero;
import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

        public BigDecimal calcular(Orcamento orcamento) {
            Desconto desconto = new DescontoPorQuantidadeDeItens(
                    new DescontoPorValorDaCompra(
                            new DescontoZero()
                    )
            );
            return desconto.calcular(orcamento);
        }

}
