package model;

import java.util.ArrayList;
import java.util.List;

public class RModel {

    static boolean rAtaque(int[] tablero) {
        int n = tablero.length;
        for (int i = 0; i < n; i++) {
            if (tablero[i] == -1) continue;
            for (int j = i + 1; j < n; j++) {
                if (tablero[j] == -1) continue;
                if (tablero[i] == tablero[j]) return true; // misma columna
                if (Math.abs(tablero[i] - tablero[j]) == Math.abs(i - j)) return true; // misma diagonal
            }
        }
        return false;
    }

    public List<int[]> buscarSoluciones(int filaF, int columnaF) {
        int n = 8;
        int[] tablero = new int[n];
        for (int i = 0; i < n; i++) {
            tablero[i] = -1;
        }
        tablero[filaF] = columnaF;

        List<int[]> soluciones = new ArrayList<>();
        int filaInicio = (filaF == 0) ? 1 : 0;
        colocarReina(tablero, filaInicio, filaF, soluciones);
        return soluciones;
    }

    private void colocarReina(int[] tablero, int fila, int filaF, List<int[]> soluciones) {
        int n = tablero.length;

        if (fila == n) {
            if (!rAtaque(tablero)) {
                soluciones.add(tablero.clone());
            }
            return;
        }

        if (fila == filaF) {
            colocarReina(tablero, fila + 1, filaF, soluciones);
            return;
        }

        for (int col = 0; col < n; col++) {
            tablero[fila] = col;
            if (!rAtaque(tablero)) {
                colocarReina(tablero, fila + 1, filaF, soluciones);
            }
            tablero[fila] = -1;
        }
    }
}
