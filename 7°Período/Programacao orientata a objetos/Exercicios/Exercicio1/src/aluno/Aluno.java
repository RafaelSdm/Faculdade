package aluno;

import java.util.Date;
import java.time.LocalDate;

public class Aluno {
	
	private String nome;
	private String cpf;
	private LocalDate dataNasci;
	private String email;
	
	
	public Aluno(String nome, String cpf, LocalDate dataNasci, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasci = dataNasci;
		this.email = email;
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
	
	public LocalDate getDataNasci() {
		return dataNasci;
	}
	
	public void setDataNasci(LocalDate dataNasci) {
		this.dataNasci = dataNasci;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer idadeAluno(Aluno aluno) {
		Integer idade = 0;
		return idade;
	}

}
