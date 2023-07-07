package view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ViewRelatorioVendas extends JFrame {

    private static final long serialVersionUID = 1L;

    JButton botaoGerarRelatorio;

    public ViewRelatorioVendas() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        botaoGerarRelatorio = new JButton("Gerar Relatório de Vendas das Pizzas");
        add(botaoGerarRelatorio);

        pack();
        setVisible(true);
    }

    public void setBotaoGerarRelatorioListener(ActionListener listener) {
        botaoGerarRelatorio.addActionListener(listener);
    }
}
