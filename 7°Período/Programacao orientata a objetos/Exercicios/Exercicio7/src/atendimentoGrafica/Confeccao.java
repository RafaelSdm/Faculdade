package atendimentoGrafica;

import java.util.ArrayList;
import java.util.List;

public class Confeccao {
    private String nomeCliente;
    private int numeroPedido;
    private double precoTotal;
    private ArrayList<Integer> itensPedido;
    
    
    int i = 0;
    
    public Confeccao(String nomeCliente, int numeroPedido, double precoTotal, ArrayList<Integer> itensPedido) {
        this.nomeCliente = nomeCliente;
        this.numeroPedido = numeroPedido;
        this.precoTotal = precoTotal;
        this.itensPedido = itensPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public List<Integer> getItensPedido() {
        return itensPedido;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public void setItensPedido(ArrayList<Integer> itensPedido) {
        this.itensPedido = itensPedido;
    }
    
    
    public void mostrarPedidosConfeccao(ArrayList<Confeccao> lista2) {
    	System.out.println("Produtos a serem confeccionados");
    	for(Confeccao cf: lista2) {
    		System.out.println("---------------------------------------------");
    		System.out.println("Numero do pedido: " + cf.numeroPedido);
    		System.out.println("Nome do cliente: " + cf.nomeCliente);
    		System.out.println("Valor total do pedido: R$" + cf.precoTotal);
    		System.out.println(cf.itensPedido);
    		
    		/*
    		for(i = 0; i < cf.itensPedido.size(); i++) {
    			System.out.println(cf.itensPedido.get(i));
    			
    		}
    		
    		*/
    		
    		
    		System.out.println("-----------------------------------------------");
    		
    		
    	}
    	
    }


}

