package petshop_mvc;

public class Proprietario {
	
	
	private String nome;
	private int id;
	private String cpf;
	private String endereco;
	
	
	
	public Proprietario(String nome, int id, String cpf, String endereco) {
		super();
		this.nome = nome;
		this.id = id;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	
	

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

	
	

}
