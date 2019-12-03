package Entidades;

import java.util.Random;

public class Endereco {

private int id;
private String logradouro;
private String numero;
private String complemento;
private String bairro;
private String cep;
private Cliente cliente;
private Cidade cidade;

public Endereco(int id, String logradouro, String numero, String complemento, String bairro, String cep,
		Cliente cliente, Cidade cidade) {
	super();
	this.id = id;
	this.logradouro = logradouro;
	this.numero = numero;
	this.complemento = complemento;
	this.bairro = bairro;
	this.cep = cep;
	this.cliente = cliente;
	this.cidade = cidade;
}

public Endereco() {
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLogradouro() {
	return logradouro;
}
public void setLogradouro(String logradouro) {
	this.logradouro = logradouro;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public String getComplemento() {
	return complemento;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public Cidade getCidade() {
	return cidade;
}
public void setCidade(Cidade cidade) {
	this.cidade = cidade;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}




@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
	result = prime * result + ((cep == null) ? 0 : cep.hashCode());
	result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
	result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
	result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
	result = prime * result + id;
	result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
	result = prime * result + ((numero == null) ? 0 : numero.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Endereco other = (Endereco) obj;
	if (bairro == null) {
		if (other.bairro != null)
			return false;
	} else if (!bairro.equals(other.bairro))
		return false;
	if (cep == null) {
		if (other.cep != null)
			return false;
	} else if (!cep.equals(other.cep))
		return false;
	if (cidade == null) {
		if (other.cidade != null)
			return false;
	} else if (!cidade.equals(other.cidade))
		return false;
	if (cliente == null) {
		if (other.cliente != null)
			return false;
	} else if (!cliente.equals(other.cliente))
		return false;
	if (complemento == null) {
		if (other.complemento != null)
			return false;
	} else if (!complemento.equals(other.complemento))
		return false;
	if (id != other.id)
		return false;
	if (logradouro == null) {
		if (other.logradouro != null)
			return false;
	} else if (!logradouro.equals(other.logradouro))
		return false;
	if (numero == null) {
		if (other.numero != null)
			return false;
	} else if (!numero.equals(other.numero))
		return false;
	return true;
}

@Override
public String toString() {
	return "Endereco\n id=" + id + "\n logradouro=" + logradouro + "\n numero=" + numero + "\n complemento=" + complemento
			+ "\n bairro=" + bairro + "\n cep=" + cep +"\n Cliente=" + cliente + "\n cidade=" + cidade.getNome();
}




}
