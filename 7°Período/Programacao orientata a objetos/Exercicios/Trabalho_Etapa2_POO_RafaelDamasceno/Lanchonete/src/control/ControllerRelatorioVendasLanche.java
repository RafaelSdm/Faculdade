package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import view.ViewRelatorioVendas;
import view.ViewRelatorioVendasLanches;

public class ControllerRelatorioVendasLanche {
    private ViewRelatorioVendasLanches view;

    public ControllerRelatorioVendasLanche(ViewRelatorioVendasLanches view) {
        this.view = view;

        this.view.setBotaoGerarRelatorioListener(new BotaoGerarRelatorioListener());
    }

    class BotaoGerarRelatorioListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String jdbcURL = "jdbc:mysql://localhost:3306/lanchonetebd";
        	    String user = "root";
        	    String password = "";

                String query = "SELECT * FROM lanche";

                Connection connection = DriverManager.getConnection(jdbcURL, user, password);
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();

                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream("D:\\pdfPadrao\\lanche.pdf"));
                document.open();


                while (resultSet.next()) {
                    String data = resultSet.getString("tamanho");
                    String produto = resultSet.getString("sabor");
                    Double quantidade = resultSet.getDouble("preco");

                    Paragraph paragraph = new Paragraph("Tamanho: " + data + "\nProduto: " + produto + "\nPreco: " );
                    document.add(paragraph);
                }


                document.close();
                resultSet.close();
                statement.close();
                connection.close();

                JOptionPane.showMessageDialog(view, "Relatório de vendas gerado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(view, "Erro ao gerar o relatório de vendas: " + ex.getMessage());
            }
        }
    }
}
