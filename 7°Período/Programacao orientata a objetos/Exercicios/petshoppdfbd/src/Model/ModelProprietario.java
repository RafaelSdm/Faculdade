package Model;

import java.util.Date;

public class ModelProprietario {
	private Integer CPF;
	private String nome;
	private Date data_nascimento;
	private String email;
	private String telefone;
	private String endereco;
	
	public ModelProprietario() {
		super();
	}

	public ModelProprietario(Integer cPF, String nome, Date data_nascimento, String email, String telefone,
			String endereco) {
		super();
		CPF = cPF;
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public Integer getCPF() {
		return CPF;
	}

	public void setCPF(Integer cPF) {
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	
}
