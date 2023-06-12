package model;

import java.util.Date;

public class Pessoa {
	
	private String cpf;
	private String nome;
	private String endereco;
	private Date datanasc;
	
	public Pessoa(String cpf, String nome, String endereco, Date datanasc) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.datanasc = datanasc;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}
	
	
	
	

}