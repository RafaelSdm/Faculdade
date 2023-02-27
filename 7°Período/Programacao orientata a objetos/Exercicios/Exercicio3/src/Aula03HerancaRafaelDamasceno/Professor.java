package Aula03HerancaRafaelDamasceno;

import java.util.Date;

public class Professor extends Pessoa{
	
	private Double salario;
	private String disciplina;
	
	public Professor(String nome, String cpf, String data_nascimento, Double salario, String disciplina) {
		super(nome, cpf, data_nascimento);
		this.salario = salario;
		this.disciplina = disciplina;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	

	
}
