package BibliotecaMVC;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View  extends JFrame {
	
	JTextField textIDlivro, textNomeLivro, textAutor, textAnoPubli;
	JTextField textIdcategoria, textNomeCategoria;
	JTextField textidpertencelivro, textidcategoria;
	
	
	
	public View() {
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    
	    JLabel operador = new JLabel("Informe o id do livro");
	    add(operador);
	    textIDlivro = new JTextField(8);
	    add(textIDlivro);
	    
	    
	    operador  = new JLabel("Informe o nome do livro:");
	    add(operador);
	    
	    textNomeLivro = new JTextField(8);
	    add(textNomeLivro);
	    
	    operador = new JLabel("Informe o nome do livro:");
	    add(operador);
	    
	    
	    textAutor = new JTextField(8);
	    add(textAutor);
	    
	    operador = new JLabel("Informe o ano de publicacao do livro:");
	    
	    textAnoPubli = new JTextField(8);
	    add(textAnoPubli);
	    
	    
	    
	    
	    
	    
		
	}

	

}
