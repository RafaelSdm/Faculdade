package control;

import model.Pessoa;
import model.salgado;
import view.cadastroViewSalgado;
import view.salgadoView;
import view.salgadoPedidoView;

import java.util.List;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.sql.SQLException;

import Conexao.Conexao;
import model.SalgadoDAO;

public class salgadoControler {
	private salgado model;
	private salgadoView view;
	private List<Pessoa> clientes;
	private List<salgado> pedidos;
	private List<String> sabores;

	public salgadoControler(salgado model, salgadoView view) {
		super();
		this.model = model;
		this.view = view;
		this.clientes = new ArrayList<>();
		this.pedidos = new ArrayList<>();
		this.sabores = new ArrayList<>();
		this.view.addPedidoListener(new PedidoListener());
		this.view.addNovoClienteListener(new NovoClienteListener());
		this.view.addVerPedidoListener(new VerPedidoListener());
		sabores.add("Coxinha de pizza");
		sabores.add("Coxinha com caputury");
		sabores.add("cigarrete");
		view.atualizarListaSabores(sabores);
	}

	public class PedidoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String sabor = view.getSelectSabor();
			String tamanho = view.getTamanho();
			Pessoa pessoa = clientes.get(view.getCliente());
			model.setSabor(sabor);
			model.setTamanho(tamanho);
			model.setPessoa(pessoa);
			pedidos.add(new salgado(sabor, tamanho, pessoa));
			JOptionPane.showMessageDialog(null, "Pedido Feito!");

			Conexao conexao = new Conexao();
			conexao.conectarBanco();
			SalgadoDAO salgadoDAO = new SalgadoDAO();

			try {
				salgadoDAO.insertCadastro(sabor, tamanho, pessoa);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	public class VerPedidoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			salgadoPedidoView viewPedido = new salgadoPedidoView(pedidos);
			viewPedido.setVisible(true);
		}
	}

	public class NovoClienteListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			cadastroViewSalgado cadastrar = new cadastroViewSalgado(salgadoControler.this);
			cadastrar.setVisible(true);
		}
	}

	public void cadastrarCliente(String nome, String cpf) {
		Pessoa pessoa = new Pessoa(nome, cpf);
		clientes.add(pessoa);
		view.atualizarListaCliente(clientes);

		Conexao conexao = new Conexao();
		conexao.conectarBanco();
		SalgadoDAO salgadoDAO = new SalgadoDAO();
		
		/*
		try {
			//salgadoDAO.insertCliente(nome, cpf);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
	}
}
