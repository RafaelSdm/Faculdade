package exercicioPooCompiladores;

public class Filmes extends Obras {
	
	private String generoFilme;
	
	

	public Filmes(Integer ano, String generoFilme) {
		super(ano);
		this.generoFilme = generoFilme;
	}

	public String getGeneroFilme() {
		return generoFilme;
	}

	public void setGeneroFilme(String generoFilme) {
		this.generoFilme = generoFilme;
	}

}
