package View;

import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewPassaro extends JFrame {
private static final long serialVersion = 1L;
	
	JTextField textID, textNome, textIdade, textRaca, textCor, textSexo,
				textAnilha;

	JTextArea visor;
	
	JButton botaoPassaro;

	public ViewPassaro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		//setLayout(new FlowLayout());
		setLayout((LayoutManager) new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JLabel label = new JLabel("Cadastro de Passaros>>>");
		add(label);
		add(new JLabel(" "));
		
		label = new JLabel("ID");
	    add(label);
		textID = new JTextField(8);
		add(textID);
		//add(new JLabel(" "));
		
		label = new JLabel("Nome");
	    add(label);
		textNome = new JTextField(15);
		add(textNome);
		
		
		label = new JLabel("Idade");
	    add(label);
		textIdade = new JTextField(8);
		add(textIdade);
		
		label = new JLabel("Raça");
	    add(label);
		textRaca = new JTextField(8);
		add(textRaca);
		
		label = new JLabel("Cor");
	    add(label);
		textCor = new JTextField(8);
		add(textCor);
		
		label = new JLabel("Sexo");
	    add(label);
		textSexo = new JTextField(8);
		add(textSexo);
		
		label = new JLabel("Anilha");
	    add(label);
		textAnilha = new JTextField(8);
		add(textAnilha);
		
		botaoPassaro = new JButton("Salvar");
		add(botaoPassaro);
		
		add(new JLabel(" "));
		label = new JLabel("Lista de Passaros: ");
		add(label);
		
		add(new JLabel(" "));
		visor = new JTextArea(" ");
		add(visor);
		
		pack();
		setVisible(true);
	}

	public String getID() {
		return textID.getText();
	}

	public String getNome() {
		return textNome.getText();
	}

	public String getIdade() {
		return textIdade.getText();
	}

	public String getRaca() {
		return textRaca.getText();
	}

	public String getCor() {
		return textCor.getText();
	}

	public String getSexo() {
		return textSexo.getText();
	}
	
	public String getAnilha() {
		return textAnilha.getText();
	}
	

	public void setBotaoBehaviorPassaro(ActionListener botaoBehaviorPassaro) {
		botaoPassaro.addActionListener(botaoBehaviorPassaro);
	}

	public void setVisor(String result) {
		visor.setText(result);
	}


}
