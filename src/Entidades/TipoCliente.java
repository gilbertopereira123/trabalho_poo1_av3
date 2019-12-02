package Entidades;

public enum TipoCliente {
	
	PESSOAFISICA(1), PESSOAJURIDICA(2);

	public int tipoCliente;
	
	TipoCliente(int tipo){
		
		tipoCliente = tipo;
	}
}
