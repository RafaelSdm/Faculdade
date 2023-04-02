package atendimentoGrafica;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		
		ArrayList<Gerente> listaGerente = new ArrayList<Gerente>();
		ArrayList<Empregado> listaEmpregado = new ArrayList<Empregado>();
		ArrayList<EmpregadoTerceirizado>  listaEmpregadoTerceirizado = new ArrayList<EmpregadoTerceirizado>();
		ArrayList<ProdutoImpressao> listaProdutoImpressao = new ArrayList<ProdutoImpressao>();
		
		int i = 1;
		
		Scanner entrada = new Scanner(System.in);
		
		String nomeCliente;

		Gerente gerente = new Gerente(1,"Roberto", "roberto@gmail.com", "roberto123","Gerente de Vendas");
		listaGerente.add(gerente);
		
		gerente = new Gerente(12, "Alexandre", "alexandre@gmail.com", "alexandre123", "Gerente de Producao");
		listaGerente.add(gerente);
		
		gerente = new Gerente(15, "Onório", "onorio@gmail.com", "onorinho123", "Gerente Financeiro");
		
		listaGerente.add(gerente);
		
		
		Empregado empregado = new Empregado(45, "Arlindo", "arlindo@gmail.com", "arlindo123", "impressora a laser", 14.000, "Producao" );
		
		listaEmpregado.add(empregado);
		
		empregado = new Empregado(67, "Felipe", "felipe@gmail,com", "felipe123", "impressora a vacuo", 1.500, "Producao");
		
		listaEmpregado.add(empregado);
		
		empregado = new Empregado(89, "Aline", "aline@gmail.com", "aline123", "impressora padrão", 8.000, "Producao");
		
		listaEmpregado.add(empregado);
		
		
		EmpregadoTerceirizado empregadoTerceirizado = new EmpregadoTerceirizado(5, "Rodrigo", "rodrigo@gmail.com", "rodrigo1234", "Faxineiro", "Rede Globo");
		
		
		listaEmpregadoTerceirizado.add(empregadoTerceirizado);
		
		
		ProdutoImpressao produtoImpressao = new ProdutoImpressao("Banner", 456, 250.000, "Felipe");
		
		listaProdutoImpressao.add(produtoImpressao);
		
		produtoImpressao = new ProdutoImpressao("Livro", 856, 4.000, "Aline");
		
		listaProdutoImpressao.add(produtoImpressao);
		
		produtoImpressao = new ProdutoImpressao("Material plublicitario", 415, 82.00, "Arlindo" );
		
		listaProdutoImpressao.add(produtoImpressao);
		
		produtoImpressao = new ProdutoImpressao("Revista", 419, 56.00, "Aline");
		
		listaProdutoImpressao.add(produtoImpressao);
		
		
		//	public ProdutoImpressao(String tipo, int idPedido, Double preco, String funcProducao) {

		
		
		
		for(Empregado emp: listaEmpregado) {
			System.out.println(emp.getNome());
			
		}
		
		
		while(i != 0) {
			
			System.out.println("Olá! Para iniciarmos o seu pedido siga as etapas abaixo:");
			
			System.out.println("Informe o seu nome!");
			nomeCliente = entrada.next();
			
			System.out.println("" + nomeCliente + ", segue a nossa lista de produtos!");
			
			produtoImpressao.mostrarItens(listaProdutoImpressao);
			
		}
		
		
		

		
	}

}
