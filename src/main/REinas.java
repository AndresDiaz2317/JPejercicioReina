package main;

    import controller.RController;
    import model.RModel;
    import view.RView;

    public class REinas {
        public static void main(String[] args) {
            RModel model = new RModel();
            RView view = new RView();
            RController controller = new RController(model, view);
            
            controller.buscarSolucion();
        }
        
        
    }  
