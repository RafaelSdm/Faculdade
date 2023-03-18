package lanchoneteRafaelDamasceno;

public class Lanche extends Prato {
	
	private String tipoPao;
	private String recheio;
	private String molho;
	
	
	public Lanche(String nomePrato, Double preco, String dataValidade, Double peso, String tipoPao, String recheio,
			String molho) {
		super(nomePrato, preco, dataValidade, peso);
		this.tipoPao = tipoPao;
		this.recheio = recheio;
		this.molho = molho;
	}
	
	
	
	public String getTipoPao() {
		return tipoPao;
	}
	public void setTipoPao(String tipoPao) {
		this.tipoPao = tipoPao;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	public String getMolho() {
		return molho;
	}
	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	

	
	
	

}
