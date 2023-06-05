package model;

public class salgado {
	//private String nome;
	private String sabor;
	//private String borda;
	private String tamanho;
	private Pessoa pessoa;
	private double preco;
	public salgado(String sabor, String tamanho, Pessoa pessoa) {
		super();
		//this.nome = nome;
		this.sabor = sabor;
		//this.borda = borda;
		this.tamanho = tamanho;
		this.pessoa = pessoa;
		this.preco = calcularPreco(tamanho);
	}
	
public double calcularPreco(String tamanho) {
		
		double precoBase = 5.0;

		if (tamanho != null) {
	        // Lógica para calcular o preço base com base no tamanho
	        if (tamanho.equals("Pequeno")) {
	            precoBase = 5.0;
	        } else if (tamanho.equals("Médio")) {
	            precoBase = 10.0;
	        } else if (tamanho.equals("Grande")) {
	            precoBase = 12.0;
	        }
	    }
     
        return precoBase;
	}
	//public String getNome() {
	//	return nome;
	//}
	
	//public void setNome(String nome) {
	//	this.nome = nome;
	//}
	
	public String getSabor() {
		return sabor;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	//public String getBorda() {
	//	return borda;
	//}
	
	//public void setBorda(String borda) {
	//	this.borda = borda;
	//}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void setPreco (double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
}