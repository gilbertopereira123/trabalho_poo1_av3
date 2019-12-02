package Entidades;


import java.util.Date;
import java.util.List;
import java.util.Random;

public class Pedido {
	
	private int id;
	private Date instante;
	private Cliente cliente;
	private Endereco enderecoEntrega;
	private Pagamento pagamento;
	private List<Produto>produto;
	
	public Pedido(int id, Date instante,Cliente cliente, Endereco enderecoEntrega, Pagamento pagamento) {
		super();
		this.id = id;
		this.instante = instante;
		this.cliente = cliente;
		this.enderecoEntrega = enderecoEntrega;
		this.pagamento = pagamento;
	}
	
	public Pedido() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getInstante() {
		return instante;
	}
	public void setInstante(Date instante) {
		this.instante = instante;
	}
	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido\n id= " + id + "\n instante=" + instante + "\n cliente=" + cliente + "\n enderecoEntrega="
				+ enderecoEntrega + "\n pagamento=" + pagamento.getEstado() + "\n produto=" + produto;
	}
	
	

}
