package Entidades;

import java.util.Date;
import java.util.Random;

public class PagamentoBoleto extends Pagamento{
	
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoBoleto(int id, StatusPagamento estado, Date dataVencimento, Date dataPagamento) {
		super(id, estado);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}
	
	public PagamentoBoleto() {
		
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	@Override
	public String toString() {
		return "PagamentoBoleto \n dataVencimento=" + dataVencimento + "\n dataPagamento=" + dataPagamento;
	}
	
	

}
