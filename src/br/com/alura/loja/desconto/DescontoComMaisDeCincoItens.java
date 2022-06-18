package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoComMaisDeCincoItens extends Desconto{

    DescontoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    protected boolean deveCalcular(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
