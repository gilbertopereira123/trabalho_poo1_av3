package Entidades;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		if (estado != other.estado)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pagamento \nid=" + id + "\n estado=" + estado;
	}
	
	

}
