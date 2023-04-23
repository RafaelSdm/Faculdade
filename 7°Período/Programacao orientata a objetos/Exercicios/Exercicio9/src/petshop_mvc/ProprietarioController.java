package petshop_mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ProprietarioController {
    private Proprietario model;
    private ProprietarioView view;

    public ProprietarioController(Proprietario model, ProprietarioView view) {
        this.model = model;
        this.view = view;

        view.addBotaoCadastrarListener(new BotaoCadastrarListener());
    }

    class BotaoCadastrarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Proprietario proprietario = view.cadastrarProprietario();
                model.cadastrarProprietario(proprietario.getNome(), proprietario.getId(), proprietario.getCpf(), proprietario.getEndereco());
                view.mostrarMensagem("Proprietário cadastrado com sucesso!");
                view.mostrarProprietarios(model.getProprietarios());
            } catch (NumberFormatException ex) {
                view.mostrarMensagem("Por favor, preencha todos os campos corretamente.");
            }
        }
    }
}