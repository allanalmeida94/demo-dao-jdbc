package db;

//Classe criada para tratamento de excessão 
//class to treat excesses

public class DbException extends RuntimeException {

	/**
	 * 
	 */
	//Versão
	//Version
	
	private static final long serialVersionUID = 1L;
	
	//Criando método que receberá uma string "msg" e transmitirá a super Classe RuntimeException
	//Creating method that will recive a string "msg" and will transmit the super RuntimeException class 
	public DbException(String msg) {
		super(msg);
	}
}
