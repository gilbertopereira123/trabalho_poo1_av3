package Entidades;

import java.util.Random;

public class PagamentoCredito extends Pagamento{
	
	private int parcelas;

	public PagamentoCredito(int id, StatusPagamento estado, int parcelas) {
		super(id, estado);
		this.parcelas = parcelas;
	}
	
	public PagamentoCredito() {
		
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	@Override
	public String toString() {
		return "PagamentoCredito [parcelas=" + parcelas + "]";
	}
	
	

}
