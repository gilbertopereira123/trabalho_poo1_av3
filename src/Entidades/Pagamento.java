package Entidades;

import java.util.Random;

public class Pagamento {
	
	private Random id;
	private StatusPagamento estado;
	
	public Pagamento(Random id, StatusPagamento estado) {
		super();
		this.id = id;
		this.estado = estado;
	}
	
	public Pagamento() {
		
	}

	public Random getId() {
		return id;
	}

	public void setId(Random id) {
		this.id = id;
	}

	public StatusPagamento getEstado() {
		return estado;
	}

	public void setEstado(StatusPagamento estado) {
		this.estado = estado;
	}
	
	

}
