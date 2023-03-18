package lanchoneteRafaelDamasceno;

import java.util.List;

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
	
	
	

}
