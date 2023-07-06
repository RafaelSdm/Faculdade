package view;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Pessoa;

public class salgadoView extends JFrame {
	private JLabel sabor;
	private JComboBox<String> listaSabores;
	private JLabel tamanho;
	private JLabel cliente;
	private JComboBox<String> listaCliente;
	private JButton pedido;
	private JButton novoCliente;
	private JButton verPedido;
	private JTextField textoTamanho;
	
	public salgadoView() {
		setTitle("Tela fazer pedido Salgado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		sabor = new JLabel ("Sabor");
		listaSabores = new JComboBox<>();
		tamanho = new JLabel ("Tamanho");
		textoTamanho = new JTextField(20);
		cliente = new JLabel ("Cliente");
		listaCliente = new JComboBox<>();
		pedido = new JButton("Fazer pedido");
		novoCliente = new JButton("Cadastrar cliente");
		verPedido = new JButton("Ver pedidos");
		JPanel panel = new JPanel(); 
		
		panel.add(sabor);
		panel.add(listaSabores);
		panel.add(cliente);
		panel.add(listaCliente);
		panel.add(novoCliente);
		panel.add(pedido);
		panel.add(tamanho);
		panel.add(textoTamanho);
		panel.add(verPedido);
		
		add(panel);
		
		pack();
		setLocationRelativeTo(null);
				
	}
	
	public void addPedidoListener(ActionListener listener) {
		pedido.addActionListener(listener);
				
	}
	
	public void addNovoClienteListener(ActionListener listener) {
		novoCliente.addActionListener(listener);
				
	}
	
	public void addVerPedidoListener(ActionListener listener) {
		verPedido.addActionListener(listener);
				
	}
	
	public String getSelectSabor() {
		
		return (String) listaSabores.getSelectedItem();
	}
	
	public String getTamanho() {
		return textoTamanho.getText(); 
	}
	
	public int getCliente() {
		return listaCliente.getSelectedIndex(); 
	}
	
	public void atualizarListaCliente(List<Pessoa> pessoas) {
		listaCliente.removeAllItems();
		for(Pessoa cliente: pessoas) {
			listaCliente.addItem(cliente.getNome());
		}
	}
	
	public void atualizarListaSabores(List<String> sabores) {
		listaSabores.removeAllItems();
		for(String sabor: sabores) {
			listaSabores.addItem(sabor);
		}
	}
	
}
