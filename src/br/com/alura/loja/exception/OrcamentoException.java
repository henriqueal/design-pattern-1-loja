package br.com.alura.loja.exception;

import br.com.alura.loja.orcamento.Orcamento;

public class OrcamentoException extends RuntimeException{
    public OrcamentoException(String message){
        super(message);
    }
}
