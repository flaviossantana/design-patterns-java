package io.com.store.orcamento.state;

import io.com.store.orcamento.Orcamento;
import io.com.store.orcamento.exception.SituacaoOrcamentoException;

import java.math.BigDecimal;

public class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new SituacaoOrcamentoException("Orcamentos não pode ser aprovado");
    }
    public void reprovar(Orcamento orcamento){
        throw new SituacaoOrcamentoException("Orcamentos não pode ser reprovado");
    }
    public void finalizar(Orcamento orcamento){
        throw new SituacaoOrcamentoException("Orcamentos não pode ser finalizado!");
    }
}
