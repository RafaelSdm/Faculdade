package model;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexao.ConexaoBanco;

public class PessoaDAO {
	
	private Connection connection = ConexaoBanco.getConnection();
	
	public void selectCadastro() throws SQLException{
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM cadastro");
		System.out.println("Resultado para o select na tabela de cadastro: ");
		
		while (resultSet.next()) {
            String cpf = resultSet.getString("cpf");
            String nome = resultSet.getString("nome");
            String endereco = resultSet.getString("endereco");
            Date datanasc = resultSet.getDate("datanasc");
            // FaÃ§a algo com os dados recuperados...
            System.out.println("CPF: "+cpf+" Nome: "+nome+" EndereÃ§o: "+endereco+" Data de Nascimento: "+datanasc);
        }   
		
	}
	
	
public void insertCadastro(String cpf, String nome,String endereco, Date datanasc) throws SQLException{
		
		//Inserindo dados
	    String sql = "INSERT INTO cadastro (cpf, nome, endereco, datanasc) VALUES (?, ?, ?, ?)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    
	    stmt.setString(1, cpf);
	    stmt.setString(2, nome);
	    stmt.setString(3, endereco);
	    stmt.setDate(4, datanasc);
	    
	 // Executar a declaraÃ§Ã£o preparada
        int linhasAfetadas = stmt.executeUpdate();

        // Verificar se a inserÃ§Ã£o foi bem-sucedida
        if (linhasAfetadas > 0) {
            System.out.println("Dados inseridos com sucesso!");
        } else {
            System.out.println("Falha ao inserir os dados.");
        }
	}


	public void alterarCadastro(String cpf, String nome, String cpfAntigo) throws SQLException{
		
		String sql = "UPDATE cadastro SET cpf =? , nome =? WHERE cpf =?";
	    PreparedStatement stmt = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    
	    stmt.setString(1, cpf);
	    stmt.setString(2, nome);
	    stmt.setString(3, cpfAntigo);
	  
	    
	 // Executar a declaraÃ§Ã£o preparada
        int linhasAfetadas = stmt.executeUpdate();

        // Verificar se a inserÃ§Ã£o foi bem-sucedida
        if (linhasAfetadas > 0) {
            System.out.println("Dados Alterados com Sucesso");
        } else {
            System.out.println("Falha ao alterar os dados.");
        }
		
		
		
	}
	
	
public void excluirCadastro(String cpf) throws SQLException{
		
		String sql = "DELETE FROM cadastro WHERE cpf =?";
	    PreparedStatement stmt = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    
	    stmt.setString(1, cpf);
	  
	    
	 // Executar a declaraÃ§Ã£o preparada
        int linhasAfetadas = stmt.executeUpdate();

        // Verificar se a inserÃ§Ã£o foi bem-sucedida
        if (linhasAfetadas > 0) {
            System.out.println("Dados deletados com Sucesso");
        } else {
            System.out.println("Falha ao deletar os dados.");
        }
		
		
		
	}


public void excluirTudo() throws SQLException{
	
	String sql = "DELETE FROM cadastro";
    PreparedStatement stmt = connection.prepareStatement(sql);
	// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
    
    
    
 // Executar a declaraÃ§Ã£o preparada
    int linhasAfetadas = stmt.executeUpdate();

    // Verificar se a inserÃ§Ã£o foi bem-sucedida
    if (linhasAfetadas > 0) {
        System.out.println("Dados deletados com Sucesso");
    } else {
        System.out.println("Falha ao deletar os dados.");
    }
	
	
	
}

}