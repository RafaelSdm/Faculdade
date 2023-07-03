package petshoppdfbd;

import Controller.ControllerCao;
import Controller.ControllerExibe;
import Controller.ControllerGato;
import Controller.ControllerPassaro;
import Controller.ControllerProprietario;
import Controller.ControllerRelacao;
import View.ViewCao;
import View.ViewExibe;
import View.ViewGato;
import View.ViewPassaro;
import View.ViewProprietario;
import View.ViewRelacao;

public class Principal {
	public static void main(String[] args) {
		
		ViewProprietario vp = new ViewProprietario();
		new ControllerProprietario(vp);
		
		ViewCao vc = new ViewCao();
		new ControllerCao(vc);
		
		ViewGato vg = new ViewGato();
		new ControllerGato(vg);
		
		ViewPassaro vpas = new ViewPassaro();
		new ControllerPassaro(vpas);
		
		ViewRelacao vr= new ViewRelacao();
		new ControllerRelacao(vr);
		
		ViewExibe ve = new ViewExibe();
		new ControllerExibe(ve);
	}
}
