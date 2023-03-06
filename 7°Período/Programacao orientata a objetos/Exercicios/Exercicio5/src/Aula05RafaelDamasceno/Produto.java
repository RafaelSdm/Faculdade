package Aula05RafaelDamasceno;

public class Produto {
	
	private int id;
	private String nome;
	private Double preco_unitario;
	private Fornecedor forn;
	
	
	public Produto(int id, String nome, Double preco_unitario, Fornecedor forn) {
		this.id = id;
		this.nome = nome;
		this.preco_unitario = preco_unitario;
		this.forn = forn;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(Double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	public Fornecedor getForn() {
		return forn;
	}
	public void setForn(Fornecedor forn) {
		this.forn = forn;
	}
	

}
