package Entidades;

import java.util.Random;

public class ItemPedido {
	
	private double desconto;
	private int quantidade;
	private double preco;
	
	
	public ItemPedido(double desconto, int quantidade, double preco) {
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


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "ItemPedido \ndesconto=" + desconto + ","
				+ "\n quantidade=" + quantidade + "\n preco=" + preco;
	}
	
	
	
	
	

}
