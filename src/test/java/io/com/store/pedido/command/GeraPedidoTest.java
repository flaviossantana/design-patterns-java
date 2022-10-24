package io.com.store.pedido.command;

import junit.framework.TestCase;

import java.math.BigDecimal;

public class GeraPedidoTest extends TestCase {

    public void testExecutaGeracaoPedido() {
        GeraPedido pedidoSiclano = new GeraPedido("Siclano da Silva", new BigDecimal("890.50"), 2);
        pedidoSiclano.executa();
        fail();
    }
}
