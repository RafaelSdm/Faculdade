package exercicioPooCompiladores;

public class Escritas extends Obras {
	
	private Integer numeorsPaginas;

	public Escritas(Integer ano, Integer numeorsPaginas) {
		super(ano);
		this.numeorsPaginas = numeorsPaginas;
	}
	
	
	public Integer getNumersPaginas() {
		return numeorsPaginas;
		
	}
	
	public void setNumersPaginas(Integer numerosPaginas) {
		this.numeorsPaginas = numerosPaginas;
	}
	
	

}
