package Entidades;

import java.util.Random;

public class Produto {
	
	private Random id;
	private String nome;
	private double preco;
	
	public Produto(Random id, String nome, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto() {
		
	}
	
	public Random getId() {
		return id;
	}
	public void setId(Random id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	

}
