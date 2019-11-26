package Entidades;

import java.util.Random;

public class Categoria {
	
	private Random id;
	private String nome;
	
	public Categoria() {
		
	}
	
	public Categoria(Random id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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

	@Override
	public String toString() {
		return "Categoria\n id=" + id + "\n nome=" + nome;
	

	}
	
	
	
}
