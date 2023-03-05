package Exercicio4_RafaelDamasceno;

public class CaoGato extends Animal {
	
	private String porte;
	private Double peso;
	
	public CaoGato(String nome, String cor, Integer idade, String raca, String sexo, Integer codAnimal,  String porte, Double peso) {
		super(nome, cor, idade, raca, sexo, codAnimal);
		this.porte = porte;
		this.peso = peso;
	}

	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	

}
