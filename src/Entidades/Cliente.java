package Entidades;

import java.util.List;
import java.util.Random;

public class Cliente {
	
	private Random id;
	private String nome;
	private String email;
	private String cpfOUCnpj;
	private TipoCliente tipo ;
	private List<String> telefones;
	private List<Endereco> endereco;
	
	
	public Cliente(Random id, String nome, String email, String cpfOUCnpj, TipoCliente tipo, List<String> telefones,
			List<Endereco> endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfOUCnpj = cpfOUCnpj;
		this.tipo = tipo;
		this.telefones = telefones;
		this.endereco = endereco;
	}
	
	public Cliente() {
		
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

	
	
	
	
}
