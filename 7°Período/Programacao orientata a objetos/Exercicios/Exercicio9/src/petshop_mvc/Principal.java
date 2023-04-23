package petshop_mvc;


public class Principal {
    public static void main(String[] args) {
        Proprietario model = new Proprietario(null, 0, null, null);
        ProprietarioView view = new ProprietarioView();
        ProprietarioController controller = new ProprietarioController(model, view);
        
        
        
        Gato model1 = new Gato(0, null, null, 0, null, null, null, null);
        GatoView view1 = new GatoView();
        GatoController controller1 = new GatoController(model1, view1);
        
        
        
        Cachorro model2 = new Cachorro(0, null, null, 0, null, null, null, null);
        CachorroView view2 = new CachorroView();
        CachorroController controller2 = new CachorroController(model2, view2);
        
        
        Passaro model3 = new Passaro(0, null, null, 0, null, null, null);
        PassaroView view3 = new PassaroView();
        PassaroController controller3 = new PassaroController(model3, view3);
        
    }
}
