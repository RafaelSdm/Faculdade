package view;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;

import control.salgadoControler;

public class cadastroViewSalgado extends JFrame {
	
	private JLabel lblNome;
    private JTextField txtNome;
    private JLabel lblCpf;
    private JTextField txtCpf;
    private JButton btnCadastrar;
    private salgadoControler controller;

    public cadastroViewSalgado(salgadoControler controller) {
        setTitle("Cadastro de Cliente");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.controller = controller;

        lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);
        lblCpf = new JLabel("CPF:");
        txtCpf = new JTextField(20);
        btnCadastrar = new JButton("Cadastrar");

        JPanel panel = new JPanel();
        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblCpf);
        panel.add(txtCpf);
        panel.add(btnCadastrar);

        add(panel);

        pack();
        setLocationRelativeTo(null);
        
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String cpf = txtCpf.getText();
                controller.cadastrarCliente(nome, cpf);
                JOptionPane.showMessageDialog(null, "Novo cliente cadastrado:\nNome: " + nome + "\nCPF: " + cpf);
                dispose();
            }
        });
    }
    
    
	
}
