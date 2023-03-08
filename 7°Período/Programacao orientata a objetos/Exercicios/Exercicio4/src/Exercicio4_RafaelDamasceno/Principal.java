package Exercicio4_RafaelDamasceno;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
	public static void main(String[] args) {
		
		ArrayList<Proprietario> listaProprietario = new ArrayList<Proprietario>();
		ArrayList<PertenceAnimal> listaPertenceAnimal = new ArrayList<PertenceAnimal>();
		ArrayList<Passaro> listaPassaro = new ArrayList<Passaro>();
		ArrayList<CaoGato> listaCaoGato = new ArrayList<CaoGato>();
		ArrayList<Animal> listaAnimal = new ArrayList<Animal>();
		
		
		
		Proprietario proprietario = new Proprietario("Rafael", 1, "endereco1", "15307988680");
		listaProprietario.add(proprietario);
		
		proprietario = new Proprietario("Joazinho", 100, "endereco de teste", "15625857");
		listaProprietario.add(proprietario);
		
		
		proprietario = new Proprietario("Toninho", 600, "endereco de teste 2", "25896345877");
		listaProprietario.add(proprietario);
		
		proprietario = new Proprietario("Amarild0", 4500, "endereco de teste 3", "458789562");
		listaProprietario.add(proprietario);
		
		
		
		
		
		
		
		
		CaoGato caoGato = new CaoGato("TUBIA", "branco", 20, "felino", "macho", 1 ,"pequeno", 22.58 );
				//String nome, String cor, Integer idade, String raca, String sexo, String porte, Double peso
		Animal animal = new Animal("TUBIA", "branco",20 ,"felino", "macho", 1);
		listaCaoGato.add(caoGato);
		
		listaAnimal.add(animal);
		
		caoGato = new CaoGato("FOSFORO", "rosa", 14, "felino", "macho", 2 ,"pequeno", 22.58 );
		//String nome, String cor, Integer idade, String raca, String sexo, String porte, Double peso
		animal = new Animal("FOSFORO", "rosa", 14, "felino", "macho", 2);
		listaCaoGato.add(caoGato);
		listaAnimal.add(animal);
		
		
		caoGato = new CaoGato("SPARK", "preto", 5, "felino", "femea", 6 ,"media", 22.58 );
		//String nome, String cor, Integer idade, String raca, String sexo, String porte, Double peso
		
		animal = new Animal("SPARK", "preto", 5, "felino", "femea", 6);
		listaCaoGato.add(caoGato);
		listaAnimal.add(animal);
		
		
		caoGato = new CaoGato("DOLLY", "rosa", 21, "felino", "macho", 26 ,"pequeno", 22.58 );
		//String nome, String cor, Integer idade, String raca, String sexo, String porte, Double peso
		
		animal = new Animal("DOLLY", "rosa", 21 , "felino", "macho", 26);
		listaCaoGato.add(caoGato);
		listaAnimal.add(animal);
		

		Passaro passaro = new Passaro("FENA", "preto", 9, "aguia", "femea", 47, "456");
		listaPassaro.add(passaro);
		animal = new Animal("FENA", "preto", 9, "aguia", "femea", 47);
		listaAnimal.add(animal);
		
		passaro = new Passaro("URIA", "preto", 7, "aguia", "femea", 56, "456");
		animal = new Animal("URIA", "preto", 7, "aguia", "femea", 56);
		listaPassaro.add(passaro);
		listaAnimal.add(animal);
		
		
		
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
		
		
		Collections.sort(listaAnimal);
		int k = 0;
		for(k = 0; k<listaAnimal.size(); k ++) {
			System.out.println("INFORMACAO DOS ANIMAIS");
			//System.out.println("NOME " + listaAnimal.get(k).getNome());
			//System.out.println("COR " + listaAnimal.get(k).getCor());
			System.out.println("IDADE " + listaAnimal.get(k).getIdade());
			//System.out.println("PORTE " + listaAnimal.get(k).getRaca());
			//System.out.println("PESO " + listaAnimal.get(k).getSexo());
			//System.out.println("id animal " +listaAnimal.get(k).getCodAnimal());
			//System.out.println("----------------------------------------------------------");
			

			
		}
		
		
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		
		/*
		for(Animal animalFor : listaAnimal) {
			//System.out.println(animalFor.getNome());
			//System.out.println(animalFor.getIdade());
			for(PertenceAnimal pertenceAn: listaPertenceAnimal) {
				//System.out.println("---------------------");
				//System.out.println("codigo animal");
				//System.out.println(pertenceAn.getCodAnimal());
				//System.out.println("codido da pessoa");
				//System.out.println(pertenceAn.getCodcli());
				//System.out.println("--------------------------");
				if(pertenceAn.getCodAnimal() == animalFor.getCodAnimal()) {
					//System.out.println("achou o animal nesssa merdaaaa");
					//System.out.println("o animal possui o id " + animalFor.getCodAnimal() + " e o pertence possui o id  "+ pertenceAn.getCodAnimal() + "e o id do ser humano é  " + pertenceAn.getCodcli());
	
					
				}
				
				for(Proprietario prop : listaProprietario) {
					if(prop.getCodCli() == pertence.getCodcli()) {
						System.out.println("------------------------------------------------------------------------");
						System.out.println("o dono do animal " + animalFor.getNome() + "do id animal " + animalFor.getCodAnimal() + "é o " + prop.getNome() + "com o id " + prop.getCodCli() + " e com o nome: " + prop.getNome());
					}else {
						System.out.println("teste de erro id prop " + prop.getCodCli() + " id pertence " + pertence.getCodcli());
					}
				}
					
				
			}
			
		}
		*/
		
		for(Animal animalFor : listaAnimal) {
			System.out.println("animal: "+ animalFor.getNome());
			for(PertenceAnimal pertenceAn: listaPertenceAnimal) {				
				for(Proprietario prop : listaProprietario) {
					if((prop.getCodCli() == pertenceAn.getCodcli() && animalFor.getCodAnimal() == pertenceAn.getCodAnimal()) ) {
						//System.out.println("------------------------------------------------------------------------");
						System.out.println("o dono do animal " + animalFor.getNome() + "do id animal " + animalFor.getCodAnimal() + "é o " + prop.getNome() + "com o id " + prop.getCodCli() + " e com o nome: " + prop.getNome());
					}else {
						System.out.println("teste de erro id prop " + prop.getCodCli() + " id pertence " + pertence.getCodcli());
					}
				}
					
				
			}
			
		}
		
		System.out.println("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
		
		for(Proprietario perAn : listaProprietario) {
			System.out.println(perAn.getNome());
		}
		

		
		
		
		
		
		
		
		/*
		
		System.out.println("INFORMACAO DO PROPRIETARIO");
		System.out.println("NOME"+ proprietario.getNome());
		System.out.println("CODCLI" + proprietario.getCodCli());
		System.out.println("ENDERECO" + proprietario.getEndereco());
		System.out.println("CPF"+ proprietario.getEndereco());
		
		
		System.out.println("-------------------------------------------");
		
		*/
		
		
		//System.out.println("INFORMACAO DO ANIMAL GATO");
		//System.out.println("NOME" + gato.getNome());
		//System.out.println("COR" + gato.getCor());
		//System.out.println("IDADE" + gato.getIdade());
		//System.out.println("PORTE" + gato.getPorte());
		//System.out.println("PESO" + gato.getPeso());
		//System.out.println("id animal" + gato.getCodAnimal());
		
		
		/*

		
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
		
		*/
		
		
		

		
		
		/*
		int i = 0;
		System.out.println("lista de todos os donos:");
		for(i = 0; i < listaPertenceAnimal.size(); i++) {
			//System.out.println("INFORMACAO DO PROPRIETARIO ");
			//System.out.println("NOME "+ listaProprietario.get(i).getNome());
			//System.out.println("CODCLI " + listaProprietario.get(i).getCodCli());
			//System.out.println("ENDERECO " + listaProprietario.get(i).getEndereco());
			//System.out.println("CPF "+ listaProprietario.get(i).getEndereco());
			//System.out.println("-----------------------------------------------------");
			
		}
		
		*/
		
		
	}
	

}
