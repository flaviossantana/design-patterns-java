package io.com.store.orcamento.http.client;

import io.com.store.orcamento.http.HttpAdapter;

import java.util.Map;

public class ApacheHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        System.out.println("Enviando dados para API");
        System.out.println("URL: " + url);
        System.out.println("Dados: " + dados);
    }
}
