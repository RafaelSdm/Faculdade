package BibliotecaMVC;

public class LivroCategoriaModel {
	
	private LivroModel livro;
	private CategoriaModel categoria;
	
	
	
	
	public LivroCategoriaModel(LivroModel livro, CategoriaModel categoria) {
		super();
		this.setLivro(livro);
		this.setCategoria(categoria);
	}




	public LivroModel getLivro() {
		return livro;
	}




	public void setLivro(LivroModel livro) {
		this.livro = livro;
	}




	public CategoriaModel getCategoria() {
		return categoria;
	}




	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}
	
	
	

}
