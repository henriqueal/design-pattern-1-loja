package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento){
        DescontoComMaisDeCincoItens descontoComMaisDeCincoItens = new DescontoComMaisDeCincoItens(
                new DescontoComMaisDeQuinhentosReais(
                        new SemDesconto()));

        return descontoComMaisDeCincoItens.calcular(orcamento);
    }
}
