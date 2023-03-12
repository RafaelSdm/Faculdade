package Aula05RafaelDamasceno;


import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Principal {
	
	static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
	
	public static Double main2(ArrayList<Produto> produtos, int v[]) {
		Double soma = 0.0;
		//return teste;
		int i = 0;
		int j = 0;
		//System.out.println("teste de nova funcao -----------------------");
		for(Produto pro: produtos) {
			//System.out.println(pro.getNome());
			//System.out.println(pro.getPreco_unitario());
			//soma = soma + pro.getPreco_unitario();
		}
		
		
		//System.out.println("--------------------------------------------------");
		
		/*
		
		for(i = 0; i< v.length; i++) {
			System.out.println("lista do vetor que foi passado: " + v[i]);
			
		}
		
		*/
		
		
		for(Produto prod: produtos) {
			j = 0;
			for(j =0; j < v.length; j++) {
				if(prod.getId() == v[j]) {
					//System.out.println("O produto " + prod.getNome() + "tem o id " + prod.getId() + "e o vetor está com o id " + v[j]);
					soma = soma + prod.getPreco_unitario();
				}
			}
		}
		
		//System.out.println("a soma dos produtos é de " + soma);
		
		
		return soma;
		
	}

	

	


	public static void main(String[] args) throws ParseException {
		
		ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		Double valorTotal;
		List<String> clientesFuncionarios = new ArrayList<String>();
		List<String> clientesFornecedores = new ArrayList<String>();
		List<String> clientesClientes = new ArrayList<String>();
		
		

		List<String> telefo = new ArrayList<String>();
		
		telefo.add("12346");
		telefo.add("3455");
		
		
		
		Fornecedor fornecedor1 = new Fornecedor("Fornecedor 1", "fornecedor1@gmail,com", "endereco fornecedor 1", telefo , format.parse("22/03/2017"), "12356789");
		fornecedores.add(fornecedor1);
		clientesFornecedores.add("12356789");
		
		telefo.clear();
		
		telefo.add("12346900");
		telefo.add("345500");
		
		Fornecedor fornecedor2 = new Fornecedor("Fornecedor 2", "fornecedor2@gmail,com", "endereco fornecedor 2", telefo , format.parse("22/03/2017"), "67898");
		fornecedores.add(fornecedor2);
		clientesFornecedores.add("67898");
		
		telefo.clear();
		
		
		Produto produto = new Produto(2, "Teclado", 250.00, fornecedor1 );
				//int id, String nome, Double preco_.nitario, Fornecedor forn
		produtos.add(produto);
		
		produto = new Produto(4, "Mouse", 400.00, fornecedor2 );
		
		produtos.add(produto);
		
		produto = new Produto(6, "Monitor", 990.00, fornecedor1 );
		produtos.add(produto);
		
		produto = new Produto(8, "SSD", 100.00, fornecedor2 );
		
		produtos.add(produto);
		
		
		
		telefo.add("12900");
		telefo.add("3455");
		
		Cliente cliente = new Cliente("cliente 1", "cliente1@gmail.com", "endereco cliente 1", telefo, format.parse("04/05/2000"), "12367898777");
		clientes.add(cliente);
		clientesClientes.add("12367898777");
				
				//String nome, String email, String endereco, List<String> telefones,
				//Date data_nascimento, String cpf
		telefo.clear();
		
		telefo.add("45900");
		telefo.add("5500");
		
		cliente = new Cliente("cliente 2", "cliente2@gmail.com", "endereco cliente 2", telefo, format.parse("04/05/2000"), "3459867744");
		clientes.add(cliente);
		clientesClientes.add("3459867744");

		
		telefo.clear();
		telefo.add("67889");
		telefo.add("90999");
		
		cliente = new Cliente("cliente 3", "cliente3@gmail.com", "endereco cliente 3", telefo, format.parse("04/05/2000"), "3459867744454");
		clientes.add(cliente);
		clientesClientes.add("3459867744454");

		
		
		
		telefo.clear();
		telefo.add("88966");
		telefo.add("909977");
		Funcionario funcionario = new Funcionario("funcionario 1", "funcionario1@gmail.com", "endereco funcionario 1",telefo,format.parse("04/05/2020"), "auxiliar administrativo","34567654", format.parse("04/05/2020"));
		funcionarios.add(funcionario);
		clientesFuncionarios.add("34567654");
		
		telefo.clear();
		telefo.add("456786");
		telefo.add("90654345");
		
		funcionario = new Funcionario("funcionario 2", "funcionario2@gmail.com", "endereco funcionario 2",telefo,format.parse("04/05/2010"), "Gerente","5433456123", format.parse("08/05/2010"));
		funcionarios.add(funcionario);
		clientesFuncionarios.add("5433456123");


		
		
		
		valorTotal = main2(produtos, new int[]{4,6,8,8,8,8});
		Venda venda = new Venda(clientes, produtos, fornecedores, funcionarios, valorTotal, valorTotal);
		vendas.add(venda);
		venda.getValorFinalComDesconto(venda.getCliente().get(1).getCpf());


		//Cliente cliente, Produto produto, Fornecedor fornecedor, Funcionario funcionario, Double valorTotal,
		//Double valorFinal
		
		
		//System.out.println("Nome do cliente: " + venda.getCliente().get(1).getNome() + "Valor da conta:" + venda.getValorTotal());
		//System.out.println("o valor final para o cliente é de " + venda.getValorFinalComDesconto(venda.getCliente().get(1).getCpf()));


		
		//Double valorTotal;
		valorTotal = main2(produtos, new int[]{8,8,8});
		venda = new Venda(clientes, produtos, fornecedores, funcionarios, valorTotal, valorTotal);
		vendas.add(venda);
		//System.out.println("Nome do cliente: " + venda.getCliente().get(0).getNome() + "Valor da conta:" + venda.getValorTotal());
		//System.out.println(venda.getCliente().getCpf());
		//System.out.println("o valor final para o cliente é de " + venda.getValorFinalComDesconto(venda.getFornecedor().get(0).getCnpj()));
		//System.out.println(venda.getValorFinalComDesconto(venda.getCliente().get(1).getCpf()));
		venda.getValorFinalComDesconto(venda.getCliente().get(0).getCpf());
		
		
		
		
		valorTotal = main2(produtos, new int[] {4,2,8,6});
		venda = new Venda(clientes, produtos, fornecedores, funcionarios, valorTotal, valorTotal);
		vendas.add(venda);
		venda.getValorFinalComDesconto(venda.getFornecedor().get(1).getCnpj());
		
		
		
		valorTotal = main2(produtos, new int[] {4,4,4,8,6});
		venda = new Venda(clientes, produtos, fornecedores, funcionarios, valorTotal, valorTotal);
		vendas.add(venda);
		venda.getValorFinalComDesconto("15307988680");

		
		
	
		
		
	}
	
}
