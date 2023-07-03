package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import Conexao.Conexao;
import Model.CaoDAO;
import Model.ModelCao;
import Model.ModelGato;
import Model.ModelPassaro;
import Model.ModelProprietario;
import Model.ModelRelacao;
import Model.RelacaoDAO;
import View.ViewRelacao;

public class ControllerRelacao{
	ViewRelacao cadRelacao;
	static List<ModelRelacao> listaRelacao = new ArrayList<ModelRelacao>();
	
	public ControllerRelacao(ViewRelacao cadastroRelacao) {
		cadRelacao = cadastroRelacao;
		
		cadastroRelacao.setBotaoBehaviorRelacao(new BotaoBehaviorRelacao());
	}
	
	class BotaoBehaviorRelacao implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
		ModelRelacao relacao = new ModelRelacao(); 
			
	    Integer idProp = null;
	    Integer idAnim = null;
	    
	    try {
	    	idProp = Integer.parseInt(cadRelacao.get_text_id_proprietario());
	    	idAnim = Integer.parseInt(cadRelacao.get_text_id_animal());
	    }catch(Exception ex) {
	    	JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
	    }
	    	
	    ModelProprietario proprietario = ControllerProprietario.buscarProprietario(idProp);
	    ModelGato gato = ControllerGato.buscarGato(idAnim);
	    ModelCao cao = ControllerCao.buscarCao(idAnim);
	    ModelPassaro passaro = ControllerPassaro.buscarPassaro(idAnim);

	   if((proprietario != null && gato != null)  || (proprietario != null && cao != null)
	      ||(proprietario != null && passaro != null)) {
		   
		   relacao.setId_do_dono(idProp);
		   relacao.setId_do_animal(idAnim);
			        
		   if(existeRelacao(idProp, idAnim)) {
			  JOptionPane.showMessageDialog(null, "A Relacao já existe");
			        }else {
			        	listaRelacao.add(relacao);
			        	JOptionPane.showMessageDialog(null, "Relação realizada com sucesso");
			        	
			        	Conexao conexao = new Conexao();
	        			conexao.conectarBanco();
	        			RelacaoDAO relDAO = new RelacaoDAO();
	        			
//	        			try {
//							relDAO.selectCadastro();
//						} catch (SQLException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
//	        			
	        			try {
							relDAO.insertCadastro(idProp,idAnim);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			        }
			        
	   }else {
		   
		  if(proprietario == null) { 
		    JOptionPane.showMessageDialog(null, "Não existe este Proprietario");
		  }else if(gato == null) {
		    JOptionPane.showMessageDialog(null, "Não existe este Id de animal");
		  }else if(cao == null) {
		    JOptionPane.showMessageDialog(null, "Não existe este Id de animal");
		  }else if(passaro == null) {
		    JOptionPane.showMessageDialog(null, "Não existe este Id de animala");
		  }
		        	
	   }
	        
	   String aux ="";
	   for (int i=0 ; i < listaRelacao.size(); i ++) {
				
			aux = aux + "Id Proprietário: " + listaRelacao.get(i).getId_do_dono() + "  /  Id Animal: " + listaRelacao.get(i).getId_do_animal() + "\n";
			  
	       }
			cadRelacao.setVisor(aux);
			
	        }
	}
	
	public static boolean existeRelacao(Integer idProp, Integer idAnim) {
		for (ModelRelacao r : listaRelacao) {
			if(idProp.equals(r.getId_do_dono()) && idAnim.equals(r.getId_do_animal())) {
				return true;
			}
		}
		
		return false;
	}
}
