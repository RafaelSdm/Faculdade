package Exercicio4_RafaelDamasceno;

public class Principal {
	public static void main(String[] args) {
		
		Proprietario proprietario = new Proprietario("Rafael", 01, "endereco1", "15307988680");
		
		
		CaoGato gato = new CaoGato("gato", "branco", 20, "felino", "macho", 22 ,"pequeno", 22.58 );
				//String nome, String cor, Integer idade, String raca, String sexo, String porte, Double peso
		
		
		CaoGato cachorro = new CaoGato("cachorro", "pardo", 50, "felino", "macho", 22 ,"pequeno", 22.58 );

		Passaro passaro = new Passaro("gabiao", "preto", 45, "aguia", "femea", 45, "456");
		
		PertenceAnimal pertence = new PertenceAnimal(1,2);
		
		System.out.println("INFORMACAO DO PROPRIETARIO");
		System.out.println("NOME"+ proprietario.getNome());
		System.out.println("CODCLI" + proprietario.getCodCli());
		System.out.println("ENDERECO" + proprietario.getEndereco());
		System.out.println("CPF"+ proprietario.getEndereco());
		
		
		System.out.println("-------------------------------------------");
		
		
		System.out.println("INFORMACAO DO ANIMAL GATO");
		System.out.println("NOME" + gato.getNome());
		System.out.println("COR" + gato.getCor());
		System.out.println("IDADE" + gato.getIdade());
		System.out.println("PORTE" + gato.getPorte());
		System.out.println("PESO" + gato.getPeso());
		System.out.println("id animal" + gato.getCodAnimal());

		
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
		
		
	}

}
