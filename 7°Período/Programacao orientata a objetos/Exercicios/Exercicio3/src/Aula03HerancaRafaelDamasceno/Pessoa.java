package Aula03HerancaRafaelDamasceno;

import java.util.Date;

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private String data_nascimento;
	
	public Pessoa(String nome, String cpf, String data_nascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	
	public double getValorCopia(Integer numCopias) {
		return numCopias  * 0.1;
		
	}
	


}
