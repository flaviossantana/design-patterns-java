package io.com.store.pedido.handlers;

import io.com.store.orcamento.Orcamento;
import io.com.store.pedido.Pedido;
import io.com.store.pedido.act.AcaoAposGerarPedido;
import io.com.store.pedido.command.GeraPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValor(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        acoes.forEach(a -> a.executaAcao(pedido));
    }
}
