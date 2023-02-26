package Biblioteca;

public class Categoria {
	
	private Integer idCategoria;
	private String nome;
	
	
	public Categoria(Integer idCategoria, String nome) {
		this.idCategoria = idCategoria;
		this.nome = nome;
	}
	
	
	public Integer getidCategoria() {
		return idCategoria;
	}
	
	public void setIdCategoria(Integer idCategoria) {
		
		this.idCategoria = idCategoria;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
