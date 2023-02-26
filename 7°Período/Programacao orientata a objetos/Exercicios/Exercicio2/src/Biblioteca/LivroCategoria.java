package Biblioteca;

public class LivroCategoria {
	
	private Integer id_livro;
	private Integer idCategoria;
	
	
	
	public LivroCategoria() {
		super();
	}
	
	public LivroCategoria(Integer id_livro, Integer idCategoria) {
		
		super();
		this.id_livro = id_livro;
		this.idCategoria = idCategoria;
		
		
	}
	
	
	public Integer getId_livro() {
		return id_livro;
		
	}
	
	public void setId_livro(Integer id_livro) {
		this.id_livro = id_livro;
	}
	
	
	public Integer getIdCategoria() {
		return idCategoria;
	}
	
	public void setGetIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

}
