package Exercicio4_RafaelDamasceno;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
	
	public static void main2(ArrayList<Animal> listaAnimal) {
		
		Collections.sort(listaAnimal,(Animal a1, Animal a2) -> a1.getNome().compareTo(a2.getNome()));
		
		for(Animal a: listaAnimal) {
			System.out.println(a.getNome());
		}
		
		
		
		
	}
	public static void main(String[] args) {
		
		ArrayList<Proprietario> listaProprietario = new ArrayList<Proprietario>();
		ArrayList<PertenceAnimal> listaPertenceAnimal = new ArrayList<PertenceAnimal>();
		ArrayList<Passaro> listaPassaro = new ArrayList<Passaro>();
		ArrayList<CaoGato> listaCaoGato = new ArrayList<CaoGato>();
		ArrayList<Animal> listaAnimal = new ArrayList<Animal>();
		
		
		
		Proprietario proprietario = new Proprietario("Rafael", 1, "endereco1", "15307988680");
		listaProprietario.add(proprietario);
		
		proprietario = new Proprietario("Joazinho", 2, "endereco de teste", "15625857");
		listaProprietario.add(proprietario);
		
		
		proprietario = new Proprietario("Toninho", 3, "endereco de teste 2", "25896345877");
		listaProprietario.add(proprietario);
		
		proprietario = new Proprietario("Amarild0", 4, "endereco de teste 3", "458789562");
		listaProprietario.add(proprietario);
		
		
		
		
		
		
		
		
		CaoGato caoGato = new CaoGato("TUBIA", "branco", 20, "felino", "macho", 7 ,"pequeno", 22.58 );
		Animal animal = new Animal("TUBIA", "branco",20 ,"felino", "macho", 7);
		listaCaoGato.add(caoGato);
		
		listaAnimal.add(animal);
		
		caoGato = new CaoGato("FOSFORO", "rosa", 14, "felino", "macho", 8 ,"pequeno", 22.58 );
		//String nome, String cor, Integer idade, String raca, String sexo, String porte, Double peso
		animal = new Animal("FOSFORO", "rosa", 14, "felino", "macho", 8);
		listaCaoGato.add(caoGato);
		listaAnimal.add(animal);
		
		
		caoGato = new CaoGato("SPARK", "preto", 5, "felino", "femea", 9 ,"media", 22.58 );
		//String nome, String cor, Integer idade, String raca, String sexo, String porte, Double peso
		
		animal = new Animal("SPARK", "preto", 5, "felino", "femea", 9);
		listaCaoGato.add(caoGato);
		listaAnimal.add(animal);
		
		
		caoGato = new CaoGato("DOLLY", "rosa", 21, "felino", "macho", 10 ,"pequeno", 22.58 );
		//String nome, String cor, Integer idade, String raca, String sexo, String porte, Double peso
		
		animal = new Animal("DOLLY", "rosa", 21 , "felino", "macho", 10);
		listaCaoGato.add(caoGato);
		listaAnimal.add(animal);
		

		Passaro passaro = new Passaro("FENA", "preto", 9, "aguia", "femea", 11, "456");
		listaPassaro.add(passaro);
		animal = new Animal("FENA", "preto", 9, "aguia", "femea", 11);
		listaAnimal.add(animal);
		
		passaro = new Passaro("URIA", "preto", 7, "aguia", "femea", 12, "456");
		animal = new Animal("URIA", "preto", 7, "aguia", "femea", 12);
		listaPassaro.add(passaro);
		listaAnimal.add(animal);
		
		
		
		PertenceAnimal pertence = new PertenceAnimal(1,7);
		
		listaPertenceAnimal.add(pertence);
		
		pertence = new PertenceAnimal(1,8);
		
		listaPertenceAnimal.add(pertence);
		
		pertence = new PertenceAnimal(1,9);
		
		listaPertenceAnimal.add(pertence);
		
		pertence = new PertenceAnimal(2,10);
		
		listaPertenceAnimal.add(pertence);
		
		pertence = new PertenceAnimal(3,11);
		
		listaPertenceAnimal.add(pertence);
		
		pertence = new PertenceAnimal(4,12);
		
		listaPertenceAnimal.add(pertence);
		
		
		Collections.sort(listaAnimal);
		
		
		int k = 0;
		for(k = 0; k<listaAnimal.size(); k ++) {
			System.out.println("INFORMACAO DOS ANIMAIS EM ORDEM CRESCENTE");
			System.out.println("NOME " + listaAnimal.get(k).getNome());
			System.out.println("COR " + listaAnimal.get(k).getCor());
			System.out.println("IDADE " + listaAnimal.get(k).getIdade());
			System.out.println("PORTE " + listaAnimal.get(k).getRaca());
			System.out.println("PESO " + listaAnimal.get(k).getSexo());
			System.out.println("id animal " +listaAnimal.get(k).getCodAnimal());
			System.out.println("----------------------------------------------------------");
			

			
		}
		
		
		
		//System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		
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
			System.out.println("Animal: "+ animalFor.getNome());
			//System.out.println("dono do bicho:");
			System.out.println();
			System.out.println();
			for(PertenceAnimal pertenceAn: listaPertenceAnimal) {
				if(animalFor.getCodAnimal() == pertenceAn.getCodAnimal()) {
					for(Proprietario prop : listaProprietario) {
						if((prop.getCodCli() == pertenceAn.getCodcli()) ) {
							//System.out.println("------------------------------------------------------------------------");
							//System.out.println("o dono do animal " + animalFor.getNome() + "do id animal " + animalFor.getCodAnimal() + "é o " + prop.getNome() + "com o id " + prop.getCodCli() + " e com o nome: " + prop.getNome());
							System.out.println("INFORMACAO DOS DONOS DOS ANIMAS");
							System.out.println("NOME " + prop.getNome());
							System.out.println("Endereco " + prop.getEndereco());
							System.out.println("CPF: " + prop.getCpf());

		
							System.out.println("---------------------------------------");
							break;
						}else {
							//System.out.println("o dono do animal " + animalFor.getNome() + "do id animal " + animalFor.getCodAnimal() + "é o " + prop.getNome() + "com o id " + prop.getCodCli() + " e com o nome: " + prop.getNome());
						}
					}
					
				}
			
					
				
			}
			
					
			
			
		}
		
		
		
		
		
		
		for(Proprietario prop1 : listaProprietario) {
			System.out.println("Proprietário: "+ prop1.getNome());
			//System.out.println("dono do bicho:");
			System.out.println();
			//System.out.println();
			for(PertenceAnimal pertenceAn: listaPertenceAnimal) {
				if(prop1.getCodCli() == pertenceAn.getCodcli()) {
					for(Animal animalAn : listaAnimal) {
						if((animalAn.getCodAnimal() == pertenceAn.getCodAnimal()) ) {
							//System.out.println("------------------------------------------------------------------------");
							//System.out.println("o dono do animal " + animalFor.getNome() + "do id animal " + animalFor.getCodAnimal() + "é o " + prop.getNome() + "com o id " + prop.getCodCli() + " e com o nome: " + prop.getNome());
							System.out.println("INFORMACAO DOS ANIMAIS DE CADA DONO");
							System.out.println("NOME " + animalAn.getNome());
							System.out.println("COR " + animalAn.getCor());
							System.out.println("IDADE " + animalAn.getIdade());
							System.out.println("PORTE " + animalAn.getRaca());
							System.out.println("PESO " + animalAn.getSexo());
							System.out.println("id animal " +animalAn.getCodAnimal());
							System.out.println("---------------------------------------");
							break;
						}else {
							//System.out.println("o dono do animal " + animalFor.getNome() + "do id animal " + animalFor.getCodAnimal() + "é o " + prop.getNome() + "com o id " + prop.getCodCli() + " e com o nome: " + prop.getNome());
						}
					}
					
				}
			
					
				
			}
			
					
			
			
		}
		
		
		main2(listaAnimal);
		
		

		
	}
	

}
