package lanchoneteRafaelDamasceno;

public class Salgadinho extends Prato {
	
	private String tipoMassa;
	private String recheio;
	private String tipoFeito;
	
	
	
	public Salgadinho(String nomePrato, Double preco, String dataValidade, Double peso, String tipoMassa,
			String recheio, String tipoFeito) {
		super(nomePrato, preco, dataValidade, peso);
		this.tipoMassa = tipoMassa;
		this.recheio = recheio;
		this.tipoFeito = tipoFeito;
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



	public String getTipoFeito() {
		return tipoFeito;
	}



	public void setTipoFeito(String tipoFeito) {
		this.tipoFeito = tipoFeito;
	}
	
	

	
	
	
	
	

}
