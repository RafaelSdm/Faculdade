package Exercicio4_RafaelDamasceno;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		
		ArrayList<Proprietario> listaProprietario = new ArrayList<Proprietario>();
		ArrayList<PertenceAnimal> listaPertenceAnimal = new ArrayList<PertenceAnimal>();
		ArrayList<Passaro> listaPassaro = new ArrayList<Passaro>();
		ArrayList<CaoGato> listaCaoGato = new ArrayList<CaoGato>();
		
		Proprietario proprietario = new Proprietario("Rafael", 1, "endereco1", "15307988680");
		listaProprietario.add(proprietario);
		
		proprietario = new Proprietario("Joazinho", 100, "endereco de teste", "15625857");
		listaProprietario.add(proprietario);
		
		
		proprietario = new Proprietario("Toninho", 600, "endereco de teste 2", "25896345877");
		listaProprietario.add(proprietario);
		
		proprietario = new Proprietario("Amarild0", 4500, "endereco de teste 3", "458789562");
		listaProprietario.add(proprietario);
		
		
		
		
		
		
		
		
		CaoGato caoGato = new CaoGato("gato", "branco", 20, "felino", "macho", 1 ,"pequeno", 22.58 );
				//String nome, String cor, Integer idade, String raca, String sexo, String porte, Double peso
		
		listaCaoGato.add(caoGato);
		
		caoGato = new CaoGato("cachorro", "rosa", 200, "felino", "macho", 2 ,"pequeno", 22.58 );
		//String nome, String cor, Integer idade, String raca, String sexo, String porte, Double peso

		listaCaoGato.add(caoGato);
		
		
		caoGato = new CaoGato("cachorro", "preto", 5, "felino", "femea", 6 ,"media", 22.58 );
		//String nome, String cor, Integer idade, String raca, String sexo, String porte, Double peso

		listaCaoGato.add(caoGato);
		
		
		caoGato = new CaoGato("cachorro", "rosa", 200, "felino", "macho", 26 ,"pequeno", 22.58 );
		//String nome, String cor, Integer idade, String raca, String sexo, String porte, Double peso

		listaCaoGato.add(caoGato);
		

		Passaro passaro = new Passaro("gabiao", "preto", 45, "aguia", "femea", 47, "456");
		listaPassaro.add(passaro);
		
		passaro = new Passaro("aguia", "preto", 45, "aguia", "femea", 56, "456");
		listaPassaro.add(passaro);
		
		
		
		PertenceAnimal pertence = new PertenceAnimal(1,1);
		
		listaPertenceAnimal.add(pertence);
		
		pertence = new PertenceAnimal(1,2);
		
		listaPertenceAnimal.add(pertence);
		
		pertence = new PertenceAnimal(100,6);
		
		listaPertenceAnimal.add(pertence);
		
		pertence = new PertenceAnimal(600,26);
		
		listaPertenceAnimal.add(pertence);
		
		pertence = new PertenceAnimal(4500,56);
		
		listaPertenceAnimal.add(pertence);
		
		pertence = new PertenceAnimal(4500,47);
		
		listaPertenceAnimal.add(pertence);
		

		
		
		
		

		
		System.out.println("INFORMACAO DO PROPRIETARIO");
		System.out.println("NOME"+ proprietario.getNome());
		System.out.println("CODCLI" + proprietario.getCodCli());
		System.out.println("ENDERECO" + proprietario.getEndereco());
		System.out.println("CPF"+ proprietario.getEndereco());
		
		
		System.out.println("-------------------------------------------");
		
		
		//System.out.println("INFORMACAO DO ANIMAL GATO");
		//System.out.println("NOME" + gato.getNome());
		//System.out.println("COR" + gato.getCor());
		//System.out.println("IDADE" + gato.getIdade());
		//System.out.println("PORTE" + gato.getPorte());
		//System.out.println("PESO" + gato.getPeso());
		//System.out.println("id animal" + gato.getCodAnimal());

		
		System.out.println("------------------------------------------");
		
		
		
		System.out.println("INFORMACAO DO PASSARO");
		System.out.println("NOME" + passaro.getNome());
		System.out.println("COR" + passaro.getCor());
		System.out.println("IDADE" + passaro.getIdade());
		System.out.println("PESO" + passaro.getRaca());
		System.out.println("NUMERO ANILHA"+passaro.getNumeroAnilha());
		System.out.println("id animal" + passaro.getCodAnimal());
		
		
		
		System.out.println("id da pessoa:" + pertence.getCodcli());
		System.out.println("id do animal" + pertence.getCodAnimal());
		
		
		
		
		int n = 10; // tamanho do vetor
		int v[] = new int[n]; // declaração e alocação de espaço para o vetor "v"
		int i; // índice ou posição

		// processando os "n" elementos do vetor "v"
		for (i=0; i<n; i++) {
		  v[i] = i;// na i-ésima posição do vetor "v" armazena o valor da variável "i"
		  System.out.println(v[i]);
		}
		
		
		
		int ifd = 0;
		System.out.println("lista de todos os donos:");
		for(ifd = 0; ifd < listaPertenceAnimal.size(); ifd++) {
			//System.out.println("INFORMACAO DO PROPRIETARIO ");
			//System.out.println("NOME "+ listaProprietario.get(i).getNome());
			//System.out.println("CODCLI " + listaProprietario.get(i).getCodCli());
			//System.out.println("ENDERECO " + listaProprietario.get(i).getEndereco());
			//System.out.println("CPF "+ listaProprietario.get(i).getEndereco());
			//System.out.println("-----------------------------------------------------");
			
		}
		
		//yem.out.println(vtor[new int[10];
		System.out.println(v[2]);
		
		
	}

}
