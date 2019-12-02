package Entidades;

import java.util.List;
import java.util.Random;

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	private String cpfOUCnpj;
	private TipoCliente tipo ;
	private List<String> telefones;
	private List<Endereco> endereco;
	
	
	public Cliente(int id, String nome, String email, String cpfOUCnpj, TipoCliente tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfOUCnpj = cpfOUCnpj;
		this.tipo = tipo;

	}
	
	public Cliente() {
		
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCpfOUCnpj() {
		return cpfOUCnpj;
	}


	public void setCpfOUCnpj(String cpfOUCnpj) {
		this.cpfOUCnpj = cpfOUCnpj;
	}


	public TipoCliente getTipo() {
		return tipo;
	}


	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}


	public List<String> getTelefones() {
		return telefones;
	}


	public void setTelefones(List<String> telefones) {
		this.telefones = telefones;
	}


	public List<Endereco> getEndereco() {
		return endereco;
	}


	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente \n"
				+ "id = " + id + "\n nome=" + nome + "\n email=" + email + "\n cpfOUCnpj=" + cpfOUCnpj + "\n tipo="
				+ tipo;
	}

	
	
	
	
}
