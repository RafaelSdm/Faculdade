package petshop_mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ProprietarioController {
    private Proprietario model;
    private ProprietarioView view;
	static ArrayList<Proprietario> proprietarios = new ArrayList<>();


    public ProprietarioController(Proprietario model, ProprietarioView view) {
        this.model = model;
        this.view = view;

        view.addBotaoCadastrarListener(new BotaoCadastrarListener());
    }

    class BotaoCadastrarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                //Proprietario proprietario = view.cadastrarProprietario();
                //model.cadastrarProprietario(proprietario.getNome(), proprietario.getId(), proprietario.getCpf(), proprietario.getEndereco());
                String nome = view.getCampoNome();
                String id = view.getCampoId();
                String cpf = view.getCampoCpf();
                String endereco = view.getCampoEndereco();
                
                Proprietario proprietario = new Proprietario(nome, Integer.parseInt(id), cpf, endereco);
                proprietarios.add(proprietario);
                view.mostrarMensagem("Proprietário cadastrado com sucesso!");
                
                view.mostrarProprietarios(proprietarios);
            } catch (NumberFormatException ex) {
                view.mostrarMensagem("Por favor, preencha todos os campos corretamente.");
            }
        }
    }
}