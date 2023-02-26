package Biblioteca;

public class Livro {
	private Integer id_livro;
	private String nome;
	private String author;
	private Integer ano_publicacao;
	
	
	
	public Livro(Integer id_livro, String nome, String author, Integer ano_publicacao) {
		super();
		this.id_livro = id_livro;
		this.nome = nome;
		this.author = author;
		this.ano_publicacao = ano_publicacao;
		
		
	}
	
	
	public Integer getid_livro() {
		return  id_livro;
	}
	
	public void setId_livro(Integer id_livro) {
		this.id_livro = id_livro;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getAuthor() {
		return author;
	}
	
	public void setGetAuthor(String author) {
		this.author = author;
	}
	
	
	public Integer getAnoPublicacao() {
		return ano_publicacao;
	}
	
	public void setAnoPublicacao(Integer ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
		
	}
	
	

	

}



