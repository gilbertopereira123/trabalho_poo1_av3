package Entidades;

import java.util.List;
import java.util.Random;

public class Cidade {

	private int id;;
	private String nome;
	private Estado estado;
    //private List<Endereco> endereco;
    
    public Cidade() {
	
	}
    
    
	
	
	public Cidade(int id, String nome, Estado estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.estado = estado;
	}


	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
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
	
	@Override
	public String toString() {
		return "Cidade \n id=" + id + "\n nome=" + nome;
	}
    
    
	
}
