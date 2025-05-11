package main;

import controller.RControl;
import model.RModel;
import view.RView;

import java.util.Scanner;
import java.util.List;

public class REinas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RModel model = new RModel();
        RView view = new RView();
        RControl controller = new RControl(model, view);

        while (true) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Buscar soluciones desde una posición inicial");
            System.out.println("2. Mostrar todas las posiciones válidas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la fila de la reina inicial (0-7): ");
                    int fila = scanner.nextInt();

                    System.out.print("Ingrese la columna de la reina inicial (0-7): ");
                    int columna = scanner.nextInt();

                    if (fila < 0 || fila > 7 || columna < 0 || columna > 7) {
                        System.out.println("⚠ Posición fuera de rango. Intente con valores entre 0 y 7.");
                        break;
                    }

                    controller.buscarSoluciones(fila, columna);
                    break;

                case 2:
                    System.out.println("\nPosiciones desde donde SÍ existen soluciones válidas:");
                    int total = 0;
                    for (int f = 0; f < 8; f++) {
                        for (int c = 0; c < 8; c++) {
                            List<int[]> soluciones = model.buscarSoluciones(f, c);
                            if (!soluciones.isEmpty()) {
                                System.out.println("✔ (" + f + ", " + c + ") → " + soluciones.size() + " soluciones");
                                total++;
                            }
                        }
                    }
                    System.out.println("Total de posiciones válidas: " + total + " de 64 posibles.\n");
                    break;

                case 3:
                    System.out.println("Programa finalizado.");
                    scanner.close();
                    return;

                default:
                    System.out.println("⚠ Opción no válida. Intente nuevamente.");
            }
        }
    }
}

