package io.com.store.pedido;

import io.com.store.orcamento.Orcamento;
import io.com.store.orcamento.proxy.OrcamentoProxy;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.time.LocalDateTime;

public class PedidoTest extends TestCase {

    public void testCriarPedido() {

        Orcamento orcamento = new Orcamento();
        OrcamentoProxy orcamentoProxy = new OrcamentoProxy(orcamento);
        LocalDateTime data = LocalDateTime.now();
        Pedido pedido = new Pedido("Siclano da Silva", data, orcamentoProxy);

        Assert.assertEquals("Siclano da Silva", pedido.getCliente());
        Assert.assertEquals(data, pedido.getData());
        Assert.assertEquals(orcamentoProxy.getValor(), pedido.getOrcamento().getValor());

    }

}
