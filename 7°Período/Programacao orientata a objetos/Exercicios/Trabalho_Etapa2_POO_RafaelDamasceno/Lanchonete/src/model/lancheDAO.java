package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexao.Conexao;

public class lancheDAO {
    public static Double minhaVariavelGlobal = 10.0;


	private Connection connection = Conexao.getConnection();

	public void selectCadastro() throws SQLException {

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM lanche");
		System.out.println("Resultado para o select na tabela de cadastro: ");

		while (resultSet.next()) {
			Integer id = resultSet.getInt("id");
			String sabor = resultSet.getString("sabor");
			String tamanho = resultSet.getString("tamanho");
			Integer pessoa_id = resultSet.getInt("pessoa_id");
			Double preco = resultSet.getDouble("preco");

			// Faça algo com os dados recuperados...
			System.out.println(" > ID: " + id + " - Sabor: " + sabor + " - Tamanho: " + tamanho
					+ " - Pessoa ID: " + pessoa_id + " - Preço: " + preco);
		}

	}

	public void insertCadastro(String sabor, String tamanho, Pessoa pessoa)
			throws SQLException {

		String sql = "INSERT INTO lanche (sabor, tamanho, id, preco) VALUES (?, ?, ?, ?)";
		PreparedStatement stmt = connection.prepareStatement(sql);

		stmt.setString(1, sabor);
		//stmt.setString(2, borda);
		stmt.setString(2, tamanho);
		stmt.setString(3, pessoa.getCpf());
		//stmt.setString(5, pessoa.getCpf());
		stmt.setDouble(4, minhaVariavelGlobal);

		int linhasAfetadas = stmt.executeUpdate();

		if (linhasAfetadas > 0) {
			System.out.println("Dados inseridos com sucesso!");
		} else {
			System.out.println("Falha ao inserir os dados.");
		}
	}

	// Outros métodos, como updateCadastro(), podem ser adicionados conforme necessário.
}