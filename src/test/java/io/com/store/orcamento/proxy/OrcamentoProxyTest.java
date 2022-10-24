package io.com.store.orcamento.proxy;

import io.com.store.orcamento.Orcamento;
import io.com.store.orcamento.builder.OrcamentoBuilder;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.logging.Logger;

public class OrcamentoProxyTest extends TestCase {

    private final Logger logger = Logger.getLogger(OrcamentoProxyTest.class.getName());

    public void testDeveriaPegarOValorMaisRapidoDoProxy() {
        Orcamento orcamento = OrcamentoBuilder.init().addItem("1500").addItem("2000").build();
        OrcamentoProxy orcamentoProxy = new OrcamentoProxy(orcamento);
        logger.info("Valor do orçamento: " + orcamento.getValor());
        logger.info("Valor do orçamento: " + orcamentoProxy.getValor());
        logger.info("Valor do orçamento: " + orcamentoProxy.getValor());
        logger.info("Valor do orçamento: " + orcamentoProxy.getValor());

        Assert.assertEquals(orcamento.getValor(), orcamentoProxy.getValor());

    }

}
