package Aula05RafaelDamasceno;

import java.util.ArrayList;

 
public class Venda {
	private Cliente cliente;
	private ArrayList<Produto> produto;
	private Fornecedor fornecedor;
	private Funcionario funcionario;
	private Double valorTotal;
	private Double valorFinal;
	
	
	
	public Venda(Cliente cliente, ArrayList<Produto> produto, Fornecedor fornecedor, Funcionario funcionario, Double valorTotal,
			Double valorFinal) {
		super();
		this.cliente = cliente;
		this.produto = produto;
		this.fornecedor = fornecedor;
		this.funcionario = funcionario;
		this.valorTotal = valorTotal;
		this.valorFinal = valorFinal;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}


	public ArrayList<Produto> getProduto() {
		return produto;
	}


	public void setProduto(ArrayList<Produto> produto) {
		this.produto = produto;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
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
	
	
	
	
	

}
