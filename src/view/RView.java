package view;

public class RView {
    public static void dibujar(int[] tablero) {
        int n = tablero.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tablero[i] == j) {
                    System.out.print("|R");
                } else {
                    System.out.print("|_");
                }
            }
            System.out.println("|");
        }
        System.out.println();
    }

    public void mostrarSolucion(String mensaje) {
        System.out.println(mensaje);
    }
}

