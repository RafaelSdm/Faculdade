package petshop_mvc;

import java.util.ArrayList;

public class Passaro extends Animal {
	
	private String numeroAnilha;
	private Proprietario propretario;
	
	public Passaro(int id, String nome, String cor, int idade, String sexo, String raca, String numeroAnilha, Proprietario proprietario) {
		super(id, nome, cor, idade, sexo, raca);
		this.numeroAnilha = numeroAnilha;
		this.setPropretario(proprietario);
	}
	

	public String getNumeroAnilha() {
		return numeroAnilha;
	}

	public void setNumeroAnilha(String numeroAnilha) {
		this.numeroAnilha = numeroAnilha;
	}

	
	/*
    public void cadastrarPassaro(int id, String nome, String cor, int idade, String sexo, String raca, String numeroAnilha) {
        Passaro passaro = new Passaro(id, nome, cor, idade, sexo, raca, numeroAnilha);
        passaros.add(passaro);
    }
    
    public ArrayList<Passaro> getPassaros() {
        return passaros;
    }
    
    */
	
	

	public Proprietario getPropretario() {
		return propretario;
	}


	public void setPropretario(Proprietario propretario) {
		this.propretario = propretario;
	}

	@Override
	public String toString() {
		return "Passaro [porte=" + numeroAnilha + ", Proprietario = "+ this.getPropretario().getNome();
	}


    
    
	
	

}
