package io.com.store.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private final int quantidadeItens;
    private String situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = BigDecimal.ZERO;
        if (situacao.equals("EM_ANALISE")) {
            valorDoDescontoExtra = valor.multiply(new BigDecimal("0.05"));
        } else if (situacao.equals("APROVADO")) {
            valorDoDescontoExtra = valor.multiply(new BigDecimal("0.02"));
        }
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovado() {
        this.situacao = "APROVADO";
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
