package View;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ViewRelacao extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	JTextField text_id_proprietario, text_id_animal;
	
	JTextArea visor;
	

	JButton botaoRelacao;
	
	public ViewRelacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		JLabel label = new JLabel("Relação Dono / Animal >>>");
		add(label);
		add(new JLabel(" "));
		
		label = new JLabel("ID do Proprietário");
	    add(label);
	    text_id_proprietario = new JTextField(8);
		add(text_id_proprietario);
		
		label = new JLabel("ID do Animal");
	    add(label);
	    text_id_animal = new JTextField(8);
		add(text_id_animal);
		
		botaoRelacao = new JButton("Salvar");
		add(botaoRelacao);
		
		label = new JLabel("Lista: ");
		add(label);
		visor = new JTextArea(" ");
		add(visor);
		
		pack();
		setVisible(true);
	}
	
	public String get_text_id_proprietario() {
		return text_id_proprietario.getText();
	}
	
	public String get_text_id_animal() {
		return text_id_animal.getText();
	}
	
	public void setBotaoBehaviorRelacao(ActionListener botaoBehaviorRelacao) {
		botaoRelacao.addActionListener(botaoBehaviorRelacao);
	}
	
	public void setVisor(String result) {
		visor.setText(result);
	}
	
	
	
}