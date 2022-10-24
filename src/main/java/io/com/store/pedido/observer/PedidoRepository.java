package io.com.store.pedido.observer;

import io.com.store.pedido.Pedido;

public class PedidoRepository {

    public void executa(Pedido pedido) {
        System.out.printf("Salvando pedido no banco de dados: %s", pedido.getCliente());
    }

}
