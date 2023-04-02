package atendimentoGrafica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;




public class Principal {
	
	public static void main(String[] args) {
        Random rand = new Random();
        int numeroPedido;
		ArrayList<Gerente> listaGerente = new ArrayList<Gerente>();
		ArrayList<Empregado> listaEmpregado = new ArrayList<Empregado>();
		ArrayList<EmpregadoTerceirizado>  listaEmpregadoTerceirizado = new ArrayList<EmpregadoTerceirizado>();
		ArrayList<ProdutoImpressao> listaProdutoImpressao = new ArrayList<ProdutoImpressao>();
		ArrayList<Confeccao> listaConfeccao = new ArrayList<Confeccao>();
		
		//List<Integer> pedidoCliente = null;
		
        ArrayList<Integer> listaPedido = new ArrayList<>();

        Confeccao confeccao = new Confeccao("teste", 123, 123.00, listaPedido);
        listaConfeccao.add(confeccao);
		
		int i = 1;
		
		int j = 1;
		
		Double valorFinal = 0.0;
		
		Scanner entrada = new Scanner(System.in);
		
		String nomeCliente;
		
		int idFuncionario;
		
		int opcaoEntrada;
		
		int idProduto;
		
		int respAddpedido = 0;
		
		

		Gerente gerente = new Gerente(1,"Roberto", "roberto@gmail.com", "roberto123","Gerente de Vendas");
		listaGerente.add(gerente);
		
		gerente = new Gerente(2, "Alexandre", "alexandre@gmail.com", "alexandre123", "Gerente de Producao");
		listaGerente.add(gerente);
		
		gerente = new Gerente(3, "Onório", "onorio@gmail.com", "onorinho123", "Gerente Financeiro");
		
		listaGerente.add(gerente);
		
		
		Empregado empregado = new Empregado(4, "Arlindo", "arlindo@gmail.com", "arlindo123", "impressora a laser", 14.000, "Producao" );
		
		listaEmpregado.add(empregado);
		
		empregado = new Empregado(5, "Felipe", "felipe@gmail,com", "felipe123", "impressora a vacuo", 1.500, "Producao");
		
		listaEmpregado.add(empregado);
		
		empregado = new Empregado(6, "Aline", "aline@gmail.com", "aline123", "impressora padrão", 8.000, "Producao");
		
		listaEmpregado.add(empregado);
		
		
		EmpregadoTerceirizado empregadoTerceirizado = new EmpregadoTerceirizado(5, "Rodrigo", "rodrigo@gmail.com", "rodrigo1234", "Faxineiro", "Rede Globo");
		
		
		listaEmpregadoTerceirizado.add(empregadoTerceirizado);
		
		
		ProdutoImpressao produtoImpressao = new ProdutoImpressao("Banner", 400, 250.000, "Felipe");
		
		listaProdutoImpressao.add(produtoImpressao);
		
		produtoImpressao = new ProdutoImpressao("Livro", 401, 4.000, "Aline");
		
		listaProdutoImpressao.add(produtoImpressao);
		
		produtoImpressao = new ProdutoImpressao("Material plublicitario", 415, 82.00, "Arlindo" );
		
		listaProdutoImpressao.add(produtoImpressao);
		
		produtoImpressao = new ProdutoImpressao("Revista", 419, 56.00, "Aline");
		
		listaProdutoImpressao.add(produtoImpressao);
		
		
		//	public ProdutoImpressao(String tipo, int idPedido, Double preco, String funcProducao) {

		
		

		
		
		while(i != 0) {
			
			
			System.out.println("O que voce deseja fazer?");
			System.out.println("-------------------------------");
			System.out.println("[1] - Pegar pedido do cliente");
			System.out.println("[2] - Cadastrar um novo Funcionario");
			System.out.println("[3] - Sair do programa");
			System.out.println("[4] - Mostrar pedidos a serem confeccionados");
			System.out.println("-----------------------------------");
			
			
			opcaoEntrada = entrada.nextInt();
			
			if(opcaoEntrada == 1) {
				System.out.println("Olá! Para iniciarmos o seu pedido siga as etapas abaixo:");
				
				System.out.println("Informe o funcionario informando o ID:");
				
				empregado.mostrarFuncionario(listaEmpregado);
				
				System.out.println("Informe o seu ID:");
				idFuncionario = entrada.nextInt();
				
				
				System.out.println("---------------------------------------------");
				System.out.println("Agora informe o nome do seu cliente a ser atendido:");
				nomeCliente = entrada.next();
				entrada.nextLine();
				
				System.out.println();
				
				
				listaPedido.clear();
				
				j = 1;
				while(j != 0) {
					System.out.println("Informe o produto que voce deseja comprar:");
					produtoImpressao.mostrarItens(listaProdutoImpressao);
					idProduto = entrada.nextInt();
					listaPedido.add(idProduto);
					
					System.out.println("Deseja adicionar mais algum produto?");
					System.out.println("[1] - SIM");
					System.out.println("[2] - NÃO");
					
					respAddpedido = entrada.nextInt();
					
					if(respAddpedido == 1) {
						System.out.println("Adicionar mais pedido");
						
					}else {
						
						
						valorFinal = produtoImpressao.calcularPedido(listaProdutoImpressao, listaPedido);
						
						System.out.println("o valor da compra foi de " + valorFinal);
						numeroPedido = rand.nextInt(4500);
						System.out.println("Seu numero de pedido é: " + numeroPedido);
						//System.out.println(listaPedido);
						//public Confeccao(String nomeCliente, int numeroPedido, double precoTotal, ArrayList<Integer> itensPedido) {
						
						confeccao = new Confeccao(nomeCliente, numeroPedido, valorFinal, listaPedido);
						listaConfeccao.add(confeccao);
						
						
						
						
						j = 0;

					}
					
					
					
					

				}
				
				
				
			}else if(opcaoEntrada == 2) {
				System.out.println("Voce desejou cadastrar um novo funcionario");
				int id;
				String nome; 
				String email; 
				String senha;
				String tipoEquipamento;
				Double salario;
				String setor;
				
				System.out.println("Informe o nome do funcionario:");
				nome = entrada.next();
				entrada.nextLine();
				System.out.println("Informe um id inexistente");
				id = entrada.nextInt();
				System.out.println("Informe o seu email");
				email = entrada.next();
				entrada.nextLine();
				System.out.println("Informe sua senha");
				senha = entrada.next();
				System.out.println("Informe o tipo de equipamento que vai ser ultilizado:");
				tipoEquipamento = entrada.next();
				entrada.nextLine();
				System.out.println("Informe o salario do novo funcionario:");
				salario = entrada.nextDouble();
				System.out.println("Informe o setor do funcionario:");
				setor = entrada.next();
				entrada.nextLine();

				System.out.println(nome);
				empregado = new Empregado(id,nome, email, senha, tipoEquipamento, salario, setor);
				
				listaEmpregado.add(empregado);
				
				System.out.println("Funcionario cadastrado com sucesso");
				System.out.println();
				
			}else if(opcaoEntrada == 4) {
				confeccao.mostrarPedidosConfeccao(listaConfeccao);
				//System.out.println("teste");

			}else {
				System.out.println("Voce decidiu sair do programa");
				i = 0;
			}
			

			
		}
		
		
		System.out.println("Obrigado por entrar em nosso programa!");
		
		



		
	}

}
