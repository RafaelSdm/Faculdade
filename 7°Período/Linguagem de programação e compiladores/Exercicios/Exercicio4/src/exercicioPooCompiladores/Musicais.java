package exercicioPooCompiladores;

public class Musicais extends Obras {
	
	private Double tempoMusica;
	
	

	public Musicais(Integer ano, Double tempoMusica) {
		super(ano);
		this.tempoMusica = tempoMusica;
	}

	public Double getTempoMusica() {
		return tempoMusica;
	}

	public void setTempoMusica(Double tempoMusica) {
		this.tempoMusica = tempoMusica;
	}
	
	
	
	

}
