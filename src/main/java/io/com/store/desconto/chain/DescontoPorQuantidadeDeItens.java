package io.com.store.desconto.chain;

import io.com.store.desconto.template.Desconto;
import io.com.store.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoPorQuantidadeDeItens extends Desconto {

    public DescontoPorQuantidadeDeItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public boolean isDeveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}
