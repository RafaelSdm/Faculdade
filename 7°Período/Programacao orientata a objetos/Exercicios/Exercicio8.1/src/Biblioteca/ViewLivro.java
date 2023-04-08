package Biblioteca;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewLivro  extends JFrame{
	JTextField id, nome, autor, ano_publicacao;
	
	JLabel visor;
	
	JButton botao;
	
	
	public ViewLivro() {
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    JLabel operador = new JLabel("Informe o id do livro");
	    add(operador);

	    id = new JTextField(8);
	    add(id);
	    
	    operador = new JLabel("Informe o nome do livro:");
	    add(operador);
	    nome = new JTextField(8);
	    add(nome);
	    
	    
	    operador = new JLabel("Informe o autor do livro");
	    add(operador);
	    
	    autor = new JTextField(8);
	    add(autor);
	    
	    
	    operador = new JLabel("Informe o ano de publicacao do livro");
	    add(operador);
	    
	    ano_publicacao =  new JTextField(8);
	    add(ano_publicacao);
	    
	    
	    visor = new JLabel(" ");
	    add(visor);
	    
	    visor = new JLabel(" ");
	    add(visor);
	    
	    visor = new JLabel(" ");
	    add(visor);
	    
	    botao = new JButton("Cadastrar Livro");
	    add(botao);
	    
	    

	    pack();
	    setVisible(true);
		
	}
	
	
	public String getid(){
		  return id.getText();
	}
	public String getnome(){
		  return nome.getText();
	}
	
	public String getautor() {
		return autor.getText();
	}
	
	public String getanopublicacao() {
		return ano_publicacao.getText();
	}
	
	
	public void setBotaoBehavior(ActionListener botaoBehavior){
		    botao.addActionListener(botaoBehavior);
	}

	public void setVisor(ModelLivro result){
		    //visor.setText("Nome do livro: " + result.getNome());
		    //visor.setText(result.getNome());
		    //visor.setText(result.getAutor());
		    //visor.setText(result.getAno_publicacao());
		    visor.setText("Nome: " + result.getNome() + "Autor: " + result.getAutor() + "Ano Publicacao: " + result.getAno_publicacao());



	}


	
	
	

}
