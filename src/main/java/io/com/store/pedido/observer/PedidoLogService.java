package io.com.store.pedido.observer;

import io.com.store.pedido.Pedido;
import io.com.store.pedido.act.AcaoAposGerarPedido;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PedidoLogService implements AcaoAposGerarPedido {

    private final Logger logger = Logger.getLogger(PedidoLogService.class.getName());

    @Override
    public void executaAcao(Pedido pedido) {
        logger.log(Level.INFO, "Salvando log de pedido gerado: {0}", Arrays.asList(pedido.getCliente(), pedido.getData(), pedido.getOrcamento().getValor()));
    }
}
