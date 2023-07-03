package View;

import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewCao extends JFrame {
private static final long serialVersion = 1L;
	
	JTextField textID, textNome, textIdade, textRaca, textCor, textSexo,
				textPorte, textPeso;

	JTextArea visor;
	
	JButton botaoCao;

	public ViewCao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout((LayoutManager) new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JLabel label = new JLabel("Cadastro de Cães>>>");
		add(label);
		add(new JLabel(" "));
		
		label = new JLabel("ID");
	    add(label);
		textID = new JTextField(8);
		add(textID);
		
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
		
		label = new JLabel("Porte");
	    add(label);
		textPorte = new JTextField(8);
		add(textPorte);
		
		label = new JLabel("Peso");
	    add(label);
		textPeso = new JTextField(8);
		add(textPeso);
		
		
		botaoCao = new JButton("Salvar");
		add(botaoCao);
		
		add(new JLabel(" "));
		label = new JLabel("Lista de Cães: ");
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
	
	public String getPorte() {
		return textPorte.getText();
	}
	
	public String getPeso() {
		return textPeso.getText();
	}
	
	public void setBotaoBehaviorCao(ActionListener botaoBehaviorCao) {
		botaoCao.addActionListener(botaoBehaviorCao);
	}

	public void setVisor(String result) {
		visor.setText(result);
	}


}
