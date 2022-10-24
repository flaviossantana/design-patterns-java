package io.com.store.pedido.handlers;

import io.com.store.orcamento.Orcamento;
import io.com.store.pedido.Pedido;
import io.com.store.pedido.command.GeraPedido;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValor(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        System.out.printf("Salvando pedido no banco de dados: %s", pedido.getCliente());
        System.out.printf("Enviando e-mail de pedido gerado: %s", pedido.getCliente());
    }
}
