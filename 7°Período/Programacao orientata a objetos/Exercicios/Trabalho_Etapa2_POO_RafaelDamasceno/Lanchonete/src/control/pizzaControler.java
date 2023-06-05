package control;

import model.Pessoa;
import model.pizza;
import view.cadastroView;
import view.pizzaview;
import view.pedidoView;

import java.util.List;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class pizzaControler {
	private pizza model;
	private pizzaview view;
	private List<Pessoa> clientes;
	private List<pizza> pedidos;
	private List<String> sabores;
	
	
	public pizzaControler(pizza model, pizzaview view) {
		super();
		this.model = model;
		this.view = view;
		this.clientes = new ArrayList<>();
		this.pedidos = new ArrayList<>();
		this.sabores = new ArrayList<>();
		this.view.addPedidoListener(new PedidoListener());
		this.view.addNovoClienteListener(new NovoClienteListener());
		this.view.addVerPedidoListener(new VerPedidoListener());
		sabores.add("Portuguesa");
		sabores.add("Vegana");
		sabores.add("Flango com Capytury");
		view.atualizarListaSabores(sabores);
		
		
	}
	
	public class PedidoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String sabor = view.getSelectSabor();
			String tamanho = view.getTamanho();
			String borda = view.getBorda();
			Pessoa pessoa = clientes.get(view.getCliente());
			model.setBorda(borda);
			model.setSabor(sabor);
			model.setTamanho(tamanho);
			model.setPessoa(pessoa);
			pedidos.add(new pizza(sabor, tamanho, pessoa, borda));
			JOptionPane.showMessageDialog(null, "Pedido Feito!");
			

		}

	}
	
public class VerPedidoListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			pedidoView viewPedido = new pedidoView(pedidos);
			viewPedido.setVisible(true);
			
		}
	}
	
	public class NovoClienteListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			cadastroView cadastrar = new cadastroView(pizzaControler.this);
			cadastrar.setVisible(true);
		}
		
	}
	
	public void cadastrarCliente (String nome, String cpf) {
		Pessoa pessoa = new Pessoa(nome, cpf);
		clientes.add(pessoa);
		view.atualizarListaCliente(clientes);
	}
	
	
	
}
