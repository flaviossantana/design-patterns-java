package io.com.store.orcamento;

import java.math.BigDecimal;

public class OrcamentoBuilder {

    private final Orcamento orcamento = new Orcamento();

    public static OrcamentoBuilder init() {
        return new OrcamentoBuilder();
    }

    public OrcamentoBuilder addItem(String valor) {
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal(valor)));
        return this;
    }

    public Orcamento build() {
        return this.orcamento;
    }
}
