package io.com.store.orcamento;

import io.com.store.orcamento.state.EmAnalise;
import io.com.store.orcamento.state.Finalizado;
import io.com.store.orcamento.state.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private final List<ItemOrcamento> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public boolean isFinalizado() {
        return this.situacao instanceof Finalizado;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return this.itens.size();
    }

    public void adicionarItem(ItemOrcamento item) {
        this.itens.add(item);
        this.valor = this.valor.add(item.getValor());
    }

}
