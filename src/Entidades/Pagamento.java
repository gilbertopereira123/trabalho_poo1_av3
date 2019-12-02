package Entidades;

import java.util.Random;

public class Pagamento {
	
	private int id;
	private StatusPagamento estado;
	
	public Pagamento(int id, StatusPagamento estado) {
		super();
		this.id = id;
		this.estado = estado;
	}
	
	public Pagamento() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StatusPagamento getEstado() {
		return estado;
	}

	public void setEstado(StatusPagamento estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pagamento \nid=" + id + "\n estado=" + estado;
	}
	
	

}
