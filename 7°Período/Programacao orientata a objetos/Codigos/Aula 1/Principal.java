package ConceitosPOO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Principal {

	public static void main(String[] args) throws ParseException {
		//Criando objeto com construtor vazio
		Carro carro = new Carro(); //Criando um objeto carro
		
		//Criando o objeto com construtor com parâmetros
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date fabricacao = formato.parse("23/11/1986");
		Carro carro1 = new Carro("147", "Fiat", 12345, "Preto", 2, fabricacao);
		
		//Imprimindo as informações do carrodir
		
		
		System.out.println("Informações do Carro: \n");
		System.out.println("Nome: "+carro.getNome());
		System.out.println("Marca: "+carro.getMarca());
		System.out.println("Chassi: "+carro.getChassi());
		System.out.println("Cor: "+carro.getCor());
		System.out.println("Número de Portas: "+carro.getPortas());
		System.out.println("Data de Fabriação: "+carro.getFabricacao());
	
	
		System.out.println("\n\n\n\n");
		System.out.println("Informações do Carro1: \n");
		System.out.println("Nome: "+carro1.getNome());
		System.out.println("Marca: "+carro1.getMarca());
		System.out.println("Chassi: "+carro1.getChassi());
		System.out.println("Cor: "+carro1.getCor());
		System.out.println("Número de Portas: "+carro1.getPortas());
		System.out.println("Data de Fabriação: "+carro1.getFabricacao());
		
		//Manipulando os objetos com Gets e Sets
		
		carro.setNome("Fusca");
		carro.setMarca("VW");
		carro.setCor("Branca");
		carro.setChassi(654321);
		carro.setPortas(2);
		carro.setFabricacao(formato.parse("01/01/1950"));
		
		//Imprimindo as informações do carro após as alterações
		System.out.println("\n\n\n\n");
		System.out.println("Informações do Carro: \n");
		System.out.println("Nome: "+carro.getNome());
		System.out.println("Marca: "+carro.getMarca());
		System.out.println("Chassi: "+carro.getChassi());
		System.out.println("Cor: "+carro.getCor());
		System.out.println("Número de Portas: "+carro.getPortas());
		System.out.println("Data de Fabricação: "+formato.format(carro.getFabricacao()));

		System.out.println("Idade do carro: "+carro.idadeCarro(carro));
		System.out.println("Idade do carro1: "+carro1.idadeCarro(carro1));

	}

}
