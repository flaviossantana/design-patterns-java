package io.com.store.pedido.observer;

import io.com.store.pedido.Pedido;
import io.com.store.pedido.act.AcaoAposGerarPedido;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PedidoEmailService implements AcaoAposGerarPedido {

    private final Logger logger = Logger.getLogger(PedidoEmailService.class.getName());

    @Override
    public void executaAcao(Pedido pedido) {
        logger.log(Level.INFO, "Enviando e-mail de pedido gerado: {0}", pedido.getCliente());
    }

}
