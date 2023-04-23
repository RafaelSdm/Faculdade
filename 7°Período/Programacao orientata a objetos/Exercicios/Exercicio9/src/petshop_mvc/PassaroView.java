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

public class PassaroView extends JFrame {
    private JList<Passaro> listaPassaros = new JList<>();
    private JTextField campoNome = new JTextField();
    private JTextField campoId = new JTextField();
    private JTextField campoCor = new JTextField();
    private JTextField campoSexo = new JTextField();
    private JTextField campoIdade = new JTextField();
    private JTextField campoRaca = new JTextField();
    private JTextField campoAnilha = new JTextField();
    private JButton botaoCadastrar = new JButton("Cadastrar");
    //int id, String nome, String cor, int idade, String sexo, String raca, String numeroAnilha
    
    
    public PassaroView() {
        super("Pet Shop - Cadastro de Passaros");

        // Define o layout da janela principal
        setLayout(new BorderLayout());

        // Cria o painel de cadastro
        JPanel painelCadastro = new JPanel(new GridLayout(10, 2));
        painelCadastro.add(new JLabel("Nome:"));
        painelCadastro.add(campoNome);
        painelCadastro.add(new JLabel("ID:"));
        painelCadastro.add(campoId);
        painelCadastro.add(new JLabel("Cor:"));
        painelCadastro.add(campoCor);
        painelCadastro.add(new JLabel("Idade:"));
        painelCadastro.add(campoIdade);
        painelCadastro.add(new JLabel("Sexo:"));
        painelCadastro.add(campoSexo);
        painelCadastro.add(new JLabel("Numero da anilha:"));
        painelCadastro.add(campoAnilha);
        painelCadastro.add(new JLabel("Raca:"));
        painelCadastro.add(campoRaca);
        painelCadastro.add(new JLabel());
        painelCadastro.add(botaoCadastrar);

        // Cria o painel de listagem
        JPanel painelListagem = new JPanel(new BorderLayout());
        painelListagem.add(new JLabel("Gatos Cadastrados"), BorderLayout.NORTH);
        painelListagem.add(new JScrollPane(listaPassaros), BorderLayout.CENTER);

        // Adiciona os painéis à janela principal
        add(painelCadastro, BorderLayout.NORTH);
        add(painelListagem, BorderLayout.CENTER);

        // Configura a janela principal
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    
    public Passaro cadastrarPassaro() {
        String nome = campoNome.getText();
        int id = Integer.parseInt(campoId.getText());
        String cor = campoCor.getText();
        String sexo = campoSexo.getText();
        String anilha = campoAnilha.getText();
        String raca = campoRaca.getText();
        int idade = Integer.parseInt(campoIdade.getText());
        return new Passaro(id, nome, cor, idade, sexo, raca, anilha);

    }
    public void mostrarGatos(ArrayList<Passaro> passaros) {
        listaPassaros.setListData(passaros.toArray(new Passaro[0]));
    }

    public void addBotaoCadastrarListener(ActionListener listener) {
        botaoCadastrar.addActionListener(listener);
    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }
	
}








