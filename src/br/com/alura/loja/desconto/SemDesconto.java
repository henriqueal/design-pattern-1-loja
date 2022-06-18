package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{

    SemDesconto() {
        super(null);
    }

    protected BigDecimal efetuarCalculo(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    protected boolean deveCalcular(Orcamento orcamento) {
        return true;
    }

}
