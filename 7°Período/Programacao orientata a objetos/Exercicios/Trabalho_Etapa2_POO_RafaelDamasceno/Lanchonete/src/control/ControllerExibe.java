package control;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ControllerExibe {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/lanchonetebd";
        String username = "seu_usuario";
        String password = "sua_senha";

        String query = "SELECT * FROM pizza";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("relatorio_pizza.pdf"));
            document.open();

            while (resultSet.next()) {
                String sabor = resultSet.getString("sabor");
                double preco = resultSet.getDouble("preco");

                Paragraph paragraph = new Paragraph("Sabor: " + sabor + ", Preço: R$" + preco);
                document.add(paragraph);
            }

            document.close();
            resultSet.close();
            statement.close();
            connection.close();

            System.out.println("Relatório de pizza gerado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao gerar o relatório de pizza: " + e.getMessage());
        }
    }
}
