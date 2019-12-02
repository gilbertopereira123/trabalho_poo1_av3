package Entidades;

public enum StatusPagamento {
	
	PENDENTE(1),QUITADO(2),CANCELADO(3);
	
	public int status;
	
	StatusPagamento(int var){
		status = var;
	}

}
