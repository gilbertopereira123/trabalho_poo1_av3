package Entidades;

import java.util.Random;

public class PagamentoCredito extends Pagamento{
	
	private Random parcelas;

	public PagamentoCredito(Random id, StatusPagamento estado, Random parcelas) {
		super(id, estado);
		this.parcelas = parcelas;
	}
	
	public PagamentoCredito() {
		
	}

	public Random getParcelas() {
		return parcelas;
	}

	public void setParcelas(Random parcelas) {
		this.parcelas = parcelas;
	}
	
	

}
