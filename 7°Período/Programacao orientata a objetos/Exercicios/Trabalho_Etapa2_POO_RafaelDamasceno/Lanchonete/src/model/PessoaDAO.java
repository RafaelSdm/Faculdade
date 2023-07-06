package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexao.Conexao;

public class PessoaDAO {

	private Connection connection = Conexao.getConnection();

	public void selectCadastro() throws SQLException {

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM pessoa");
		System.out.println("Resultado para o select na tabela de cadastro: ");

		while (resultSet.next()) {
			Integer id = resultSet.getInt("id");
			String nome = resultSet.getString("nome");
			String cpf = resultSet.getString("cpf");

			// Faça algo com os dados recuperados...
			System.out.println(" > ID: " + id + " - Nome: " + nome + " - CPF: " + cpf);
		}

	}

	public void insertCadastro(String nome, String cpf) throws SQLException {

		String sql = "INSERT INTO pessoa (nome, cpf) VALUES (?, ?)";
		PreparedStatement stmt = connection.prepareStatement(sql);

		stmt.setString(1, nome);
		stmt.setString(2, cpf);

		int linhasAfetadas = stmt.executeUpdate();

		if (linhasAfetadas > 0) {
			System.out.println("Dados inseridos com sucesso!");
		} else {
			System.out.println("Falha ao inserir os dados.");
		}
	}

	// Outros métodos, como updateCadastro(), podem ser adicionados conforme necessário.
}