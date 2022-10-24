package io.com.store.orcamento.service;

import io.com.store.orcamento.Orcamento;
import io.com.store.orcamento.http.client.ApacheHttpClient;
import junit.framework.TestCase;

import java.math.BigDecimal;

public class RegistrarOrcamentoServiceTest extends TestCase {

    public void testDeveriaRegistrarOrcamentoApi() {

        Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 1);
        orcamento.emAnalise();
        orcamento.aprovar();
        orcamento.finalizar();

        RegistrarOrcamentoService registrarOrcamentoService = new RegistrarOrcamentoService(new ApacheHttpClient());
        registrarOrcamentoService.registrar(orcamento);

    }
}
