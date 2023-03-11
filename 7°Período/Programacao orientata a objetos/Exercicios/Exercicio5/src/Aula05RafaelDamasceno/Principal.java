package Aula05RafaelDamasceno;


import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal {
	
	static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

	
	//	private static final int  = 0;

	public static void main(String[] args) throws ParseException {
		
		ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		
		

		List<String> telefo = new ArrayList<String>();
		
		telefo.add("12346");
		telefo.add("3455");
		
		
		
		Fornecedor fornecedor1 = new Fornecedor("Fornecedor 1", "fornecedor1@gmail,com", "endereco fornecedor 1", telefo , format.parse("22/03/2017"), "12356789");
		fornecedores.add(fornecedor1);
		
		telefo.clear();
		
		telefo.add("12346900");
		telefo.add("345500");
		
		Fornecedor fornecedor2 = new Fornecedor("Fornecedor 2", "fornecedor2@gmail,com", "endereco fornecedor 2", telefo , format.parse("22/03/2017"), "67898");
		fornecedores.add(fornecedor2);
		
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
				
				//String nome, String email, String endereco, List<String> telefones,
				//Date data_nascimento, String cpf
		telefo.clear();
		
		telefo.add("45900");
		telefo.add("5500");
		
		cliente = new Cliente("cliente 2", "cliente2@gmail.com", "endereco cliente 2", telefo, format.parse("04/05/2000"), "3459867744");
		clientes.add(cliente);
		
		telefo.clear();
		telefo.add("67889");
		telefo.add("90999");
		
		cliente = new Cliente("cliente 3", "cliente3@gmail.com", "endereco cliente 3", telefo, format.parse("04/05/2000"), "3459867744");
		clientes.add(cliente);
		
		
		
		telefo.clear();
		telefo.add("88966");
		telefo.add("909977");
		Funcionario funcionario = new Funcionario("funcionario 1", "funcionario1@gmail.com", "endereco funcionario 1",telefo,format.parse("04/05/2020"), "auxiliar administrativo","34567654", format.parse("04/05/2020"));
		funcionarios.add(funcionario);
		
		
		telefo.clear();
		telefo.add("456786");
		telefo.add("90654345");
		
		funcionario = new Funcionario("funcionario 2", "funcionario2@gmail.com", "endereco funcionario 2",telefo,format.parse("04/05/2010"), "Gerente","5433456123", format.parse("08/05/2010"));
				//String nome, String email, String endereco, List<String> telefones, Date data_admissao,
				//String cargo, String cpf, Date dataNascimento
		funcionarios.add(funcionario);
		
		
		
		Venda venda = new Venda(clientes.get(0), produtos, fornecedor1, funcionarios.get(0), 4000.00, 2000.00);
		vendas.add(venda);
		//Cliente cliente, Produto produto, Fornecedor fornecedor, Funcionario funcionario, Double valorTotal,
		//Double valorFinal
		


		
		
		
		
		
		
		for(Fornecedor forn: fornecedores) {
			System.out.println(forn.getNome());
			System.out.println(forn.getTelefones());

		}
		
		for(Produto prod: produtos) {
			System.out.println(prod.getNome());
			System.out.println(prod.getForn().getNome());
		}
		
		System.out.println("=======================================");
		for(Cliente cli: clientes) {
			System.out.println(cli.getNome());
			System.out.println(cli.getCpf());
			System.out.println(cli.getTelefones());
			System.out.println("------------------------------------");
		}
		
		
		System.out.println("-----------------------------------------");
		
		for(Funcionario fun: funcionarios) {
			System.out.println(fun.getNome());
			System.out.println(fun.getCpf());
			System.out.println("---------------------------");
			
		}
		
		
		System.out.println(produtos.get(0));
		
		System.out.println("-----------------------------");
		for(Venda ven: vendas) {
			System.out.println(ven.getCliente().getNome());
			System.out.println(ven.getProduto().get(3).getNome());
			
		}
		
	}
	
}
