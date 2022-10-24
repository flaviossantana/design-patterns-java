package io.com.store.pedido.command;

import io.com.store.pedido.act.AcaoAposGerarPedido;
import io.com.store.pedido.handlers.GeraPedidoHandler;
import io.com.store.pedido.observer.PedidoLogService;
import io.com.store.pedido.observer.PedidoEmailService;
import io.com.store.pedido.observer.PedidoRepository;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class GeraPedidoTest extends TestCase {

    public void testExecutaGeracaoPedido() {
        GeraPedido pedidoSiclano = new GeraPedido("Siclano da Silva", new BigDecimal("890.50"), 2);
        List<AcaoAposGerarPedido> acaoAposGerarPedidos = Arrays.asList(
                new PedidoEmailService(),
                new PedidoRepository(),
                new PedidoLogService()
        );
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(acaoAposGerarPedidos);
        geraPedidoHandler.executa(pedidoSiclano);
        Assert.assertEquals(pedidoSiclano.getCliente(), "Siclano da Silva");
        Assert.assertEquals(pedidoSiclano.getValor(), new BigDecimal("890.50"));
        Assert.assertEquals(pedidoSiclano.getQuantidadeItens(), 2);
    }
}
