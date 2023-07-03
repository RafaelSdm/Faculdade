package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Conexao.Conexao;
import Model.ExibeDAO;
import PDF.GerarPDF;
import View.ViewExibe;

public class ControllerExibe{
	ViewExibe cadExibe;
	String titulo = "Relatório";
	String localPdf = "D:\\pdfPadrao\\lista.pdf";
	
	public ControllerExibe(ViewExibe cadastroExibe) {
		cadExibe = cadastroExibe;
		
		cadastroExibe.setBotaoBehaviorGerarPdf(new BotaoBehaviorGerarPdf());
	}
	
	class BotaoBehaviorGerarPdf implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
	    	Integer cpf = null;

	    	try {
	    		cpf = Integer.parseInt(cadExibe.get_text_cpf_prop());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
	    	}
	        	
		    Conexao conexao = new Conexao();
		    conexao.conectarBanco();
		    ExibeDAO exibeDAO = new ExibeDAO();
		    
		    try {
		    	String conteudo1 = exibeDAO.selectCadastroCao(cpf);
		    	String conteudo2 = exibeDAO.selectCadastroGato(cpf);
		    	String conteudo3 = exibeDAO.selectCadastroPas(cpf);
		    	GerarPDF.gerarPdf(titulo, conteudo1, conteudo2, conteudo3, localPdf);
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}



		     
	    }
	}
	
}
