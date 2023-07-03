package View;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewExibe extends JFrame{
	
private static final long serialVersionUID = 1L;
	
	JTextField text_cpf_proprietario;
	
	JButton botaoGerarPdf;
	
	public ViewExibe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		setLayout(new FlowLayout());

		
		JLabel label = new JLabel("cpf:");
		add(label);
		add(new JLabel(" "));
		
		text_cpf_proprietario = new JTextField(8);
		add(text_cpf_proprietario);
		
		botaoGerarPdf = new JButton("Gerar PDF");
		add(botaoGerarPdf);
		
		pack();
		setVisible(true);
	}
	
	
	//**********************************************************************
	
	public String get_text_cpf_prop() {
		return text_cpf_proprietario.getText();
	}
	
	public void setBotaoBehaviorGerarPdf(ActionListener botaoBehaviorGerarPdf) {
		botaoGerarPdf.addActionListener( botaoBehaviorGerarPdf);
	}
	
}