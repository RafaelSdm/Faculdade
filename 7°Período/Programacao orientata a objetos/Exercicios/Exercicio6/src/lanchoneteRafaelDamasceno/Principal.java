package lanchoneteRafaelDamasceno;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	
	public static Double calculoPedido(List<String> itens, ArrayList<Pizza> listaPizza, ArrayList<Salgadinho> listaSalgadinho, ArrayList<Lanche> listaLanhce) {
		
		Double valorTotal = 0.0;
		for(int i  =0; i < itens.size(); i++) {
			//System.out.println(itens.get(i));
			
			for(Pizza pz : listaPizza) {
				//System.out.println(pz.getNomePrato());
				if(itens.get(i) == pz.getNomePrato()) {
					System.out.println("os pratos possuem o mesmo nome - nome da lista do cliente: " + itens.get(i) + " nome que está na lista de pedidos " + pz.getNomePrato());
					valorTotal = valorTotal + pz.getPreco();
				}
			}
			
			for(Salgadinho sg: listaSalgadinho) {
				//System.out.println(sg.getNomePrato());
				if(itens.get(i) == sg.getNomePrato()) {
					System.out.println("os pratos possuem o mesmo nome - nome da lista do cliente: " + itens.get(i) + " nome que está na lista de pedidos " + sg.getNomePrato());
					valorTotal = valorTotal + sg.getPreco();

				}
			}
			
			for(Lanche lc: listaLanhce) {
				//System.out.println(lc.getNomePrato());
				if(itens.get(i) == lc.getNomePrato()) {
					System.out.println("os pratos possuem o mesmo nome - nome da lista do cliente: " + itens.get(i) + " nome que está na lista de pedidos " + lc.getNomePrato());
					valorTotal = valorTotal + lc.getPreco();

				}
			}
		}
		
		
		return valorTotal;
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Pizza> listaPizza = new ArrayList<Pizza>();
		ArrayList<Salgadinho> listaSalgadinho = new ArrayList<Salgadinho>();
		ArrayList<Lanche> listaLanche = new ArrayList<Lanche>();
		//ArrayList<Lanche> listaLanche = new ArrayList<Lanche>();

		
		
		Double valorTotal;

		

		
		Pizza pizza = new Pizza("Pizza Portuguesa", 40.0, "23/10/2023", 1.0, "Ervilhas, milho, queijo, presunto, calabresa, oregano", "catupiry", "tomate" );
		
		listaPizza.add(pizza);
		
		
		pizza = new Pizza("Pizza com cheedar", 60.0, "22/10/2023", 1.0, "Frango com cheedar", "cheedar", "branco" );
		//String nomePrato, Double preco, String dataValidade, Double peso, String recheios, String borda,
		//String molho
		listaPizza.add(pizza);
		
		
		Salgadinho salgado =  new Salgadinho("Empada de bacon com calabresa", 10.0, "22/03/2023", 250.0, "Massa integral", "calabresa e bacon", "assado");
		
		listaSalgadinho.add(salgado);
		
		salgado =  new Salgadinho("Coxinha de frango com catupiry", 12.0, "22/03/2023", 450.0, "Massa de farinha de rosca", "frango com catupiry", "frito");
		//String nomePrato, Double preco, String dataValidade, Double peso, String tipoMassa,
		//String recheio
		
		listaSalgadinho.add(salgado);
		
		
		Lanche lanche = new Lanche("Sanduíche completo", 20.0, "24/03/2023", 500.0, "Pão de forma", "Pão com carne de boi, presunto, mussarela, alface e tomate", "molho de tomate");
		
		listaLanche.add(lanche);
		
		lanche = new Lanche("Hamburguer assado", 15.0, "26/03/2023", 700.0, "Pão de hamburguer", "Pão com carne, presunto, mussarela e tomate", "molho de maionese");
		
		listaLanche.add(lanche);
		
		
		System.out.println("*************************CARDÁDIO DA NOSSA LANCHONETE*****************************");
		
		System.out.println();
		System.out.println();
		System.out.println("LISTA DE OFERTAS DAS NOSSAS PIZZAS");
		
		System.out.println();
		System.out.println();
		for(Pizza pz: listaPizza) {
			System.out.println("" + pz.getNomePrato() + " ------------------------- R$ " + pz.getPreco());
			System.out.println("Ingredientes: " + pz.getRecheios());
			System.out.println();
		}
		
		
	
		System.out.println("LISTA DE OFERTAS DOS NOSSOS LANCHES");
		System.out.println();
		System.out.println();

		for(Lanche lc: listaLanche) {
			System.out.println("" + lc.getNomePrato() + " ------------------------- R$ " + lc.getPreco());
			System.out.println("Ingredientes: " + lc.getRecheio());
			System.out.println();

		}
		
		
		
		System.out.println("LISTA DE OFERTAS DOS NOSSOS SALGADOS");
		System.out.println();
		System.out.println();

		for(Salgadinho sg: listaSalgadinho) {
			System.out.println("" + sg.getNomePrato() + " ------------------------- R$ " + sg.getPreco());
			System.out.println("Ingredientes: " + sg.getRecheio());
			System.out.println();


		}
		
		
		//new String[] {"a", "b"};
		List<String> testelista = List.of("Hamburguer assado", "Sanduíche completo", "Pizza Portuguesa", "Empada de bacon com calabresa");
		
		
		
		Pedido pedido = new Pedido("Rafael", testelista, 220.0, 290.0, 70.0, 10.0);
		
		System.out.println("kdmkmmkfmkkkkkkkkkkkk");
		
		//pedido.teste(testelista);
		System.out.println("fodase main 2");
		Double resultado = calculoPedido(testelista, listaPizza, listaSalgadinho, listaLanche );
		//System.out.println(pedido.getNomeCliente());
		//String nomeCliente, List<String> itensVendidos, Double valorTotal, Double valorRecebido,
				//Double troco, Double taxaServico
		System.out.println("o valor total do pedido do cliente foi de: " + resultado);
		//String nomePrato, Double preco, String dataValidade, Double peso, String tipoPao, String recheio,
		//String molho
		

		
	}
	

}
