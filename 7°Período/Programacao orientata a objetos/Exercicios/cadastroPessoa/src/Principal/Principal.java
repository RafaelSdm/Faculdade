package Principal;



import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import conexao.ConexaoBanco;
import model.PessoaDAO;

public class Principal {
	public static void main (String[] args) throws SQLException {
		
		
		//DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//Date date = new Date();
		
		ConexaoBanco conexaoBanco = new ConexaoBanco();
		
//		
//		//Testando a ConexÃ£o com o Banco
//		if (conexaoBanco.testarConexÃ£o()) {
//			System.out.println("Banco OK");
//		}else {
//			System.out.println("Falha o Banco");
//		}
//		//Fim do teste de conexÃ£o
		
		
		conexaoBanco.conectarBanco();
		
		System.out.println("Select da tabela cadastro:");
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		pessoaDAO.selectCadastro();
		//pessoaDAO.insertCadastro("3", "nome1", "Endereco1", new Date(0));
		//pessoaDAO.insertCadastro("45493800668", "nome2", "rua 15",new Date(0));
		//pessoaDAO.insertCadastro("78965412366", "nome3", "rua 15",new Date(0));
		//pessoaDAO.insertCadastro("74125896355", "nome4", "rua 7",new Date(0));
		//pessoaDAO.insertCadastro("75315985277", "nome5", "rua 12",new Date(0));
		
		
		
		System.out.println("SELECT dos novos usuarios na tabela cadastro: ");
		pessoaDAO.selectCadastro();

		//pessoaDAO.alterarCadastro("1234567890", "Beltrano", "78965412366");
		
		pessoaDAO.selectCadastro();
		//pessoaDAO.excluirCadastro("3");
		//pessoaDAO.excluirCadastro("75315985277");
		//pessoaDAO.excluirCadastro("74125896355");
		
		pessoaDAO.selectCadastro();
		
		//pessoaDAO.excluirTudo();
		
		pessoaDAO.selectCadastro();
		
		
		
			
		ConexaoBanco.fecharConexao();	
	}
}