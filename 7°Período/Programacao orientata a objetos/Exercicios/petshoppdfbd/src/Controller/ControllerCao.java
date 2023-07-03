package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


import java.sql.SQLException;

import Conexao.Conexao;
import Model.CaoDAO;
import Model.ModelCao;
import View.ViewCao;


public class ControllerCao {
	ViewCao cadCao;
	static List<ModelCao> listaCao = new ArrayList<ModelCao>();
	
	
	
	//@SuppressWarnings("static-access")
	public ControllerCao(ViewCao cadastroCao) {
		cadCao = cadastroCao;
		
		cadastroCao.setBotaoBehaviorCao(new BotaoBehaviorCao());
		
		
	}
	
	class BotaoBehaviorCao implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		
		public void actionPerformed(ActionEvent e) {
		
		ModelCao cao = new ModelCao();
		
		String nomeAnim = cadCao.getNome();
    	
    	String racaAnimal =  cadCao.getRaca();
    	String corAnimal =  cadCao.getCor();
    	String sexoAnimal = cadCao.getSexo();
    	String porteAnimal =  cadCao.getPorte();
    	
		
        Integer idAnim = null;
	    	try {
	    		idAnim = Integer.parseInt(cadCao.getID());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
	    	}
	    	
	    Integer idadeAnimal = null;
	    	
	    	try {
	    		idadeAnimal = Integer.parseInt( cadCao.getIdade());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Idade não numérico ");
	    	}
	    	
	    	Float pesoAnimal = null;
	    	
	    	try {
	    		pesoAnimal = Float.parseFloat(cadCao.getPeso());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Peso não numérico ");
	    	}
	  if(nomeAnim.strip().length() > 0 && racaAnimal.strip().length() > 0 
			  && corAnimal.strip().length() > 0 && sexoAnimal.strip().length() > 0
			  && porteAnimal.strip().length() > 0) {
        	cao.setId(idAnim);
        	cao.setNome(nomeAnim);
        	cao.setIdade(idadeAnimal);
        	cao.setRaca(racaAnimal);
        	cao.setCor(corAnimal);
        	cao.setSexo(sexoAnimal);
        	cao.setPorte(porteAnimal);
        	cao.setPeso(pesoAnimal);
        	
        	if(existeCao(idAnim)) {
        		JOptionPane.showMessageDialog(null, "ID já existente");
        	}else {
        		if(idAnim instanceof Integer &&  idadeAnimal instanceof Integer &&
        				pesoAnimal instanceof Float) {
        			listaCao.add(cao);
        			Conexao conexao = new Conexao();
        			conexao.conectarBanco();
        			CaoDAO caoDAO = new CaoDAO();
        			

        			
        			try {
						caoDAO.insertCadastro(idAnim, nomeAnim, corAnimal, idadeAnimal, racaAnimal, sexoAnimal, porteAnimal, pesoAnimal);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
        			
        			JOptionPane.showMessageDialog(null, "Cão cadastrado com sucesso");
        		}
        	}
        
        	
       }else{
        	
        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campos ");
        	
       }
	        String aux ="";
			for (int i=0 ; i < listaCao.size(); i ++) {
				
				aux = aux + "Id: " + listaCao.get(i).getId() + "  /  Nome: " + listaCao.get(i).getNome() + "  /  Raça: " + listaCao.get(i).getRaca()
						+ "  /  Cor: " + listaCao.get(i).getCor() + "  /  Sexo: " + listaCao.get(i).getSexo() + "  /  Porte: " + listaCao.get(i).getPorte()
						+ "  /  Peso: " + listaCao.get(i).getPeso()+ "\n";
			
			
	            
	       }
			cadCao.setVisor(aux);
			
		
	}     	
	        
	}
	
	public static ModelCao buscarCao(Integer id) {
		for(ModelCao mc: listaCao) {
			if(id.equals(mc.getId())){
				return mc;
			}
		}
		return null;
	}
	
	public static boolean existeCao(Integer idAnim) {
		for (ModelCao c : listaCao) {
			if(idAnim.equals(c.getId())){
				return true;
			}
		}
		
		return false;
	}
	
}
