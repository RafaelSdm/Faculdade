package lanchoneteRafaelDamasceno;

public class Prato {
	
	private String nomePrato;
	private Double preco;
	private String dataValidade;
	private Double peso;
	
	
	
	
	public Prato(String nomePrato, Double preco, String dataValidade, Double peso) {
		super();
		this.nomePrato = nomePrato;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.peso = peso;
	}
	
	
	
	
	public String getNomePrato() {
		return nomePrato;
	}
	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	/*
	
	public Prato(String nomePrato, Double preco, String dataValidade, Double peso) {
		super();
		this.nomePrato = nomePrato;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.peso = peso;
	}
	
	*/
	
	
	
	
	
	

}
