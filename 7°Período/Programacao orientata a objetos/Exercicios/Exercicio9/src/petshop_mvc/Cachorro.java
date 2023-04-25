package petshop_mvc;

import java.util.ArrayList;

public class Cachorro extends Animal {
	
	private String porte;
	private String peso;
	private Proprietario proprietario;
	
	
	
	public Cachorro(int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso, Proprietario proprietario) {
		super(id, nome, cor, idade, sexo, raca);
		this.porte = porte;
		this.peso = peso;
		this.proprietario = proprietario;
	}
	
	
	
	
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	
	
	/*
    public void cadastrarCachorro(int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso, String string) {
        Cachorro cachorro = new Cachorro(id, nome, cor, idade, sexo, raca, porte, peso);
        cachorros.add(cachorro);
    }
    
    public ArrayList<Cachorro> getCachorros() {
        return cachorros;
    }
    
    */
	
	public Proprietario getProprietario() {
		return proprietario;
	}




	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}



	@Override
	public String toString() {
		return "Cachorro [porte=" + porte + ", Proprietario = "+ this.getProprietario().getNome();
	}






	
	
	

}
