package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto desconto;

    Desconto(Desconto proximo){
        desconto = proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
}
