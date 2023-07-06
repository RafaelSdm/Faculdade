package view;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import model.lanche;

import javax.swing.JScrollPane;
import java.util.List;

public class lanchePedidoView extends JFrame {
    private JTextArea txtAreaPedidos;

    public lanchePedidoView(List<lanche> pedidos) {
        setTitle("Pedidos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        txtAreaPedidos = new JTextArea(10, 30);
        txtAreaPedidos.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaPedidos);

        StringBuilder pedidosText = new StringBuilder();
        for (lanche lan : pedidos) {
            pedidosText.append("Sabor: ").append(lan.getSabor()).append("\n");
            pedidosText.append("Tamanho: ").append(lan.getTamanho()).append("\n");
            pedidosText.append("Cliente: ").append(lan.getPessoa().getNome()).append("\n");
            pedidosText.append("CPF: ").append(lan.getPessoa().getCpf()).append("\n");
            pedidosText.append("Preço: R$ ").append(lan.getPreco()).append("\n");
            pedidosText.append("\n");
        }
        txtAreaPedidos.setText(pedidosText.toString());

        add(scrollPane);

        pack();
        setLocationRelativeTo(null);
    }
}