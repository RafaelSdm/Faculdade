package exercicioRafael;

public class Principal {
	
	
	
	
	
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(10);
		
		Triangulo triangulo = new Triangulo(10,15,14,18,10);

		System.out.println(quadrado);
		
		System.out.println(quadrado.getArea());
		System.out.println(quadrado.getNomeFigura());
		System.out.println(quadrado.getPerimetro());
		
		
		
		System.out.println(triangulo);
		System.out.println(triangulo.getNomeFigura());
		System.out.println(triangulo.getArea());
		System.out.println(triangulo.getPerimetro());
		
	}

}
