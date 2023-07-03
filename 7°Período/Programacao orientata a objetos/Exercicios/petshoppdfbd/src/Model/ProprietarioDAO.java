package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexao.Conexao;



public class ProprietarioDAO {
	
	private Connection connection = Conexao.getConnection();
	
	public void selectCadastro() throws SQLException{
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM proprietario");
		System.out.println("Resultado para o select na tabela de cadastro: ");
		
		while (resultSet.next()) {
            Integer cpf = resultSet.getInt("cpf");
            String nome = resultSet.getString("nome");
            String tel = resultSet.getString("telefone");
            String email = resultSet.getString("email");
            Date dataNas = resultSet.getDate("data_nasc");
            String end = resultSet.getString("endereco");
            
            // FaÃ§a algo com os dados recuperados...
            System.out.println(" > Cpf: "+cpf+" - Nome: "+nome+" - Tel: "+tel+" - Email: "+email 
            		+" - End: "+end+" - Data Nascimento: "+dataNas);
        }   
		
	}
	
	
public void insertCadastro(Integer cpf, String nome,String tel, String email, Date data, String end) throws SQLException{
		
		//Inserindo dados
	    String sql = "INSERT INTO proprietario (cpf, nome, telefone, email, data_nasc, endereco) VALUES (?, ?, ?, ?, ?, ?)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    
	    stmt.setInt(1, cpf); 
	    stmt.setString(2, nome);
	    stmt.setString(3, tel);
	    stmt.setString(4, email);
	    stmt.setDate(5, data);
	    stmt.setString(6, end);
	    
	    
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
