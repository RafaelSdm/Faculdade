package control;

import model.Pessoa;
import model.lanche;
import view.cadastroViewLanche;
import view.lancheView;
import view.lanchePedidoView;

import java.util.List;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class lancheControler {
	private lanche model;
	private lancheView view;
	private List<Pessoa> clientes;
	private List<lanche> pedidos;
	private List<String> sabores;
	
	public lancheControler(lanche model, lancheView view) {
		super();
		this.model = model;
		this.view = view;
		this.clientes = new ArrayList<>();
		this.pedidos = new ArrayList<>();
		this.sabores = new ArrayList<>();
		this.view.addPedidoListener(new PedidoListener());
		this.view.addNovoClienteListener(new NovoClienteListener());
		this.view.addVerPedidoListener(new VerPedidoListener());
		sabores.add("Lanche presunto com queijo");
		sabores.add("Lanche caprixado");
		sabores.add("Lanche a moda do chef");
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
			pedidos.add(new lanche(sabor, tamanho, pessoa));
			JOptionPane.showMessageDialog(null, "Pedido Feito!");
			

		}

	}
	
public class VerPedidoListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			lanchePedidoView viewPedido = new lanchePedidoView(pedidos);
			viewPedido.setVisible(true);
			
		}
	}
	
	public class NovoClienteListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			cadastroViewLanche cadastrar = new cadastroViewLanche(lancheControler.this);
			cadastrar.setVisible(true);
		}
		
	}
	
	public void cadastrarCliente (String nome, String cpf) {
		Pessoa pessoa = new Pessoa(nome, cpf);
		clientes.add(pessoa);
		view.atualizarListaCliente(clientes);
	}
	
	
	
}

