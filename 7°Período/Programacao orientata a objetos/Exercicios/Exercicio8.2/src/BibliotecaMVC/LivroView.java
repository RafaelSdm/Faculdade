package BibliotecaMVC;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class LivroView {
    private JTextField txtId;
    private JTextField txtNome;
    private JTextField txtAutor;
    private JTextField txtAnoPublicacao;
    private JButton btnCadastrar;
    private JButton btnMostrarLivros;

    public LivroView(LivroController controller) {
        JLabel lblId = new JLabel("ID: ");
        txtId = new JTextField(10);
        JLabel lblNome = new JLabel("Nome: ");
        txtNome = new JTextField(20);
        JLabel lblAutor = new JLabel("Autor: ");
        txtAutor = new JTextField(20);
        JLabel lblAnoPublicacao = new JLabel("Ano de Publicação: ");
        txtAnoPublicacao = new JTextField(4);
        btnCadastrar = new JButton("Cadastrar");
        btnMostrarLivros = new JButton("Mostrar Livros");

        JPanel panel = new JPanel(new GridLayout(6, 2));
    
        panel.add(lblId);
        panel.add(txtId);
        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblAutor);
        panel.add(txtAutor);
        panel.add(lblAnoPublicacao);
        panel.add(txtAnoPublicacao);
        panel.add(btnCadastrar);
        panel.add(btnMostrarLivros);

        JFrame frame = new JFrame("Cadastro de Livros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String autor = txtAutor.getText();
                String anoString = txtAnoPublicacao.getText();
                int id, ano;

                // Validação dos campos
                if (nome.isEmpty() || autor.isEmpty() || anoString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
                    return;
                }

                try {
                	id = Integer.parseInt(txtId.getText());
                    ano = Integer.parseInt(anoString);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "O ID e o ano de publicação devem ser números inteiros.");
                    return;
                }

                Livro livro = new Livro();
                livro.setId(id);
                livro.setNome(nome);
                livro.setAutor(autor);
                livro.setAnoPublicacao(ano);

                controller.cadastrarLivro(livro);

                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso.");
                txtId.setText("");
                txtNome.setText("");
                txtAutor.setText("");
                txtAnoPublicacao.setText("");
            }
        });

        btnMostrarLivros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Livro> livros = controller.getLivros();
     
                if (livros.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum livro cadastrado.");
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (Livro livro : livros) {
                        sb.append(livro).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                }
            }
        });
    }

	public void exibirTelaCadastro() {
		// TODO Auto-generated method stub
		
	}

	public void exibirListaCategorias() {
		// TODO Auto-generated method stub
		
	}
}

