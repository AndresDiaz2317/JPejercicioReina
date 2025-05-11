package controller;

import model.RModel;
import view.RView;

import java.util.List;

public class RControl {
    private RModel model;
    private RView view;

    public RControl(RModel model, RView view) {
        this.model = model;
        this.view = view;
    }

    public void buscarSoluciones(int fila, int columna) {
        List<int[]> soluciones = model.buscarSoluciones(fila, columna);

        if (!soluciones.isEmpty()) {
            view.mostrarSolucion("Se encontraron " + soluciones.size() +
                                 " soluciones con la reina en: (" + fila + ", " + columna + ")");
            int count = 1;
            for (int[] sol : soluciones) {
                view.mostrarSolucion("Solución #" + count++);
                RView.dibujar(sol);
            }
        } else {
            view.mostrarSolucion("No se encontraron soluciones con la reina en: (" + fila + ", " + columna + ")");
        }
    }
}
