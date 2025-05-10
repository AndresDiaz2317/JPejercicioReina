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

    public void buscarSolucion(int fila, int columna) {
        int[] solucion = model.buscarSolucion(fila, columna);
        if (solucion != null) {
            view.mostrarSolucion("Se encontro una solucion con la reina en: "+ fila +" , "+columna" : ");
            view.dibujar(solucion);
        } else {
            view.mostrarSolucion("No se encontro una solucion con esa posicion inicial: ");
        }

    }
}