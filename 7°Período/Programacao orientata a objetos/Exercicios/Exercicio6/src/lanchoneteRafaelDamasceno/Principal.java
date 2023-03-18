package lanchoneteRafaelDamasceno;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		ArrayList<Pizza> listaPizza = new ArrayList<Pizza>();
		ArrayList<Salgadinho> listaSalgadinho = new ArrayList<Salgadinho>();
		ArrayList<Lanche> listaLanche = new ArrayList<Lanche>();


		

		
		Pizza pizza = new Pizza("Pizza Portuguesa", 40.0, "23/10/2023", 1.0, "Ervilhas, milho, queijo, presunto, calabresa, oregano", "catupiry", "tomate" );
		
		listaPizza.add(pizza);
		
		
		pizza = new Pizza("Pizza com cheedar", 60.0, "22/10/2023", 1.0, "Frango com cheedar", "cheedar", "branco" );
		//String nomePrato, Double preco, String dataValidade, Double peso, String recheios, String borda,
		//String molho
		listaPizza.add(pizza);
		
		
		Salgadinho salgado =  new Salgadinho("Empada de bacon com calabresa", 10.0, "22/03/2023", 250.0, "Massa integral", "calabresa e bacon");
		
		listaSalgadinho.add(salgado);
		
		salgado =  new Salgadinho("Coxinha de frango com catupiry", 12.0, "22/03/2023", 450.0, "Massa de farinha de rosca", "frango com catupiry");
		//String nomePrato, Double preco, String dataValidade, Double peso, String tipoMassa,
		//String recheio
		
		listaSalgadinho.add(salgado);
		
		
		Lanche lanche = new Lanche("Sanduíche completo", 20.0, "24/03/2023", 500.0, "Pão de forma", "Pão com carne de boi, presunto, mussarela, alface e tomate", "molho de tomate");
		
		listaLanche.add(lanche);
		
		lanche = new Lanche("Hamburguer assado", 15.0, "26/03/2023", 700.0, "Pão de hamburguer", "Pão com carne, presunto, mussarela e tomate", "molho de maionese");
		
		listaLanche.add(lanche);
		
		
		System.out.println("---------------------CARDÁDIO DA NOSSA LANCHONETE --------------------");
		
		
		System.out.println("--------------------LISTA DE OFERTAS DAS NOSSAS PIZZAS ------------");
		for(Pizza pz: listaPizza) {
			System.out.println("" + pz.getNomePrato() + " ------------------------- R$ " + pz.getPreco());
			System.out.println("Ingredientes: " + pz.getRecheios());
			System.out.println("----------------------------------------------------------------------------");
		}
		
		
	
		System.out.println("--------------------LISTA DE OFERTAS DOS NOSSOS LANCHES ------------");

		for(Lanche lc: listaLanche) {
			System.out.println("" + lc.getNomePrato() + " ------------------------- R$ " + lc.getPreco());
			System.out.println("Ingredientes: " + lc.getRecheio());
			System.out.println("----------------------------------------------------------------------------");
		}
		
		
		
		System.out.println("--------------------LISTA DE OFERTAS DOS NOSSOS SALGADOS ------------");

		for(Salgadinho sg: listaSalgadinho) {
			System.out.println("" + sg.getNomePrato() + " ------------------------- R$ " + sg.getPreco());
			System.out.println("Ingredientes: " + sg.getRecheio());
			System.out.println("----------------------------------------------------------------------------");


		}
		
		
		//String nomePrato, Double preco, String dataValidade, Double peso, String tipoPao, String recheio,
		//String molho
		

		
	}
	

}
