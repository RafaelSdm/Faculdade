package Model;

public class ModelCao extends ModelAnimal {
	private String porte;
	private Float peso;
	
	public ModelCao() {
		super();
	}

	public ModelCao(Integer id, String nome, Integer idade, String raca, String cor, String sexo, String porte, Float peso) {
		super(id, nome, idade, raca, cor, sexo);
		this.porte = porte;
		this.peso = peso;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}
	
}

