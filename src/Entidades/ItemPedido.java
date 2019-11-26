package Entidades;

import java.util.Random;

public class ItemPedido {
	
	private double desconto;
	private Random quantidade;
	private double preco;
	
	
	public ItemPedido(double desconto, Random quantidade, double preco) {
		super();
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public ItemPedido() {
		
	}

	public double getDesconto() {
		return desconto;
	}


	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}


	public Random getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Random quantidade) {
		this.quantidade = quantidade;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
	

}
