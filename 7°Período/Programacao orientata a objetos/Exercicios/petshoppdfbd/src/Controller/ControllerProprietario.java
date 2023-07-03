package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

import Conexao.Conexao;
import Model.CaoDAO;
import Model.ModelProprietario;
import Model.ProprietarioDAO;
import View.ViewProprietario;

public class ControllerProprietario {
	static SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
	ViewProprietario cadProprietario;
	static List<ModelProprietario> listaProprietario = new ArrayList<ModelProprietario>();
	
	public ControllerProprietario(ViewProprietario cadastroProprietario) {
		cadProprietario = cadastroProprietario;
		
		cadastroProprietario.setBotaoBehaviorProp(new BotaoBehaviorProp());
	}
	
	
	class BotaoBehaviorProp implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			ModelProprietario proprietario = new ModelProprietario(); 
			
	    
	    	Date data = null;
	    	try {
	    		data = formato.parse(cadProprietario.getDNasc());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Data incorreta ");
	    	}
	    	
	 	    Integer cpf = null;
	 	    
	 	    try {
	 	    	cpf = Integer.parseInt(cadProprietario.getCpf());
	 	    }catch(Exception ex) {
	 	    	JOptionPane.showMessageDialog(null, " ERRO! - CPF não numérico ");
	 	    }
	    	
	    	
	    	String telProp = cadProprietario.getTel();
	    	String nomeProp = cadProprietario.getNome();
	    	String emailProp = cadProprietario.getEmail();
	    	String endProp = cadProprietario.getEnd();
	        
	        if(nomeProp.strip().length() > 0 && telProp.strip().length() > 0 && endProp.strip().length() > 0) {

	        	proprietario.setCPF(cpf);
	        	proprietario.setNome(nomeProp);
	        	proprietario.setData_nascimento(data);
	        	proprietario.setTelefone(telProp);
	        	proprietario.setEmail(emailProp);
	        	proprietario.setEndereco(endProp);
	        	if(existeProp(nomeProp, cpf)) {
	        		JOptionPane.showMessageDialog(null, "ID ou Nome ou CPF do proprietario já existe");
	        	}else {
	        		//*****************************************************
	        		if(data instanceof Date) {
	        			listaProprietario.add(proprietario);
			        //listarProprietarios(listaProprietario);
		        	JOptionPane.showMessageDialog(null, "Cliente cadastrado!");
		        	
		        	Conexao conexao = new Conexao();
        			conexao.conectarBanco();
        			ProprietarioDAO propDAO = new ProprietarioDAO();
        			
//        			try {
//						propDAO.selectCadastro();
//					} catch (SQLException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//        			
        			try {
						propDAO.insertCadastro(cpf, nomeProp, telProp, emailProp, null, endProp);;
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
			for (int i=0 ; i < listaProprietario.size(); i ++) {
				
			aux = aux + "Nome: " + listaProprietario.get(i).getNome() + "  /  Email: " + listaProprietario.get(i).getEmail() + "  /  Data de nascimento: " + listaProprietario.get(i).getData_nascimento()
					+ "  /  CPF: " + listaProprietario.get(i).getCPF() + "  /  Telefone: " + listaProprietario.get(i).getTelefone() + "  /  Endereço: " + listaProprietario.get(i).getEndereco() + "\n";
			
	            
	       }
			cadProprietario.setVisor(aux);
			
	        }
	
	}
	public static ModelProprietario buscarProprietario(Integer cpf) {
		for(ModelProprietario mp: listaProprietario) {
			if(cpf.equals(mp.getCPF())){
				return mp;
			}
		}
		return null;
	}
	
	public static boolean existeProp(String nomeProp, Integer cpfProp) {
		for (ModelProprietario pr : listaProprietario) {
			if(nomeProp.equals(pr.getNome())
				&& cpfProp.equals(pr.getCPF())){
				return true;
			}
		}
		
		return false;
	}
	
}
