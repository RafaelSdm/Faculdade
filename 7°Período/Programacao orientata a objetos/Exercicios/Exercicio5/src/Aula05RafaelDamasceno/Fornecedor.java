package Aula05RafaelDamasceno;


import java.util.Date;
//Aqui foi implementado o método herança

import java.util.List;
public class Fornecedor extends Pessoa {
	
	private Date data_abertura;
	private String cnpj;
	
	
	public Fornecedor(String nome, String email, String endereco, List<String> telefones, Date data_abertura,
			String cnpj) {
		super(nome, email, endereco, telefones);
		this.data_abertura = data_abertura;
		this.cnpj = cnpj;
	}
	
	// Encapsulamento nos getters e setter

	public Date getData_abertura() {
		return data_abertura;
	}
	public void setData_abertura(Date data_abertura) {
		this.data_abertura = data_abertura;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
