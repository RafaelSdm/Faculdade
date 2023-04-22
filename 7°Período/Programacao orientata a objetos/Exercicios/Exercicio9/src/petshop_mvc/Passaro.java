package petshop_mvc;

public class Passaro extends Animal {
	
	private String numeroAnilha;
	
	
	public Passaro(int id, String nome, String cor, int idade, String sexo, String raca, String numeroAnilha) {
		super(id, nome, cor, idade, sexo, raca);
		this.numeroAnilha = numeroAnilha;
	}
	

	public String getNumeroAnilha() {
		return numeroAnilha;
	}

	public void setNumeroAnilha(String numeroAnilha) {
		this.numeroAnilha = numeroAnilha;
	}


	
	

}
