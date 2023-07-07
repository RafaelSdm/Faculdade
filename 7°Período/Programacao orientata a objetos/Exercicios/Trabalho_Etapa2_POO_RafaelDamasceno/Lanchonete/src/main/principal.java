package main;

import model.Pessoa;
import model.pizza;
import view.pizzaview;
import control.pizzaControler;


import model.salgado;
import view.salgadoView;
import control.salgadoControler;


import model.lanche;
import view.ViewRelatorioVendas;
import view.ViewRelatorioVendasLanches;
import view.ViewRelatorioVendasSalgados;
import view.lancheView;
import control.ControllerRelatorioVendas;
import control.ControllerRelatorioVendasLanche;
import control.ControllerRelatorioVendasSalgado;
import control.lancheControler;

public class principal {
	public static void main(String[] args) {
		pizza model = new pizza(null, null, null, null);
		pizzaview view = new pizzaview();
		pizzaControler controler = new pizzaControler(model, view);
		
		salgado model1 = new salgado(null, null, null);
		salgadoView view1 = new salgadoView();
		salgadoControler controler1 = new salgadoControler(model1, view1);
		
		lanche model2 = new lanche(null, null, null);
		lancheView view2 = new lancheView();
		lancheControler controler2 = new lancheControler(model2, view2);
		
		ViewRelatorioVendas view3 = new ViewRelatorioVendas();
		ControllerRelatorioVendas controller3 = new ControllerRelatorioVendas(view3);
		
		ViewRelatorioVendasLanches view4 = new ViewRelatorioVendasLanches();
		ControllerRelatorioVendasLanche controller4 = new ControllerRelatorioVendasLanche(view4);
		
		ViewRelatorioVendasSalgados view5 = new ViewRelatorioVendasSalgados();
		ControllerRelatorioVendasSalgado controller5 = new ControllerRelatorioVendasSalgado(view5);

		
		view.setVisible(true);
		view1.setVisible(true);
		view2.setVisible(true);
		view3.setVisible(true);
		view4.setVisible(true);
		view5.setVisible(true);
		
	}
}
