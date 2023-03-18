package lanchoneteRafaelDamasceno;

public class Salgadinho extends Prato {
	
	private String tipoMassa;
	private String recheio;
	
	
	
	public Salgadinho(String nomePrato, Double preco, String dataValidade, Double peso, String tipoMassa,
			String recheio) {
		super(nomePrato, preco, dataValidade, peso);
		this.tipoMassa = tipoMassa;
		this.recheio = recheio;
	}
	
	
	
	public String getTipoMassa() {
		return tipoMassa;
	}
	public void setTipoMassa(String tipoMassa) {
		this.tipoMassa = tipoMassa;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	

	
	
	
	
	

}
