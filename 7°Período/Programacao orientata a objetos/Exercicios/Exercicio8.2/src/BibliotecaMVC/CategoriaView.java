package BibliotecaMVC;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class CategoriaView extends JFrame {
    private JLabel lblNome;
    private JTextField txtNome;
    private JButton btnCadastrar;
    private JButton btnMostrarCategorias;
    private CategoriaController controller;

    public CategoriaView() {
        super("Cadastro de Categorias");

        lblNome = new JLabel("Nome da Categoria:");
        txtNome = new JTextField(20);
        btnCadastrar = new JButton("Cadastrar");
        btnMostrarCategorias = new JButton("Mostrar Categorias");

        JPanel pnlCampos = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlCampos.add(lblNome);
        pnlCampos.add(txtNome);

        JPanel pnlBotoes = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlBotoes.add(btnCadastrar);
        pnlBotoes.add(btnMostrarCategorias);

        JPanel pnlPrincipal = new JPanel(new BorderLayout());
        pnlPrincipal.add(pnlCampos, BorderLayout.NORTH);
        pnlPrincipal.add(pnlBotoes, BorderLayout.SOUTH);

        add(pnlPrincipal);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);

        controller = new CategoriaController(this);
        btnMostrarCategorias.addActionListener(e -> controller.mostrarCategorias());
        btnCadastrar.addActionListener(e -> controller.cadastrarCategoria());
    }

    public String getNome() {
        return txtNome.getText();
    }

    public void limparCampos() {
        txtNome.setText("");
    }

    public static void main(String[] args) {
        new CategoriaView();
    }
}



	
	
	
	
	



