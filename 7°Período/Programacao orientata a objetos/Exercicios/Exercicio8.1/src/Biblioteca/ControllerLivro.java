package Biblioteca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import exemploMVC.Controller.BotaoBehavior;

public class ControllerLivro {
	
	ModelLivro modelLivro;
	ViewLivro viewLivro;
	
	
	public ControllerLivro(ModelLivro amodelLivro, ViewLivro aviewLivro ) {
		modelLivro = amodelLivro;
		viewLivro = aviewLivro;
		
	    viewLivro.setBotaoBehavior(new BotaoBehavior());

	}
	
	
	class BotaoBehavior implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String id = viewLivro.getid();
			String nome = viewLivro.getnome();
			String autor = viewLivro.getautor();
			String ano_publicacao = viewLivro.getanopublicacao();
			
			Integer id1 = Integer.parseInt(id);
			
			modelLivro.setModelLivro(id1, nome, autor, ano_publicacao);
			
			
			//String resultado = modelLivro.retornaNome(nome);
			//String resultado = modelLivro
			
			
			
			
			
			viewLivro.setVisor(modelLivro);
			//viewLivro.setVisor1(modelLivro);
			
			
		}

	}


}
