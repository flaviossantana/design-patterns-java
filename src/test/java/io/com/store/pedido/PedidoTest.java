package io.com.store.pedido;

import io.com.store.orcamento.Orcamento;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PedidoTest extends TestCase {

    public void testCriarPedido() {

        Orcamento orcamento = new Orcamento(new BigDecimal("890.50"), 2);
        LocalDateTime data = LocalDateTime.now();
        Pedido pedido = new Pedido("Siclano da Silva", data, orcamento);

        Assert.assertEquals("Siclano da Silva", pedido.getNome());
        Assert.assertEquals(data, pedido.getData());
        Assert.assertEquals(orcamento.getValor(), pedido.getOrcamento().getValor());

    }

}
