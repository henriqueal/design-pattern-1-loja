package br.com.alura.loja.orcamento;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacaoOrcamento;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacaoOrcamento = new EmAnalise();
    }

    public void aplicarDescontoExtra(){
        this.valor = this.valor.subtract(this.situacaoOrcamento.calcularValorDescontoExtra(this));
    }

    public void aprovar() {
        this.situacaoOrcamento.aprovar(this);
    }

    public void reprovar() {
        this.situacaoOrcamento.aprovar(this);
    }
    
    public void finalizar() {
        this.situacaoOrcamento.aprovar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens(){
        return quantidadeItens;
    }

    public void setSituacao(SituacaoOrcamento situacaoOrcamento){
        this.situacaoOrcamento = situacaoOrcamento;
    }

}
