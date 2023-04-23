package petshop_mvc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ProprietarioView extends JFrame {
    private JList<Proprietario> listaProprietarios = new JList<>();
    private JTextField campoNome = new JTextField();
    private JTextField campoId = new JTextField();
    private JTextField campoCpf = new JTextField();
    private JTextField campoEndereco = new JTextField();
    private JButton botaoCadastrar = new JButton("Cadastrar");

    public ProprietarioView() {
        super("Pet Shop - Cadastro de Proprietários");

        // Define o layout da janela principal
        setLayout(new BorderLayout());

        // Cria o painel de cadastro
        JPanel painelCadastro = new JPanel(new GridLayout(5, 2));
        painelCadastro.add(new JLabel("Nome:"));
        painelCadastro.add(campoNome);
        painelCadastro.add(new JLabel("ID:"));
        painelCadastro.add(campoId);
        painelCadastro.add(new JLabel("CPF:"));
        painelCadastro.add(campoCpf);
        painelCadastro.add(new JLabel("Endereço:"));
        painelCadastro.add(campoEndereco);
        painelCadastro.add(new JLabel());
        painelCadastro.add(botaoCadastrar);

        // Cria o painel de listagem
        JPanel painelListagem = new JPanel(new BorderLayout());
        painelListagem.add(new JLabel("Proprietários Cadastrados"), BorderLayout.NORTH);
        painelListagem.add(new JScrollPane(listaProprietarios), BorderLayout.CENTER);

        // Adiciona os painéis à janela principal
        add(painelCadastro, BorderLayout.NORTH);
        add(painelListagem, BorderLayout.CENTER);

        // Configura a janela principal
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public Proprietario cadastrarProprietario() {
        String nome = campoNome.getText();
        int id = Integer.parseInt(campoId.getText());
        String cpf = campoCpf.getText();
        String endereco = campoEndereco.getText();
        return new Proprietario(nome, id, cpf, endereco);
    }
    public void mostrarProprietarios(ArrayList<Proprietario> proprietarios) {
        listaProprietarios.setListData(proprietarios.toArray(new Proprietario[0]));
    }

    public void addBotaoCadastrarListener(ActionListener listener) {
        botaoCadastrar.addActionListener(listener);
    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }
}


