package petshop_mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GatoController {
    private Gato model;
    private GatoView view;
	static ArrayList<Gato> gatos = new ArrayList<>();
	

    public GatoController(Gato model, GatoView view) {
        this.model = model;
        this.view = view;

        view.addBotaoCadastrarListener(new BotaoCadastrarListener());
    }

    class BotaoCadastrarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String nome = view.getCampoNome();
                String id = view.getCampoId();
                String idade = view.getCampoIdade(); 
                String cor = view.getCampoCor();
                String sexo = view.getCampoSexo();
                String raca = view.getCampoRaca();
                String porte = view.getCampoPorte();
                String peso = view.getCampoPeso();
                //Pertence liga = view.cadastrarGato();
                //model.cadastrarGato(gato.getId(), gato.getNome(), gato.getCor(), gato.getIdade(), gato.getSexo(), gato.getPorte(), gato.getRaca(), gato.getPorte(), gato.getPeso());
                //int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso
                
                Proprietario proprietario = new Proprietario();
                for (Proprietario ln: ProprietarioController.proprietarios){
                	
                	
                	if(ln.getId() == Integer.parseInt(id)) {
                		proprietario = ln;
                	}
                		
                	
                }
                
                Gato gato = new Gato(Integer.parseInt(id), nome, cor, Integer.parseInt(idade), sexo, raca, porte, peso, proprietario); 
                gatos.add(gato);
        		proprietario.adicionarAniaml(gato);
        		ProprietarioController.proprietarios.remove(proprietario);
        		ProprietarioController.proprietarios.add(proprietario);
                view.mostrarMensagem("Gato cadastrado com sucesso!");
                
                view.mostrarGatos(gatos);
            } catch (NumberFormatException ex) {
                view.mostrarMensagem("Por favor, preencha todos os campos corretamente.");
            }
        }
    }
}