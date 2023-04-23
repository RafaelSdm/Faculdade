package petshop_mvc;

import java.util.ArrayList;

public class Cachorro extends Animal {
	
	private String porte;
	private String peso;
	private ArrayList<Cachorro> cachorros = new ArrayList<>();

	
	
	
	public Cachorro(int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso) {
		super(id, nome, cor, idade, sexo, raca);
		this.porte = porte;
		this.peso = peso;
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
	
	
	
	
    public void cadastrarCachorro(int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso, String string) {
        Cachorro cachorro = new Cachorro(id, nome, cor, idade, sexo, raca, porte, peso);
        cachorros.add(cachorro);
    }
    
    public ArrayList<Cachorro> getCachorros() {
        return cachorros;
    }

	
	
	

}
