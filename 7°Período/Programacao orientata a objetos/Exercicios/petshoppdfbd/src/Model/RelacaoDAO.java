package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexao.Conexao;



public class RelacaoDAO {
	
	private Connection connection = Conexao.getConnection();
	
	public void selectCadastro() throws SQLException{
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM proprietario_animal");
		System.out.println("Resultado para o select na tabela de cadastro: ");
		
		while (resultSet.next()) {
            Integer cpf_prop = resultSet.getInt("cpf_prop");
            Integer id_animal = resultSet.getInt("id_animal");
            
            
            // FaÃ§a algo com os dados recuperados...
            System.out.println(" > Cpf Dono: "+cpf_prop+" - ID Animal: "+id_animal);
        }   
		
	}
	
	
public void insertCadastro(Integer cpf_dono, Integer id_animal) throws SQLException{
		
		//Inserindo dados
	    String sql = "INSERT INTO proprietario_animal (cpf_prop, id_animal) VALUES (?, ?)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    
	    stmt.setInt(1, cpf_dono); 
	    stmt.setInt(2, id_animal);
	    
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