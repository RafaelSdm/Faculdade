package ConceitosPOO;

import java.util.Date;

public class Carro {
	
	//Definição de variáveis em Java
	
	private String nome;
	private String marca;
	private Integer chassi;
	private String cor;
	private Integer portas;
	private Date fabricacao;
	
	//Construtor Vazio
	public Carro() {
		super();
	}

	//Construtor com parâmetros
	public Carro(String nome, String marca, Integer chassi, String cor, Integer portas, Date fabricacao) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.chassi = chassi;
		this.cor = cor;
		this.portas = portas;
		this.fabricacao = fabricacao;
	}

	//Métodos get servem para recuperar um determinado atributo de um objeto;
	public String getMarca() {
		return marca;
	}
	
	//Métodos set servem para atribuir valor a um determinado atributo de um objeto;
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getChassi() {
		return chassi;
	}
	public void setChassi(Integer chassi) {
		this.chassi = chassi;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getPortas() {
		return portas;
	}
	public void setPortas(Integer portas) {
		this.portas = portas;
	}
	public Date getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}
	
	public Integer idadeCarro(Carro carro) {
		Integer idade = 0;
		idade = new Date().getYear() - carro.getFabricacao().getYear();
		return idade;
	}
	

}
