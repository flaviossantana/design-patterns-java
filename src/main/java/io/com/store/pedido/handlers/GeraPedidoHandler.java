package io.com.store.pedido.handlers;

import io.com.store.orcamento.Orcamento;
import io.com.store.pedido.Pedido;
import io.com.store.pedido.command.GeraPedido;
import io.com.store.pedido.observer.PedidoEmailService;
import io.com.store.pedido.observer.PedidoRepository;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValor(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        new PedidoRepository().executa(pedido);
        new PedidoEmailService().executa(pedido);
    }
}
