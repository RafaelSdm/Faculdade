package petshop_mvc;

public class Animal {
	
	private int id;
	private String nome;
	private String cor;
	private int idade;
	private String sexo;
	private String raca;
	
	
	
	
	public Animal(int id, String nome, String cor, int idade, String sexo, String raca) {
		super();
		this.id = id;
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
		this.sexo = sexo;
		this.raca = raca;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

	
	
	
	
	

}
