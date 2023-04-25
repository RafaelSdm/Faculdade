package petshop_mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CachorroController {
    private Cachorro model;
    private CachorroView view;
	static ArrayList<Cachorro> cachorros = new ArrayList<>();


    public CachorroController(Cachorro model, CachorroView view) {
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
                String idProp = view.getCampoProprietario();
                
                
            	
            	
            	
            	
            	
            	/*
                Cachorro cachorro = view.cadastrarCachorro();
                model.cadastrarCachorro(cachorro.getId(), cachorro.getNome(), cachorro.getCor(), cachorro.getIdade(), cachorro.getSexo(), cachorro.getPorte(), cachorro.getRaca(), cachorro.getPorte(), cachorro.getPeso());
                //int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso
                view.mostrarMensagem("Cachorro cadastrado com sucesso!");
                view.mostrarCachorros(model.getCachorros());
                
                */
                
                
                Proprietario proprietario = new Proprietario();
                for (Proprietario ln: ProprietarioController.proprietarios){
                	
                	
                	if(ln.getId() == Integer.parseInt(idProp)) {
                		proprietario = ln;
                	}
                		
                	
                }
                
                Cachorro cachorro = new Cachorro(Integer.parseInt(id), nome, cor, Integer.parseInt(idade), sexo, raca, porte, peso, proprietario); 
                cachorros.add(cachorro);
        		proprietario.adicionarAniaml(cachorro);
        		ProprietarioController.proprietarios.remove(proprietario);
        		ProprietarioController.proprietarios.add(proprietario);
                view.mostrarMensagem("Cachorro cadastrado com sucesso!");
                view.mostrarCachorros(cachorros);
            } catch (NumberFormatException ex) {
                view.mostrarMensagem("Por favor, preencha todos os campos corretamente.");
            }
        }
    }
}