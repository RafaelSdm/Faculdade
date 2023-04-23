package petshop_mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GatoController {
    private Gato model;
    private GatoView view;

    public GatoController(Gato model, GatoView view) {
        this.model = model;
        this.view = view;

        view.addBotaoCadastrarListener(new BotaoCadastrarListener());
    }

    class BotaoCadastrarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Gato gato = view.cadastrarGato();
                model.cadastrarGato(gato.getId(), gato.getNome(), gato.getCor(), gato.getIdade(), gato.getSexo(), gato.getPorte(), gato.getRaca(), gato.getPorte(), gato.getPeso());
                //int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso
                view.mostrarMensagem("Gato cadastrado com sucesso!");
                view.mostrarGatos(model.getGatos());
            } catch (NumberFormatException ex) {
                view.mostrarMensagem("Por favor, preencha todos os campos corretamente.");
            }
        }
    }
}