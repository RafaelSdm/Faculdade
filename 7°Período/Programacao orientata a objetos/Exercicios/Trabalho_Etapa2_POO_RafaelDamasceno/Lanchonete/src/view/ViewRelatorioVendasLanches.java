package view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ViewRelatorioVendasLanches extends JFrame {

    private static final long serialVersionUID = 1L;

    JButton botaoGerarRelatorio;

    public ViewRelatorioVendasLanches() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        botaoGerarRelatorio = new JButton("Gerar Relatório de Vendas dos Lanches");
        add(botaoGerarRelatorio);

        pack();
        setVisible(true);
    }

    public void setBotaoGerarRelatorioListener(ActionListener listener) {
        botaoGerarRelatorio.addActionListener(listener);
    }
}
