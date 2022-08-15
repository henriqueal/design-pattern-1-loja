package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviaEmailAcao;
import br.com.alura.loja.pedido.acao.SalvaPedidoNoBancaoAcao;

public class GeraPedidoHandler {
	
	// injecao de dependencias para servicos de infra
	public GeraPedidoHandler() {
	}

	public void executar(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

		EnviaEmailAcao enviaEmailAcao = new EnviaEmailAcao();
		enviaEmailAcao.executar(pedido);

		SalvaPedidoNoBancaoAcao salvaPedidoNoBancaoAcao = new SalvaPedidoNoBancaoAcao();
		salvaPedidoNoBancaoAcao.executar(pedido);

	}
	
}
