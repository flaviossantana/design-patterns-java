package io.com.store.orcamento.http.client;

import io.com.store.orcamento.http.HttpAdapter;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApacheHttpClient implements HttpAdapter {

    Logger logger = Logger.getLogger(ApacheHttpClient.class.getName());

    @Override
    public void post(String url, Map<String, Object> dados) {
        logger.info("Enviando dados para API");
        logger.log(Level.INFO, "URL: {0}",  url);
        logger.log(Level.INFO, "Dados: {0}",  dados);
    }
}
