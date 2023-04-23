package petshop_mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PassaroController {
    private Passaro model;
    private PassaroView view;

    public PassaroController(Passaro model, PassaroView view) {
        this.model = model;
        this.view = view;

        view.addBotaoCadastrarListener(new BotaoCadastrarListener());
    }

    class BotaoCadastrarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Passaro passaro = view.cadastrarPassaro();
                model.cadastrarPassaro(passaro.getId(), passaro.getNome(), passaro.getCor(), passaro.getIdade(), passaro.getSexo(), passaro.getRaca(), passaro.getNumeroAnilha());
                //int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso
                //int id, String nome, String cor, int idade, String sexo, String raca, String numeroAnilha
                view.mostrarMensagem("Passaro cadastrado com sucesso!");
                view.mostrarGatos(model.getPassaros());
            } catch (NumberFormatException ex) {
                view.mostrarMensagem("Por favor, preencha todos os campos corretamente.");
            }
        }
    }
}