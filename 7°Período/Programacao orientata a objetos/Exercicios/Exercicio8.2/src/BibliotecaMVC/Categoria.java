package BibliotecaMVC;

public class Categoria {
	
	private Integer idCategoria;
	private String nomeCategoria;
	
	public Categoria() {
		
	}
	
	
	
	public Categoria(Integer idCategoria, String nomeCategoria) {
		this.setIdCategoria(idCategoria);
		this.setNomeCategoria(nomeCategoria);
	}



	public Integer getIdCategoria() {
		return idCategoria;
	}



	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}



	public String getNomeCategoria() {
		return nomeCategoria;
	}



	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	
	
	

}
