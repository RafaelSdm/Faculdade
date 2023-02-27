package Aula03HerancaRafaelDamasceno;

import java.util.Date;

public class Funcionario extends Pessoa {
	
	private Double salario;
	private String admissao;
	private String cargo;

	public Funcionario(String nome, String cpf, String data_nascimento, Double salario, String admissao, String cargo){
		super(nome, cpf, data_nascimento);
		this.salario = salario;
		this.admissao = admissao;
		this.cargo = cargo;
	
	}
	

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getAdmissao() {
		return admissao;
	}

	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
	
	
}
