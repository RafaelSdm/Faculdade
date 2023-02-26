package Biblioteca;


import java.util.ArrayList;

public class Principal {	
	public static void main(String[] args) {
		
		
		ArrayList<Livro> lista = new ArrayList<Livro>();
		ArrayList<Categoria> listaCategoria = new ArrayList<Categoria>();

		
		Livro livro = new Livro(1, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
		Categoria categoria = new Categoria(1, "Fantasia");
		lista.add(livro);
		listaCategoria.add(categoria);
		
		livro = new Livro(2, "Harry Potter e as Relíquias da Morte", "J.K. Rowling", 2007);
		lista.add(livro);
		categoria = new Categoria(1, "Fantasia");
		listaCategoria.add(categoria);
		
		livro = new Livro(3, "Harry Potter e o Cálice de Fogo ", "J.K. Rowling", 2000);
		lista.add(livro);
		categoria = new Categoria(1, "Fantasia");
		listaCategoria.add(categoria);
		
		livro = new Livro(4, "Código limpo: Habilidades práticas do Agile Software", "Robert C. Martin", 2010);
		lista.add(livro);
		categoria = new Categoria(2, "Programacao");
		listaCategoria.add(categoria);
		
		livro = new Livro(5, "Pense Como um Cientista da Computação", "Allen B. DOWN", 2002);
		lista.add(livro);
		categoria = new Categoria(2, "Programacao");
		listaCategoria.add(categoria);
		
		livro = new Livro(6, "Python Fluente: Programação Clara, Concisa e Eficaz", "Luciano Ramalho", 2015);
		lista.add(livro);
		categoria = new Categoria(2, "Programacao");
		listaCategoria.add(categoria);
		
		livro = new Livro(7, "Cosmos Carl Sagan", "Carl Sagan", 1980);
		lista.add(livro);
		categoria = new Categoria(3, "Astronomia");
		listaCategoria.add(categoria);
		
		livro = new Livro(8, "A Dança do Universo", "Marcelo Geiser", 1997);
		lista.add(livro);
		categoria = new Categoria(3, "Astronomia");
		listaCategoria.add(categoria);
		
		livro = new Livro(9, "Os fundamentos da fisica", "Francisco Ramalho Jr", 1975);
		lista.add(livro);
		categoria = new Categoria(4, "Fisica");
		listaCategoria.add(categoria);
		
		livro = new Livro(10, "Breves Respostas às Grandes Perguntas", "Sthepen Hawking", 2018);
		lista.add(livro);
		categoria = new Categoria(4, "Fisica");
		listaCategoria.add(categoria);
		
		 
		
		
		
		int i = 0;
		while(i < 10) {
			//System.out.println(lista.get(i).getNome());
			//System.out.println(listaCategoria.get(i).getNome());
			System.out.println("Nome do livro: "+ lista.get(i).getNome()+ " Categoria: " + listaCategoria.get(i).getNome());
			System.out.println("----------------------------------------------------------");
			i = i + 1;
			
		}
		
		
		
		
	}
	

	
	
	
	
	
	

}
