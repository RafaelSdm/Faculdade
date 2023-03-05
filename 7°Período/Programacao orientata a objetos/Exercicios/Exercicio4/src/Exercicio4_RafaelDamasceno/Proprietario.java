package Exercicio4_RafaelDamasceno;

public class Proprietario {
	private String nome;
	private Integer codCli;
	private String endereco;
	private String cpf;
	
	public Proprietario(String nome, Integer codcli, String endereco, String cpf) {
		super();
		this.nome = nome;
		this.codCli = codcli;
		this.endereco = endereco;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCodCli() {
		return codCli;
	}
	public void setCodCli(Integer codCli) {
		this.codCli = codCli;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
}
