package exercicioRafael;

public class Quadrado implements FigurasGeometricas {
	
	private int lado;
	
	
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	public String getNomeFigura() {
		return "Quadrado";
	}
	
	
	public int getArea() {
		return lado * lado;
	}
	
	public int getPerimetro(){
		return lado *4;
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + "]";
	}
	
	
	

}
