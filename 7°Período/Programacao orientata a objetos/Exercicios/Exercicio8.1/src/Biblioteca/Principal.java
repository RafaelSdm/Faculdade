package Biblioteca;

public class Principal {
	
	public static void main(String[] args) {
		ModelLivro modelLivro = new ModelLivro();
		ViewLivro viewLivro = new ViewLivro();
		
		new ControllerLivro(modelLivro, viewLivro);
		
		
		
	}

}
