package Aula03HerancaRafaelDamasceno;

import java.util.Date;

public class Aluno extends Pessoa{
	
	private String Matricula;

	public Aluno(String nome, String cpf, String data_nascimento, String Matricula) {
		super(nome, cpf, data_nascimento);
		this.setMatricula(Matricula);
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	
	public double getValorCopia(Integer numCopias) {
		return numCopias  * 0.05;
		
	}
	
	
	
		
	

}
