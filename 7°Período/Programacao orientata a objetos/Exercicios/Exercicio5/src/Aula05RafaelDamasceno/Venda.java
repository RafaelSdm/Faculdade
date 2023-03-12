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
	
	
	public void getValorFinalComDesconto(String cpf) {
		Double teste = 0.0;
		int verificaPessoa = 0;
		for(Cliente cli: cliente) {
			if(cli.getCpf() == cpf) {
				//System.out.println("teste de for");
				System.out.println("Nome do cliente:" +cli.getNome());
				System.out.println("Valor total da comrpra: " + valorTotal);
				System.out.println("Valor Final da compra:" + valorTotal * 8);
				verificaPessoa = 1;
				//return valorTotal * 10;
				
			}
		}
		
		
		for(Funcionario fun: funcionario) {
			if(fun.getCpf() == cpf) {
				//System.out.println("teste de for");
				System.out.println("Nome do Funcionario: " + fun.getNome());
				System.out.println("Valor total da comrpra: " + valorTotal);
				System.out.println("Valor Final da compra:" + valorTotal * 4);
				verificaPessoa = 1;

				//return valorTotal * 40;

			}
		}
		
		
		
		for(Fornecedor forn: fornecedor) {
			if(forn.getCnpj() == cpf) {
				System.out.println("teste de for");
				System.out.println("Nome do Fornecedor: " + forn.getNome());
				System.out.println("Valor total da comrpra: " + valorTotal);
				System.out.println("Valor Final da compra:" + valorTotal * 170);
				verificaPessoa = 1;


				//return valorTotal * 1000;

			}
		}
		
		
		if(verificaPessoa == 0) {
			System.out.println("Conta do novo cliente: " + valorTotal);
			System.out.println("Valor final da compra" + valorTotal * 10000);
			
		}
		
		
		System.out.println("-------------------------------------------------------------");
		
		
		
		
		//return teste;
		
	}
	
	
	
	
	

}
