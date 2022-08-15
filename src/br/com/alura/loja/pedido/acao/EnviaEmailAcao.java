package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviaEmailAcao {
    public void executar(Pedido pedido){
        System.out.println("Enviando email para cliente sobre pedido...");
    }
}
