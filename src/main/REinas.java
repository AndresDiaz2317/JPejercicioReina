package main;

    import controller.RControl;
    import model.RModel;
    import view.RView;

    import java.util.Scanner;

    public class REinas {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Ingrese la fila de la reina inicial: ");
            int fila = scanner.nextInt();   
            
            System.out.println("Ingrese la columna de la reina inicial: ");
            int columna = scanner.nextInt();

            scanner.close();
            
            RModel model = new RModel();
            RView view = new RView();
            RControl controller = new RControl(model, view);
            
            controller.buscarSolucion(fila, columna);
        }   
        
    }  
