package Aula05RafaelDamasceno;

import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa {
	
	private Date data_admissao;
	private String cargo;
	private String cpf;
	
	
	public Funcionario(String nome, String email, String endereco, List<String> telefones, Date data_admissao,
			String cargo, String cpf) {
		super(nome, email, endereco, telefones);
		this.data_admissao = data_admissao;
		this.cargo = cargo;
		this.cpf = cpf;
	}


	public Date getData_admissao() {
		return data_admissao;
	}


	public void setData_admissao(Date data_admissao) {
		this.data_admissao = data_admissao;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
