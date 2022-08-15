package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviaEmailAcao implements AcaoAposGerarPedido{
    public void executar(Pedido pedido){
        System.out.println("Enviando email para cliente sobre pedido...");
    }
}
