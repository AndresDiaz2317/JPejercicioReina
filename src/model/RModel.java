package model;

public class RModel {
    static boolean rAtaque(int[] tablero) {
        int n = tablero.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (tablero[i] == tablero[j]) {
                    return true;
                }
                if (Math.abs(tablero[i] - tablero[j]) == Math.abs(i - j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int[] buscarSolucion(int filaF, int columnaF) {
        int n = 8;
        int[] tablero = new int[n];
        for (int i = 0; i < n; i++) {
            tablero[i] = -1;
        }
        tablero[filaF] = columnaF;

        return colocarReina(tablero, 0, filaF) ? tablero : null;
    }

    private boolean colocarReina(int[] tablero, int fila, int filaF){
        int n = tablero.length;
        if(fila == n) return !rAtaque(tablero);
        
        if(fila == filaF) return colocarReina(tablero, fila + 1, filaF);
        
        for(int col = 0; col < n; col++){
            tablero[fila] = col;
            if(!rAtaque(tablero) && colocarReina(tablero, fila + 1, filaF)){
                return true;
            }
            tablero[fila] = -1; 
        }
    return false;    
    }

}