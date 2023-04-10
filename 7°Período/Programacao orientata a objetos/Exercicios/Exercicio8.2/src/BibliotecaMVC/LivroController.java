package BibliotecaMVC;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class LivroController {
    private List<Livro> livros;

    public LivroController() {
        livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
