package Entidades;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Estado {
	
	private int id;
	private String nome;
	private List<Cidade> cidades = new ArrayList();
	
	public Estado(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public Estado() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	@Override
	public String toString() {
		return "Estado \n id=" + id + "\n nome=" + nome;
	}

	
	
	
	
	


}
