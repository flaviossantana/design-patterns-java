package io.com.store.pedido.observer;

import io.com.store.pedido.Pedido;
import io.com.store.pedido.act.AcaoAposGerarPedido;

public class PedidoRepository implements AcaoAposGerarPedido {

    @Override
    public void executaAcao(Pedido pedido) {
        System.out.printf("Salvando pedido no banco de dados: %s", pedido.getCliente());
    }

}
