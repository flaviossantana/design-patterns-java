package io.com.store.pedido.observer;

import io.com.store.pedido.Pedido;
import io.com.store.pedido.act.AcaoAposGerarPedido;

import java.util.logging.Logger;

public class PedidoRepository implements AcaoAposGerarPedido {

    private final Logger logger = Logger.getLogger(PedidoRepository.class.getName());

    @Override
    public void executaAcao(Pedido pedido) {
        logger.info("Salvando pedido no banco de dados: " + pedido.getCliente());
    }

}
