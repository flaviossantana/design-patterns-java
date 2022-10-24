package io.com.store.pedido.command;

import java.math.BigDecimal;

public class GeraPedido {

    private final String cliente;
    private final BigDecimal valor;
    private final int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valor, int quantidadeItens) {
        this.cliente = cliente;
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
