package Biblioteca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import exemploMVC.Controller.BotaoBehavior;

public class ControllerLivro {
	
	ModelLivro modelLivro;
	ViewLivro viewLivro;
	
	
	public ControllerLivro(ModelLivro modelLivro, ViewLivro viewLivro ) {
		modelLivro = modelLivro;
		viewLivro = viewLivro;
		
	    viewLivro.setBotaoBehavior(new BotaoBehavior());

	}
	
	
	class BotaoBehavior implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String id = viewLivro.getid();
			String nome = viewLivro.getnome();
			String autor = viewLivro.getautor();
			String ano_publicacao = viewLivro.getanopublicacao();
			
			
			
			
			
		}

	}


}
