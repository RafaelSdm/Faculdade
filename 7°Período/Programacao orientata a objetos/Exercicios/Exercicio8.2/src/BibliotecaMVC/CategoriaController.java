package BibliotecaMVC;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CategoriaController {
    private CategoriaView view;
    private List<Categoria> categorias;

    public CategoriaController(CategoriaView view) {
        this.view = view;
        this.categorias = new ArrayList<Categoria>();
    }

    public void cadastrarCategoria() {
        String nome = view.getNome();

        if (!nome.isEmpty()) {
            Categoria categoria = new Categoria(0, nome);
            categorias.add(categoria);
            view.limparCampos();
            JOptionPane.showMessageDialog(view, "Categoria cadastrada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(view, "Preencha todos os campos!");
        }
    }

    public void mostrarCategorias() {
        if (categorias.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Nenhuma categoria cadastrada.");
        } else {
            String listaCategorias = "Categorias cadastradas:\n\n";

            for (Categoria categoria : categorias) {
                listaCategorias += "ID: " + categoria.getId() + " - Nome: " + categoria.getNome() + "\n";
            }

            JOptionPane.showMessageDialog(view, listaCategorias);
        }
    }
}


