package lanchoneteRafaelDamasceno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	/*
	
	public static Double calculoPersonalizado(ArrayList<Pizza>) {
		
		
	}
	
	*/
	
	
	public static int verificaPizzaPersonalizada() {
		Scanner entrada = new Scanner(System.in);
		int opcaoPizza;
		System.out.println("Voce deseja fazer uma pizza personalizada?");
		System.out.println("[1] - SIM");
		System.out.println("[2] - NÃO");
		opcaoPizza = entrada.nextInt();
		entrada.nextLine();


		if(opcaoPizza == 1) {
	
			return 1;
		}else {
			return 2;
		}
		
	}
	
	
	
	public static Pizza pizzaPersonalizada(String nomePizza, String borda, String molho, Double preco) {
		Pizza pizza = new Pizza(nomePizza, preco, "23/10/2023", 1.0, "Ervilhas, milho, queijo, presunto, calabresa, oregano", borda, molho );

		return pizza;
	}
	
	
	public static Double calculoPedido(List<String> itens, ArrayList<Pizza> listaPizza, ArrayList<Salgadinho> listaSalgadinho, ArrayList<Lanche> listaLanhce) {
		Scanner entrada = new Scanner(System.in);
		Double valorTotal = 0.0;
		int opcao = 0;
		int opcaoPizza;
		
		for(int i  =0; i < itens.size(); i++) {
			//System.out.println(itens.get(i));
			
			for(Pizza pz : listaPizza) {
				//System.out.println(pz.getNomePrato());
				if(itens.get(i) == pz.getNomePrato()) {
					//System.out.println("os pratos possuem o mesmo nome - nome da lista do cliente: " + itens.get(i) + " nome que está na lista de pedidos " + pz.getNomePrato());
					valorTotal = valorTotal + pz.getPreco();
				}
			}
			
			for(Salgadinho sg: listaSalgadinho) {
				//System.out.println(sg.getNomePrato());
				if(itens.get(i) == sg.getNomePrato()) {
					//System.out.println("os pratos possuem o mesmo nome - nome da lista do cliente: " + itens.get(i) + " nome que está na lista de pedidos " + sg.getNomePrato());
					valorTotal = valorTotal + sg.getPreco();

				}
			}
			
			for(Lanche lc: listaLanhce) {
				//System.out.println(lc.getNomePrato());
				if(itens.get(i) == lc.getNomePrato()) {
					//System.out.println("os pratos possuem o mesmo nome - nome da lista do cliente: " + itens.get(i) + " nome que está na lista de pedidos " + lc.getNomePrato());
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
		ArrayList<Pizza> listaPizzaPersonalizada = new ArrayList<Pizza>();
		//ArrayList<Lanche> listaLanche = new ArrayList<Lanche>();

		Scanner entrada = new Scanner(System.in);
		
		Double valorTotal;
		
		int opcaoPizza;
		Pizza pi;
		
		String pizzaPersonalizada;
		String nomePizzaP;
		Double precoPizzaP;
		String molhoPizzaP;
		String bordaPizzaP;
		
		//nomePizzaP, precoPizzaP, molhoPizzaP, bordaPizzaP
		
		Pizza pizza = new Pizza("Pizza Portuguesa", 40.0, "23/10/2023", 1.0, "Ervilhas, milho, queijo, presunto, calabresa, oregano", "borda comum", "tomate" );
		
		listaPizza.add(pizza);
		
		
		pizza = new Pizza("Pizza com cheedar", 60.0, "22/10/2023", 1.0, "Frango com cheedar", "borda comum", "branco" );
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
		
		//			testelista = List.of("Hamburguer assado", "Sanduíche completo", "Pizza Portuguesa", "Empada de bacon com calabresa");

		
		
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
		
		

		List<String> testelista;
		
		opcaoPizza = verificaPizzaPersonalizada();
		//String nomePizza, String borda, String molho, Double preco
		if(opcaoPizza == 1) {
			nomePizzaP =  "Pizza portuguesa com borda de queijo";
			precoPizzaP = 50.0;
			molhoPizzaP = null;
			bordaPizzaP = "queijo";
			pi = pizzaPersonalizada(nomePizzaP, bordaPizzaP, molhoPizzaP, precoPizzaP);
			listaPizza.add(pi);
			testelista = List.of("Hamburguer assado", "Sanduíche completo", "Pizza Portuguesa", "Empada de bacon com calabresa", nomePizzaP);


		}else {
			testelista = List.of("Hamburguer assado", "Sanduíche completo", "Pizza Portuguesa", "Empada de bacon com calabresa");

		}
		
		
		
		Pedido pedido = new Pedido("Rafael", testelista, calculoPedido(testelista, listaPizza, listaSalgadinho, listaLanche ), 500.0, null, 0.1);
		
		pedido.teste(testelista);

		//Double resultado = calculoPedido(testelista, listaPizza, listaSalgadinho, listaLanche );



		
		opcaoPizza = verificaPizzaPersonalizada();

		if(opcaoPizza == 1) {
			nomePizzaP =  "Pizza com catupiry com recheio de catupiry e molho pardo";
			precoPizzaP = 50.0;
			molhoPizzaP = "molho pardo";
			bordaPizzaP = "queijo";
			pi = pizzaPersonalizada(nomePizzaP, bordaPizzaP, molhoPizzaP, precoPizzaP);
			listaPizza.add(pi);
			testelista = List.of("Hamburguer assado", "Sanduíche completo", "Pizza Portuguesa", "Empada de bacon com calabresa", nomePizzaP);


		}else {
			testelista = List.of("Hamburguer assado", "Sanduíche completo", "Pizza Portuguesa", "Empada de bacon com calabresa");

		}

		
		pedido = new Pedido("Joao", testelista, calculoPedido(testelista, listaPizza, listaSalgadinho, listaLanche ), 290.0, null, 0.1);
				

		
		
		pedido.teste(testelista);
		
		
		
		
		

		
	}
	

}
