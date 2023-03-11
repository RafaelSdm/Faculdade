package Aula05RafaelDamasceno;


//import java.util.Date;
import java.util.List;

public class Pessoa {
	
	private String  nome;
	private String email;
	private String endereco;
	private List<String> telefones;
	
	
	
	
	public Pessoa(String nome, String email, String endereco, List<String> telefones) {
		super();
		this.nome = nome;
		this.email = email;
		//this.cpfCnpj = cpfCnpj;
		this.endereco = endereco;
		this.telefones = telefones;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<String> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<String> telefones) {
		this.telefones = telefones;
	}

}
