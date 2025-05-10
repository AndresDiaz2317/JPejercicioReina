package controller;   

import model.RModel; 
import view.RView;

public class RController {

    private RModel model;
    private RView view;

    public RController(RModel model, RView view) {
        this.model = model;
        this.view = view;
    }

    public void buscarSolucion() {
        int[] solucion = model.buscarSolucion();
        if (solucion != null) {
            view.mostrarSolucion("Se encontro una solucion: ");
            view.dibujar(solucion);
        } else {
            view.mostrarSolucion("No se encontro una solucion: ");
        }

    }
}