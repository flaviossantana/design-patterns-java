package io.com.store.pedido.observer;

import io.com.store.pedido.Pedido;

public class PedidoEmailService {

    public void executa(Pedido pedido) {
        System.out.printf("Enviando e-mail de pedido gerado: %s", pedido.getCliente());
    }

}
