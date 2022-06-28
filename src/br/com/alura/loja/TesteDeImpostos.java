package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDeImpostos {
    public static void main(String[] args) { 
        CalculadoraDeDesconto cadeiaDeDescontos = new CalculadoraDeDesconto();
        System.out.println(cadeiaDeDescontos.calcular(new Orcamento(new BigDecimal("200"), 6)));
        System.out.println(cadeiaDeDescontos.calcular(new Orcamento(new BigDecimal("1000"), 1)));
        Orcamento orcamento = new Orcamento(new BigDecimal("500"), 6);
        orcamento.aplicarDescontoExtra();
        System.out.println(orcamento.getValor());
        System.out.println(cadeiaDeDescontos.calcular(orcamento));

    }
}
