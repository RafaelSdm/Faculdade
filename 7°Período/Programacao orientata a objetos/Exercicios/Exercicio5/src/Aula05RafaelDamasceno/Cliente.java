package Aula05RafaelDamasceno;

import java.util.Date;
import java.util.List;
//Aqui foi implementado o método herança

public class Cliente extends Pessoa {
	
	private Date data_nascimento;
	private String cpf;

	public Cliente(String nome, String email, String endereco, List<String> telefones,
			Date data_nascimento, String cpf) {
		super(nome, email, endereco, telefones);
		this.data_nascimento = data_nascimento;
		this.cpf = cpf;
	}
	
	
	// Encapsulamento nos getters e setter

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	
	
	
	

}
