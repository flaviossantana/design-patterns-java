package io.com.store.pedido.observer;

import io.com.store.pedido.Pedido;
import io.com.store.pedido.act.AcaoAposGerarPedido;

public class PedidoEmailService implements AcaoAposGerarPedido {

    @Override
    public void executaAcao(Pedido pedido) {
        System.out.printf("Enviando e-mail de pedido gerado: %s", pedido.getCliente());
    }

}
