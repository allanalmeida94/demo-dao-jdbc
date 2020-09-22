package db;

//Classe criada para tratamento de excess�o 
//class to treat excesses

public class DbException extends RuntimeException {

	/**
	 * 
	 */
	//Vers�o
	//Version
	
	private static final long serialVersionUID = 1L;
	
	//Criando m�todo que receber� uma string "msg" e transmitir� a super Classe RuntimeException
	//Creating method that will recive a string "msg" and will transmit the super RuntimeException class 
	public DbException(String msg) {
		super(msg);
	}
}
