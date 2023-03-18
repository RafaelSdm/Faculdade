package lanchoneteRafaelDamasceno;

import java.util.List;

public class Pizza extends Prato {
	
	private String recheios;
	private String borda;
	private String molho;
	
	
	
	
	
	public Pizza(String nomePrato, Double preco, String dataValidade, Double peso, String recheios, String borda,
			String molho) {
		super(nomePrato, preco, dataValidade, peso);
		this.recheios = recheios;
		this.borda = borda;
		this.molho = molho;
	}
	
	
	
	
	public String getRecheios() {
		return recheios;
	}
	public void setRecheios(String recheios) {
		this.recheios = recheios;
	}
	public String getMolho() {
		return molho;
	}
	public void setMolho(String molho) {
		this.molho = molho;
	}
	public String getBorda() {
		return borda;
	}
	public void setBorda(String borda) {
		this.borda = borda;
	}
	
	
	
	

}
