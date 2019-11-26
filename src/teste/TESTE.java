package teste;

import java.util.ArrayList;

import Entidades.*;


public class TESTE {
	
	public static void main(String[] args) {
		
		
		ArrayList<Endereco> end = new ArrayList();
		
		
		
		Endereco end1 = new Endereco(1,"rua 3 de maio",235,"casa 3a","Bela Vista","60440580",cd1);
		Endereco end2 = new Endereco(2,"Rua Silva Bueno",222,"sala 6069","Ipiranga","04208002",cd2); 
		
		Categoria cat = new Categoria();
		
		Estado est1 = new Estado(1,"Ceara");
		Estado est2 = new Estado(2,"Sao Paulo");
		
		Cidade cd1 = new Cidade(1,"Fortaleza",est1);
		Cidade cd2 = new Cidade(2,"Sao Paulo",est2);
		
		Cliente cl1 = new Cliente(1,"Zezin da Chica Boa","jose@gmail.com","65214725896",PESSOAFISICA);
		Cliente cl2 = new Cliente(2,"Jucileudo Filho","juju@gmail.com","65214725896",PESSOAFISICA);
		
		
		System.out.println(cat.toString());
		
		Arrays.asList();
		

		
	}
	

}
