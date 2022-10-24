package io.com.store.pedido.command;

import io.com.store.orcamento.Orcamento;
import io.com.store.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private final String cliente;
    private final BigDecimal valor;
    private final int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valor, int quantidadeItens) {
        this.cliente = cliente;
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public void executa(){
        Orcamento orcamento = new Orcamento(valor, quantidadeItens);
        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
        System.out.printf("Salvando pedido no banco de dados: %s", pedido.getCliente());
        System.out.printf("Enviando e-mail de pedido gerado: %s", pedido.getCliente());
    }

}
