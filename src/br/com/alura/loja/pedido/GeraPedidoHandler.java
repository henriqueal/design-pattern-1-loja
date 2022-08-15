package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;
import br.com.alura.loja.pedido.acao.EnviaEmailAcao;
import br.com.alura.loja.pedido.acao.SalvaPedidoNoBancaoAcao;

public class GeraPedidoHandler {

	List<AcaoAposGerarPedido> listaAcoes;
	
	// injecao de dependencias para servicos de infra
	public GeraPedidoHandler(List<AcaoAposGerarPedido> listaAcoes) {
		this.listaAcoes = listaAcoes;
	}

	public void executar(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

		for(AcaoAposGerarPedido acao : listaAcoes){
			acao.executar(pedido);
		}
	}
	
}
