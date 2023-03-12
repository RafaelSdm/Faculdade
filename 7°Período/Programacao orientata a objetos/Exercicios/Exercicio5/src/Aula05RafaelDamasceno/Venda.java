package Aula05RafaelDamasceno;

import java.util.ArrayList;

 
public class Venda {
	private ArrayList<Cliente> cliente;
	private ArrayList<Produto> produto;
	private ArrayList<Fornecedor> fornecedor;
	private ArrayList<Funcionario> funcionario;
	private Double valorTotal;
	private Double valorFinal;
	
	
	
	public Venda(ArrayList<Cliente> cliente, ArrayList<Produto> produto, ArrayList<Fornecedor> fornecedor, ArrayList<Funcionario> funcionario, Double valorTotal,
			Double valorFinal) {
		super();
		this.cliente = cliente;
		this.produto = produto;
		this.fornecedor = fornecedor;
		this.funcionario = funcionario;
		this.valorTotal = valorTotal;
		this.valorFinal = valorFinal;
	}


	public ArrayList<Cliente> getCliente() {
		return cliente;
	}


	public void setCliente(ArrayList<Cliente> cliente) {
		this.cliente = cliente;
	}


	public ArrayList<Fornecedor> getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(ArrayList<Fornecedor> fornecedor) {
		this.fornecedor = fornecedor;
	}


	public ArrayList<Produto> getProduto() {
		return produto;
	}


	public void setProduto(ArrayList<Produto> produto) {
		this.produto = produto;
	}


	public ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(ArrayList<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}


	public Double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public Double getValorFinal() {
		return valorFinal;
	}


	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	
	public double getValorFinalComDesconto(String cpf) {
		Double teste = 0.0;
		for(Cliente cli: cliente) {
			if(cli.getCpf() == cpf) {
				System.out.println("teste de for");
				return valorTotal * 10;
				
			}
		}
		
		
		for(Funcionario fun: funcionario) {
			if(fun.getCpf() == cpf) {
				System.out.println("teste de for");
				return valorTotal * 40;

			}
		}
		
		
		
		for(Fornecedor forn: fornecedor) {
			if(forn.getCnpj() == cpf) {
				System.out.println("teste de for");
				return valorTotal * 1000;

			}
		}
		
		
		
		
		return teste;
		
	}
	
	
	
	
	

}
