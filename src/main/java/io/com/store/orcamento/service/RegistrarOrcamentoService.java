package io.com.store.orcamento.service;

import io.com.store.orcamento.Orcamento;
import io.com.store.orcamento.exception.SituacaoOrcamentoException;
import io.com.store.orcamento.http.APIOrcamento;
import io.com.store.orcamento.http.HttpAdapter;

import java.util.Map;

public class RegistrarOrcamentoService {


    private HttpAdapter httpAdapter;

    public RegistrarOrcamentoService(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {

        if (!orcamento.isFinalizado()) {
            throw new SituacaoOrcamentoException("Orcamento não finalizado");
        }


        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );

        this.httpAdapter.post(APIOrcamento.REGISTRAR.path(), dados);
    }

}
