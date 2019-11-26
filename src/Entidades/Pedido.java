package Entidades;


import java.util.Date;
import java.util.List;
import java.util.Random;

public class Pedido {
	
	private Random id;
	private Date instante;
	private Endereco enderecoEntrega;
	private Pagamento pagamento;
	private List<Produto>produto;
	
	public Pedido(Random id, Date instante, Endereco enderecoEntrega, Pagamento pagamento, List<Produto> produto) {
		super();
		this.id = id;
		this.instante = instante;
		this.enderecoEntrega = enderecoEntrega;
		this.pagamento = pagamento;
		this.produto = produto;
	}
	
	public Pedido() {
		
	}
	
	public Random getId() {
		return id;
	}
	public void setId(Random id) {
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
	
	

}
