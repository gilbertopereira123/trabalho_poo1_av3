package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import Entidades.*;


public class TESTE {
	
	public static void main(String[] args) {
		
		TipoCliente ps = TipoCliente.PESSOAFISICA;
		TipoCliente pf = TipoCliente.PESSOAJURIDICA;
		
		StatusPagamento can = StatusPagamento.CANCELADO;
		StatusPagamento pen = StatusPagamento.PENDENTE;
		StatusPagamento qui =StatusPagamento.QUITADO;
		
		SimpleDateFormat data1 = new SimpleDateFormat("28/02/2019");
		SimpleDateFormat data2 = new SimpleDateFormat("17/05/2019");
		
		List<String> tel1 = new ArrayList<String>();
		tel1.add(0,"1324-7987");
		tel1.add(1,"9856-1687");
		
		//for(String contato: tel1){
	   // System.out.println(contato);	
	//}
		
		
		//ArrayList<Endereco> end = new ArrayList();
		
		Estado est1 = new Estado(1,"Ceara");
		Estado est2 = new Estado(2,"Sao Paulo");
		
		System.out.println(est1.toString()+"\n++++++++++++++++++++");
		System.out.println(est2.toString()+"\n++++++++++++++++++++");
		
		Cidade cd1 = new Cidade(1,"Fortaleza",est1);
		Cidade cd2 = new Cidade(2,"Sao Paulo",est2);
		
		System.out.println(cd1.toString()+"\n++++++++++++++++++++");
		System.out.println(cd2.toString()+"\n++++++++++++++++++++");
		
		Endereco end1 = new Endereco(1,"rua 3 de maio","235","casa 3a","Bela Vista","60440580",cd1);
		Endereco end2 = new Endereco(2,"Rua Silva Bueno","222","sala 6069","Ipiranga","04208002",cd2); 
		Endereco end3 = new Endereco(2,"Rua domingo olimpio","2451","sala 5962","Centro","04208002",cd2); 
		
		System.out.println(end1.toString()+"\n++++++++++++++++++++");
		System.out.println(end2.toString()+"\n++++++++++++++++++++");
		System.out.println(end3.toString()+"\n++++++++++++++++++++");
		
		Pagamento pag1 = new Pagamento(1,null);
		Pagamento pag2 = new Pagamento(2,null);
		
		Cliente cl1 = new Cliente(1,"Zezin da Chica Boa","jose@gmail.com","65214725896",ps);
		Cliente cl2 = new Cliente(2,"Jucileudo Filho","juju@gmail.com","65214725896",pf);
		
		System.out.println(cl1.toString()+"\n++++++++++++++++++++");
		System.out.println(cl2.toString()+"\n++++++++++++++++++++");
		
		Pedido ped1 = new Pedido(1,null,cl1,end1,pag1);
		Pedido ped2 = new Pedido(2,null,cl2,end2,pag2);
		
		System.out.println(ped1.toString()+"\n++++++++++++++++++++");
		System.out.println(ped2.toString()+"\n++++++++++++++++++++");
		
		PagamentoCredito pagcred1 = new PagamentoCredito(1, qui,6);
		PagamentoBoleto pagbole2 = new PagamentoBoleto(2,pen,null,null);
		
		System.out.println(pagcred1.toString()+"\n++++++++++++++++++++");
		System.out.println(pagbole2.toString()+"\n++++++++++++++++++++");
				
		ItemPedido ip1 = new ItemPedido(10.00,1, 1500.00);
		ItemPedido ip2 = new ItemPedido(15.00,2, 350.00);
		ItemPedido ip3 = new ItemPedido(50.00,1, 600.00);
		ItemPedido ip4 = new ItemPedido(50.00,1, 30000.00);
		ItemPedido ip5 = new ItemPedido(50.00,1, 350.00);		
		
		System.out.println(ip1.toString()+"\n++++++++++++++++++++");
		System.out.println(ip2.toString()+"\n++++++++++++++++++++");
		System.out.println(ip3.toString()+"\n++++++++++++++++++++");
		System.out.println(ip4.toString()+"\n++++++++++++++++++++");
		System.out.println(ip5.toString()+"\n++++++++++++++++++++");
		
		
		Produto p1 = new Produto(1,"notebook",1500.00);
		Produto p2 = new Produto(2,"impressora",350.00);
		Produto p3 = new Produto(3,"cooktop",600.00);
		Produto p4 = new Produto(4,"SmartTv",1500.00);
		Produto p5 = new Produto(5,"PlayStation4",2500.00);
		
		System.out.println(p1.toString()+"\n++++++++++++++++++++");
		System.out.println(p2.toString()+"\n++++++++++++++++++++");
		System.out.println(p3.toString()+"\n++++++++++++++++++++");
		System.out.println(p4.toString()+"\n++++++++++++++++++++");
		System.out.println(p5.toString()+"\n++++++++++++++++++++");
		
		Categoria cat1 = new Categoria(1,"informatica");
		Categoria cat2 = new Categoria(2,"escritorio");
		Categoria cat3 = new Categoria(3,"cozinha");
		Categoria cat4 = new Categoria(4,"TV");
		Categoria cat5 = new Categoria(5,"Games");
		
		System.out.println(cat1.toString()+"\n++++++++++++++++++++");
		System.out.println(cat2.toString()+"\n++++++++++++++++++++");
		System.out.println(cat3.toString()+"\n++++++++++++++++++++");
		System.out.println(cat4.toString()+"\n++++++++++++++++++++");
		System.out.println(cat5.toString()+"\n++++++++++++++++++++");
		
		//Arrays.asList();
		

		
	}
	

}
