package lanchoneteRafaelDamasceno;

import java.util.List;
import java.util.Random;
	

public class Pedido {
	
	private String nomeCliente;
	private List<String> itensVendidos;
	private Double valorTotal;
	private Double valorRecebido;
	private Double troco;
	private Double taxaServico;
	
	
	public Pedido(String nomeCliente, List<String> itensVendidos, Double valorTotal, Double valorRecebido,
			Double troco, Double taxaServico) {
		super();
		this.nomeCliente = nomeCliente;
		this.itensVendidos = itensVendidos;
		this.valorTotal = valorTotal;
		this.valorRecebido = valorRecebido;
		this.troco = troco;
		this.taxaServico = taxaServico;
	}
	
	
    Random gerador = new Random();

	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public List<String> getItensVendidos() {
		return itensVendidos;
	}
	public void setItensVendidos(List<String> itensVendidos) {
		this.itensVendidos = itensVendidos;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Double getValorRecebido() {
		return valorRecebido;
	}
	public void setValorRecebido(Double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}
	public Double getTroco() {
		return troco;
	}
	public void setTroco(Double troco) {
		this.troco = troco;
	}
	public Double getTaxaServico() {
		return taxaServico;
	}
	public void setTaxaServico(Double taxaServico) {
		this.taxaServico = taxaServico;
	}
	
	public void teste(List<String> itensVendidos) {
		//int i = 0;
		
		System.out.println("Nota fiscal do Pedido:");
		System.out.println("Numero do cupom fiscal: "+ gerador.nextInt(1000));
		//            System.out.println(gerador.nextInt(26));

		System.out.println("--------------------------");
		System.out.println("Lista dos Pedidos:");
		System.out.println("--------------------------");
		for(int i = 0; i < itensVendidos.size(); i++ ) {
			//itensVendidos.get(i);
			System.out.println(itensVendidos.get(i));
		}
		
		System.out.println("-------------------------------");
		
		System.out.println("Nome do cliente: " + nomeCliente);
		
		System.out.println("---------------------------------");
		
		
		System.out.println("Valor total do pedido: R$ " + valorTotal);
		System.out.println("Valor final com a taxa de servico:" + valorTotal * taxaServico);
		
		
		
		
		
	}
	
	
	

}
