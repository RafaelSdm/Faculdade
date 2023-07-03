package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import Conexao.Conexao;
import Model.CaoDAO;
import Model.ModelPassaro;
import Model.PassaroDAO;
import View.ViewPassaro;


public class ControllerPassaro {
	ViewPassaro cadPassaro;
	static List<ModelPassaro> listaPassaro = new ArrayList<ModelPassaro>();
	
	public ControllerPassaro(ViewPassaro cadastroPassaro) {
		cadPassaro = cadastroPassaro;
		
		cadastroPassaro.setBotaoBehaviorPassaro(new BotaoBehaviorPassaro());
	}
	
	class BotaoBehaviorPassaro implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			ModelPassaro passaro = new ModelPassaro();
			
			String nomeAnim = cadPassaro.getNome();
	    	
	    	String racaAnimal =  cadPassaro.getRaca();
	    	String corAnimal =  cadPassaro.getCor();
	    	String sexoAnimal = cadPassaro.getSexo();
	    	
	        Integer idAnim = null;
		    	try {
		    		idAnim = Integer.parseInt(cadPassaro.getID());
		    	}catch(Exception ex) {
		    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
		    	}
		    	
		    Integer idadeAnimal = null;
		    	
		    	try {
		    		idadeAnimal = Integer.parseInt( cadPassaro.getIdade());
		    	}catch(Exception ex) {
		    		JOptionPane.showMessageDialog(null, " ERRO! - Idade não numérico ");
		    	}
		    	
		    	Integer anilhaAnimal = null;
		    	
		    	try {
		    		anilhaAnimal = Integer.parseInt(cadPassaro.getAnilha());
		    	}catch(Exception ex) {
		    		JOptionPane.showMessageDialog(null, " ERRO! - Anilha não numérico ");
		    	}
		  if(nomeAnim.strip().length() > 0 && racaAnimal.strip().length() > 0 
				  && corAnimal.strip().length() > 0 && sexoAnimal.strip().length() > 0) {
	        	passaro.setId(idAnim);
	        	passaro.setNome(nomeAnim);
	        	passaro.setIdade(idadeAnimal);
	        	passaro.setRaca(racaAnimal);
	        	passaro.setCor(corAnimal);
	        	passaro.setSexo(sexoAnimal);
	        	passaro.setNum_anilha(anilhaAnimal);
	        	
	        	if(existePassaro(idAnim)) {
	        		JOptionPane.showMessageDialog(null, "ID já existente");
	        	}else {
	        		if(idAnim instanceof Integer &&  idadeAnimal instanceof Integer &&
	        				anilhaAnimal instanceof Integer) {
	        			listaPassaro.add(passaro);
	        			JOptionPane.showMessageDialog(null, "Passaro cadastrado com sucesso");
	        			
	        			Conexao conexao = new Conexao();
	        			conexao.conectarBanco();
	        			PassaroDAO passaroDAO = new PassaroDAO();
	        			
//	        			try {
//							passaroDAO.selectCadastro();
//						} catch (SQLException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
//	        			
	        			try {
							passaroDAO.insertCadastro(idAnim, nomeAnim, corAnimal, idadeAnimal, racaAnimal, sexoAnimal, anilhaAnimal);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	        		}
	        				
	        	}
	        
	        	
	       }else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campos ");
	        	
	       }
	        String aux ="";
			for (int i=0 ; i < listaPassaro.size(); i ++) {
				
				aux = aux + "Id: " + listaPassaro.get(i).getId() + "  /  Nome: " + listaPassaro.get(i).getNome() + "  /  Raça: " + listaPassaro.get(i).getRaca()
						+ "  /  Cor: " + listaPassaro.get(i).getCor() + "  /  Sexo: " + listaPassaro.get(i).getSexo() + "  /  Anilha: " + listaPassaro.get(i).getNum_anilha()
						+ "\n";
			
	            
	       }
			cadPassaro.setVisor(aux);
			
	        }
	
	}
	
	public static ModelPassaro buscarPassaro(Integer id) {
		for(ModelPassaro mp: listaPassaro) {
			if(id.equals(mp.getId())){
				return mp;
			}
		}
		return null;
	}
	
	public static boolean existePassaro(Integer idAnim) {
		for (ModelPassaro p : listaPassaro) {
			if(idAnim.equals(p.getId())){
				return true;
			}
		}
		
		return false;
	}
	
}
