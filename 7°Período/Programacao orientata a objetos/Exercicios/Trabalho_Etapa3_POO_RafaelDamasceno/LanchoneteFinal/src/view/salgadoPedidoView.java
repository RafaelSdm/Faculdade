package view;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import model.salgado;

import javax.swing.JScrollPane;
import java.util.List;

public class salgadoPedidoView extends JFrame {
    private JTextArea txtAreaPedidos;

    public salgadoPedidoView(List<salgado> pedidos) {
        setTitle("Pedidos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        txtAreaPedidos = new JTextArea(10, 30);
        txtAreaPedidos.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaPedidos);

        StringBuilder pedidosText = new StringBuilder();
        for (salgado salga : pedidos) {
            pedidosText.append("Sabor: ").append(salga.getSabor()).append("\n");
            pedidosText.append("Tamanho: ").append(salga.getTamanho()).append("\n");
            pedidosText.append("Cliente: ").append(salga.getPessoa().getNome()).append("\n");
            pedidosText.append("CPF: ").append(salga.getPessoa().getCpf()).append("\n");
            pedidosText.append("Preço: R$ ").append(salga.getPreco()).append("\n");
            pedidosText.append("\n");
        }
        txtAreaPedidos.setText(pedidosText.toString());

        add(scrollPane);

        pack();
        setLocationRelativeTo(null);
    }
}