package petshop_mvc;


public class Principal {
    public static void main(String[] args) {
        Proprietario model = new Proprietario(null, 0, null, null);
        ProprietarioView view = new ProprietarioView();
        ProprietarioController controller = new ProprietarioController(model, view);
        
        
        
        Gato model1 = new Gato(0, null, null, 0, null, null, null, null);
        GatoView view1 = new GatoView();
        GatoController controller1 = new GatoController(model1, view1);
    }
}
