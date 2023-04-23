package petshop_mvc;

import java.util.ArrayList;

public class Passaro extends Animal {
	
	private String numeroAnilha;
	private ArrayList<Passaro> passaros = new ArrayList<>();

	
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

	
	
    public void cadastrarPassaro(int id, String nome, String cor, int idade, String sexo, String raca, String numeroAnilha) {
        Passaro passaro = new Passaro(id, nome, cor, idade, sexo, raca, numeroAnilha);
        passaros.add(passaro);
    }
    
    public ArrayList<Passaro> getPassaros() {
        return passaros;
    }


	@Override
	public String toString() {
		return "Passaro [numeroAnilha=" + numeroAnilha + ", passaros=" + passaros + "]";
	}
    
    
	
	

}
