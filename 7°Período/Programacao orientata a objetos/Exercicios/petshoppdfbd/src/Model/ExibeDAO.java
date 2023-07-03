package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Conexao.Conexao;

public class ExibeDAO {
	
	private Connection connection = Conexao.getConnection();
	
	public String selectCadastroCao(Integer cpf) throws SQLException {
	    StringBuilder result = new StringBuilder();
	    PreparedStatement statement = connection.prepareStatement("SELECT * from proprietario prop INNER JOIN proprietario_animal pa ON prop.cpf = pa.cpf_prop\r\n"
	            + "		\r\n"
	            + "		INNER JOIN cao ON pa.id_animal = cao.idCao\r\n"
	            + "     WHERE prop.cpf = ?");
	    statement.setInt(1, cpf);
	    ResultSet resultSet = statement.executeQuery();
	    //result.append("Resultado para do select: \n");
	    while (resultSet.next()) {
	        String nomeProp = resultSet.getString("prop.nome");
	        String nomeCao = resultSet.getString("cao.nome");
	
	        // Faça algo com os dados recuperados...
	        
	        result.append(" Nome Proprietario: ").append(nomeProp).append("\n");
	        result.append(" Nome Cao: ").append(nomeCao).append("\n");
	    }
	    return result.toString();
	}
	
	public String selectCadastroGato(Integer cpf) throws SQLException {
	    StringBuilder result = new StringBuilder();
	    PreparedStatement statement = connection.prepareStatement("SELECT * from proprietario prop INNER JOIN proprietario_animal pa ON prop.cpf = pa.cpf_prop\r\n"
	            + "		\r\n"     
	            + "		INNER JOIN gato ON pa.id_Animal = gato.idGato\r\n"
	            + "		\r\n"
	            + "     WHERE prop.cpf = ?");
	    statement.setInt(1, cpf);
	    ResultSet resultSet = statement.executeQuery();
	    //result.append("Resultado para do select: \n");
	    while (resultSet.next()) {
	        String nomeProp = resultSet.getString("prop.nome");
	        String nomeGato = resultSet.getString("gato.nome");

	        // Faça algo com os dados recuperados...
	        result.append("Nome Proprietario: ").append(nomeProp).append("\n");
	        result.append("Nome Gato: ").append(nomeGato).append("\n");
	
	    }
	    return result.toString();
	}
	
	public String selectCadastroPas(Integer cpf) throws SQLException {
	    StringBuilder result = new StringBuilder();
	    PreparedStatement statement = connection.prepareStatement("SELECT * from proprietario prop INNER JOIN proprietario_animal pa ON prop.cpf = pa.cpf_prop\r\n"
	           
	            + "		\r\n"
	            + "		INNER JOIN passaro ON pa.id_Animal = passaro.idPassaro\r\n"
	            + "     WHERE prop.cpf = ?");
	    statement.setInt(1, cpf);
	    ResultSet resultSet = statement.executeQuery();
	    //result.append("Resultado para do select: \n");
	    while (resultSet.next()) {
	        String nomeProp = resultSet.getString("prop.nome");
	        String nomePassaro = resultSet.getString("passaro.nome");

	        // Faça algo com os dados recuperados...
	        result.append("Nome Proprietario: ").append(nomeProp).append("\n");
	        result.append("Nome Passaro: ").append(nomePassaro).append("\n");

	    }
	    return result.toString();
	}

}