package BibliotecaMVC;

public class CategoriaModel {
	
	private Integer id;
	private String nome;
	
	
	
	public CategoriaModel(Integer id, String nome) {
		super();
		this.setId(id);
		this.setNome(nome);
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
