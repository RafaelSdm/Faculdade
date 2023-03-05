package Exercicio4_RafaelDamasceno;

public class Passaro extends Animal{
	
	private String numeroAnilha;
	
	public Passaro(String nome, String cor, Integer idade, String raca, String sexo, Integer codAnimal, String numeroAnilha) {
		super(nome, cor, idade, raca, sexo, codAnimal);
		this.numeroAnilha = numeroAnilha;
	}

	public String getNumeroAnilha() {
		return numeroAnilha;
	}

	public void setNumeroAnilha(String numeroAnilha) {
		this.numeroAnilha = numeroAnilha;
	}


	
	

}
