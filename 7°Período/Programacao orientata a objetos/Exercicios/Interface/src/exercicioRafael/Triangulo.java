package exercicioRafael;

public class Triangulo implements FigurasGeometricas {
	private int base;
	private int altura;
	private int lado1;
	private int lado2;
	private int lado3;
	
	
	public Triangulo(int base, int altura, int lado1, int lado2, int lado3) {
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	
	@Override
	public String getNomeFigura() {
		// TODO Auto-generated method stub
		return "Triangulo";
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return (base * altura) /2;
	}

	@Override
	public int getPerimetro() {
		// TODO Auto-generated method stub
		return lado1 + lado2 + lado3;
	}


	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3="
				+ lado3 + "]";
	}
	
	

}
