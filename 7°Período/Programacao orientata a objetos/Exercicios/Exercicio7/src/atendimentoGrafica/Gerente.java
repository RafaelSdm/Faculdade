package atendimentoGrafica;

public class Gerente extends Usuario {

	private String tipoGerente;




	
	
	public Gerente(int id, String nome, String email, String senha, String tipoGerente) {
		super(id, nome, email, senha);
		this.setTipoGerente(tipoGerente);
	}




	public String getTipoGerente() {
		return tipoGerente;
	}




	public void setTipoGerente(String tipoGerente) {
		this.tipoGerente = tipoGerente;
	}


}

