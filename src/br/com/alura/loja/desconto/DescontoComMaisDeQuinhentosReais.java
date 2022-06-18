package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoComMaisDeQuinhentosReais extends Desconto{

    DescontoComMaisDeQuinhentosReais(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){

        return orcamento.getValor().multiply(new BigDecimal("0.05"));

    }

    protected boolean deveCalcular(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500") )> 0;
    }
}
