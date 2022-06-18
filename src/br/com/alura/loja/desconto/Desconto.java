package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto desconto;

    Desconto(Desconto proximo){
        desconto = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(deveCalcular(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return desconto.calcular(orcamento);
    }

    protected abstract boolean deveCalcular(Orcamento orcamento);
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
}
