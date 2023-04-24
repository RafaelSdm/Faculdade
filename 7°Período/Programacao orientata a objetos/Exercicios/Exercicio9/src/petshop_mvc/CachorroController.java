package petshop_mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CachorroController {
    private Cachorro model;
    private CachorroView view;

    public CachorroController(Cachorro model, CachorroView view) {
        this.model = model;
        this.view = view;

        view.addBotaoCadastrarListener(new BotaoCadastrarListener());
    }

    class BotaoCadastrarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Cachorro cachorro = view.cadastrarCachorro();
                model.cadastrarCachorro(cachorro.getId(), cachorro.getNome(), cachorro.getCor(), cachorro.getIdade(), cachorro.getSexo(), cachorro.getPorte(), cachorro.getRaca(), cachorro.getPorte(), cachorro.getPeso());
                //int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso
                view.mostrarMensagem("Cachorro cadastrado com sucesso!");
                view.mostrarCachorros(model.getCachorros());
            } catch (NumberFormatException ex) {
                view.mostrarMensagem("Por favor, preencha todos os campos corretamente.");
            }
        }
    }
}