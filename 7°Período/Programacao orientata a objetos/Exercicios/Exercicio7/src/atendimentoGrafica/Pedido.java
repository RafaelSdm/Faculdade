package atendimentoGrafica;

import java.util.Date;

public class Pedido {

	private int idPedido;

	private String dataEmissao;

	private String dataFinalizacao;

	private Double preco;

	private String funcVendedor;

	private String produto;

	public Pedido(int idPedido, String dataEmissao, String dataFinalizacao, Double preco, String funcVendedor,
			String produto) {
		super();
		this.setIdPedido(idPedido);
		this.setDataEmissao(dataEmissao);
		this.setDataFinalizacao(dataFinalizacao);
		this.setPreco(preco);
		this.setFuncVendedor(funcVendedor);
		this.setProduto(produto);
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(String dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getFuncVendedor() {
		return funcVendedor;
	}

	public void setFuncVendedor(String funcVendedor) {
		this.funcVendedor = funcVendedor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	
	
	
	



}

