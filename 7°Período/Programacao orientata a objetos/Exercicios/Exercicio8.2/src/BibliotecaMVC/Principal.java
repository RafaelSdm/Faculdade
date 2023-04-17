package BibliotecaMVC;

public class Principal {
    public static void main(String[] args) {
        LivroController controller = new LivroController();
        LivroView view = new LivroView(controller);
        
        CategoriaController controller1 = new CategoriaController(null);
        CategoriaView view1 = new CategoriaView();

        // Exibe a tela de cadastro de categoria
        view.exibirTelaCadastro();

        // Exibe a lista de categorias cadastradas
        view.exibirListaCategorias();

        
    }
}
