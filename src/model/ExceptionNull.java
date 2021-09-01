package model;

import view.Mensagem;

public class ExceptionNull extends Exception{
	
	
	public ExceptionNull(String mensagem) {
		Mensagem.mensagemNull(mensagem);
	}
}
