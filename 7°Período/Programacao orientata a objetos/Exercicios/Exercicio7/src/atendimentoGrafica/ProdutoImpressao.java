package atendimentoGrafica;


import java.util.ArrayList;


public class ProdutoImpressao {

	private String tipo;

	private int idPedido;

	private Double preco;

	private String funcProducao;

	public ProdutoImpressao(String tipo, int idPedido, Double preco, String funcProducao) {
		super();
		this.setTipo(tipo);
		this.setIdPedido(idPedido);
		this.setPreco(preco);
		this.setFuncProducao(funcProducao);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getFuncProducao() {
		return funcProducao;
	}

	public void setFuncProducao(String funcProducao) {
		this.funcProducao = funcProducao;
	}
	
	
	
	public void mostrarItens(ArrayList<ProdutoImpressao> lista) {
		
		for(ProdutoImpressao ln: lista ) {
			System.out.println("[ " + ln.idPedido + "]" + "------ Produto: " + ln.tipo + " Preco: R$: " + ln.getPreco());
			
		}
		
		
	}

	
	
	


}

