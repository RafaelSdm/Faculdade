package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexao.Conexao;



public class PassaroDAO {
	
	private Connection connection = Conexao.getConnection();
	
	public void selectCadastro() throws SQLException{
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM passaro");
		System.out.println("Resultado para o select na tabela de cadastro: ");
		
		while (resultSet.next()) {
            Integer idPassaro = resultSet.getInt("idPassaro");
            String nome = resultSet.getString("nome");
            String cor = resultSet.getString("cor");
            Integer idade = resultSet.getInt("idade");
            String raca = resultSet.getString("raca");
            String sexo = resultSet.getString("sexo");
            Integer anilha = resultSet.getInt("anilha");
            
            
            // FaÃ§a algo com os dados recuperados...
            System.out.println(" > ID Passaro: "+idPassaro+" - Nome: "+nome+" - Cor: "+cor+" - Idade: "+idade + " - Raca: " + raca +
            		" - Sexo: " + sexo + " - Anilha: " + anilha);
        }   
		
	}
	
	
public void insertCadastro(Integer id, String nome,String cor, Integer idade,
			String raca, String sexo, Integer anilha ) throws SQLException{
		
		//Inserindo dados
	    String sql = "INSERT INTO passaro (idPassaro, nome, cor, idade, raca, sexo, anilha) VALUES (?, ?, ?, ?, ?, ?, ?)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    
	    stmt.setInt(1, id); 
	    stmt.setString(2, nome);
	    stmt.setString(3, cor);
	    stmt.setInt(4, idade);
	    stmt.setString(5, raca); 
	    stmt.setString(6, sexo);
	    stmt.setInt(7, anilha);
	 
	    
	 // Executar a declaraÃ§Ã£o preparada
        int linhasAfetadas = stmt.executeUpdate();

        // Verificar se a inserÃ§Ã£o foi bem-sucedida
        if (linhasAfetadas > 0) {
            System.out.println("Dados inseridos com sucesso!");
        } else {
            System.out.println("Falha ao inserir os dados.");
        }
	}

//public void updateCadastro(String cpf, String nome) throws SQLException{
//	
//	//Inserindo dados
//    String sql = "UPDATE cadastro SET cpf=?, nome=?  WHERE CPF=(SELECT cpf FROM cadastro ORDER BY cpf LIMIT 2, 1)";
//    PreparedStatement stmt = connection.prepareStatement(sql);
//	// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
//    
//    stmt.setString(1, nome);
//    stmt.setString(2, cpf);
//    
// // Executar a declaraÃ§Ã£o preparada
//    int linhasAfetadas = stmt.executeUpdate();
//
//    // Verificar se a inserÃ§Ã£o foi bem-sucedida
//    if (linhasAfetadas > 0) {
//        System.out.println("Dados atualizados com sucesso!");
//    } else {
//        System.out.println("Falha ao atualizar os dados.");
//    }
}
