package petshop_mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PassaroController {
    private Passaro model;
    private PassaroView view;
	static ArrayList<Passaro> passaros = new ArrayList<>();


    public PassaroController(Passaro model, PassaroView view) {
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
                String anilha = view.getCampoAilha();
                String idProp = view.getCampoProprietario();
            	
                
                
                
                Proprietario proprietario = new Proprietario();
                for (Proprietario ln: ProprietarioController.proprietarios){
                	
                	
                	if(ln.getId() == Integer.parseInt(idProp)) {
                		proprietario = ln;
                	}
                		
                	
                }
                
                Passaro passaro = new Passaro(Integer.parseInt(id), nome, cor, Integer.parseInt(idade), sexo, raca, anilha, proprietario); 
                passaros.add(passaro);
        		proprietario.adicionarAniaml(passaro);
        		ProprietarioController.proprietarios.remove(proprietario);
        		ProprietarioController.proprietarios.add(proprietario);
                view.mostrarMensagem("Gato cadastrado com sucesso!");
                
                view.mostrarGatos(passaros);;
            	
            	
            	
            	/*
                Passaro passaro = view.cadastrarPassaro();
                model.cadastrarPassaro(passaro.getId(), passaro.getNome(), passaro.getCor(), passaro.getIdade(), passaro.getSexo(), passaro.getRaca(), passaro.getNumeroAnilha());
                //int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso
                //int id, String nome, String cor, int idade, String sexo, String raca, String numeroAnilha
                view.mostrarMensagem("Passaro cadastrado com sucesso!");
                view.mostrarGatos(model.getPassaros());
                */
            } catch (NumberFormatException ex) {
                view.mostrarMensagem("Por favor, preencha todos os campos corretamente.");
            }
        }
    }
}