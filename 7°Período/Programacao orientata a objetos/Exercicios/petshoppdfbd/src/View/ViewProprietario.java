package View;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ViewProprietario extends JFrame {
	
	private static final long serialVersion = 1L;
	
	JTextField textEmail, textNome, textDNasc, textCpf, textTel, textEnd;
	
	JTextArea visor;
	
	JButton botaoProp;

	public ViewProprietario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout((LayoutManager) new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JLabel label = new JLabel("Cadastro de Proprietários>>>");
		add(label);
		add(new JLabel(" "));
		
		
		label = new JLabel("CPF");
	    add(label);
		textCpf = new JTextField(15);
		add(textCpf);
		//add(new JLabel(" "));
		
		label = new JLabel("Nome");
	    add(label);
		textNome = new JTextField(15);
		add(textNome);
		
		
		label = new JLabel("Data Nascimento");
	    add(label);
		textDNasc = new JTextField(15);
		add(textDNasc);
		
		label = new JLabel("Email");
	    add(label);
	    textEmail = new JTextField(15);
		add(textEmail);
		
		label = new JLabel("Telefone");
	    add(label);
		textTel = new JTextField(15);
		add(textTel);
		
		label = new JLabel("Endereço");
	    add(label);
		textEnd = new JTextField(50);
		add(textEnd);
		
		botaoProp = new JButton("Salvar");
		add(botaoProp);
		
		add(new JLabel(" "));
		label = new JLabel("Lista de Proprietários: ");
		add(label);
		
		add(new JLabel(" "));
		visor = new JTextArea(" ");
		add(visor);
		
		pack();
		setVisible(true);
	}

	public String getEmail() {
		return textEmail.getText();
	}

	public String getNome() {
		return textNome.getText();
	}

	public String getDNasc() {
		return textDNasc.getText();
	}

	public String getCpf() {
		return textCpf.getText();
	}

	public String getTel() {
		return textTel.getText();
	}

	public String getEnd() {
		return textEnd.getText();
	}
	
	public void setBotaoBehaviorProp(ActionListener botaoBehaviorProp) {
		botaoProp.addActionListener(botaoBehaviorProp);
	}

	public void setVisor(String result) {
		visor.setText(result);
	}


}
