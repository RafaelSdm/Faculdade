package view;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import model.pizza;

import javax.swing.JScrollPane;
import java.util.List;

public class pedidoView extends JFrame {
    private JTextArea txtAreaPedidos;

    public pedidoView(List<pizza> pedidos) {
        setTitle("Pedidos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        txtAreaPedidos = new JTextArea(10, 30);
        txtAreaPedidos.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaPedidos);

        StringBuilder pedidosText = new StringBuilder();
        for (pizza pizz : pedidos) {
            pedidosText.append("Sabor: ").append(pizz.getSabor()).append("\n");
            pedidosText.append("Tamanho: ").append(pizz.getTamanho()).append("\n");
            pedidosText.append("Cliente: ").append(pizz.getPessoa().getNome()).append("\n");
            pedidosText.append("CPF: ").append(pizz.getPessoa().getCpf()).append("\n");
            pedidosText.append("Borda: ").append(pizz.getBorda()).append("\n");
            pedidosText.append("Preço: R$ ").append(pizz.getPreco()).append("\n");
            pedidosText.append("\n");
        }
        txtAreaPedidos.setText(pedidosText.toString());

        add(scrollPane);

        pack();
        setLocationRelativeTo(null);
    }
}