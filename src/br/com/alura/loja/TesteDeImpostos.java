package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDeImpostos {
    public static void main(String[] args) { 
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
        System.out.println(calculadoraDeImposto.calcular(new Orcamento(new BigDecimal("100")), new ICMS()));
    }
}
