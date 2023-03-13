package Exercicio4_RafaelDamasceno;

public class Animal implements Comparable<Animal>{
	
	private String nome;
	private String cor;
	private Integer idade;
	private String raca;
	private String sexo;
	private Integer codAnimal;
	
	public Animal(String nome, String cor, Integer idade, String raca, String sexo, Integer codAnimal ) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
		this.raca = raca;
		this.sexo = sexo;
		this.codAnimal = codAnimal;
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
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
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

	public Integer getCodAnimal() {
		return codAnimal;
	}

	public void setCodAnimal(Integer codAnimal) {
		this.codAnimal = codAnimal;
	}
	
	
	@Override
	public int compareTo(Animal outroAnimal) {
		return Integer.compare(this.idade, outroAnimal.idade);
	}
	
	

}
