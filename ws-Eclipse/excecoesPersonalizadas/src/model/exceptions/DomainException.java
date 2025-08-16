package model.exceptions;

public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;
	
	// permitir que vc possa instanciar a exceção perosnalizada passando uma mensagem pra ela
	public DomainException(String msg) {
		super(msg);
	}
}
