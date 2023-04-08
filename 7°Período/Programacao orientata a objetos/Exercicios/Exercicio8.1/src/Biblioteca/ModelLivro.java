package Biblioteca;

public class ModelLivro {
	
	private Integer id;
	private String nome;
	private String autor;
	private String ano_publicacao;
	
	
	public ModelLivro() {
		
	}
	
	public ModelLivro(Integer id, String nome, String autor, String ano_publicacao) {
		this.setId(id);
		this.setNome(nome);
		this.setAutor(autor);
		this.setAno_publicacao(ano_publicacao);
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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAno_publicacao() {
		return ano_publicacao;
	}

	public void setAno_publicacao(String ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	
	
	

}
