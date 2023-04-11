package BibliotecaMVC;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CategoriaView extends JFrame {
	
	
	JTextField id;
	JTextField nome;
	JButton botao;
	
	public CategoriaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    
	    JLabel idCategoria = new JLabel("Informe o id da categoria:");
	    
	    id = new JTextField(10);
	    
	    JLabel nomeCategoria = new JLabel("Informe o nome da categoria:");
	    
	    nome = new JTextField(10);
	    
	    botao = new JButton("Cadastrar");
	    
	    
	    
	    
	    
	    
	    add(idCategoria);
	    add(nomeCategoria);
	    
	    
	    pack();
	    setVisible(true);
	    
	    
	    
	    
	    
	}
	
	
	 public void setBotaoBehavior(ActionListener botaoBehavior){
		 botao.addActionListener(botaoBehavior);
	  }
	 
	 
	 
	public String getId() {
		return id.getText();
	}
		
		
	public String getNome() {
		return nome.getText();
	}
	
	
	
	
	
	
	


}
