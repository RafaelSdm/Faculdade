package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Conexao.Conexao;
import model.ExibeDAO;
import PDF.GerarPDF;
//import View.ViewExibe;

public class ControllerExibe{
	//ViewExibe cadExibe;
	String titulo = "Relatório";
	String localPdf = "D:\\pdfPadrao\\lista.pdf";
	

	
	class BotaoBehaviorGerarPdf implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
	    	Integer cpf = null;

	 
	        	
		    Conexao conexao = new Conexao();
		    conexao.conectarBanco();
		    ExibeDAO exibeDAO = new ExibeDAO();
		    
		    try {
		    	String conteudo1 = exibeDAO.selectCadastroCao();
		    	//String conteudo2 = exibeDAO.selectCadastroGato(cpf);
		    	//String conteudo3 = exibeDAO.selectCadastroPas(cpf);
		    	GerarPDF.gerarPdf(titulo, conteudo1, localPdf);
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}



		     
	    }
	}
	
}
