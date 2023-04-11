package BibliotecaMVC;

public class Principal {
    public static void main(String[] args) {
        LivroController controller = new LivroController();
        LivroView view = new LivroView(controller);
        
        CategoriaView  teste = new CategoriaView();
    }
}
