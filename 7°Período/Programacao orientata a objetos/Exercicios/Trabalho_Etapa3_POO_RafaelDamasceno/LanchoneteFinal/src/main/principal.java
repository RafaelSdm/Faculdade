package main;

import model.Pessoa;
import model.pizza;
import view.pizzaview;
import control.pizzaControler;


import model.salgado;
import view.salgadoView;
import control.salgadoControler;


import model.lanche;
import view.lancheView;
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
		
		view.setVisible(true);
		view1.setVisible(true);
		view2.setVisible(true);
		
	}
}
