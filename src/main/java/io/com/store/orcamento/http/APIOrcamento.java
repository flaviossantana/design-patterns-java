package io.com.store.orcamento.http;

public enum APIOrcamento {

    REGISTRAR("/orcamento/registrar");

    private String url;

    APIOrcamento(String url) {
        this.url = url;
    }

    public String path() {
        return url;
    }

}
