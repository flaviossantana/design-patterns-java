package io.com.store.pedido;

import io.com.store.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {

    private final String nome;
    private final LocalDateTime data;
    private final Orcamento orcamento;

    public Pedido(String nome, LocalDateTime data, Orcamento orcamento) {
        this.nome = nome;
        this.data = data;
        this.orcamento = orcamento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
