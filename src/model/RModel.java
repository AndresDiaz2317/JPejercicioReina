package model;

public class RModel {
    static boolean rAtaque(int[] tablero){
        int n = tablero.length;

        for(int i = 0; i< n; i++){
            for(int j = i + 1; j< n; j++){
                if(tablero[i] == tablero[j]){
                    return true;
                } 
                if(Math.abs(tablero[i] - tablero[j]) == Math.abs(i - j)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public int[] buscarSolucion(){
        int n = 8;
        for(int a = 0; a < n; a++)
            for(int b = 0; b < n; b++)
                for(int c = 0; c < n; c++)
                    for(int d = 0; d < n; d++)
                        for(int e = 0; e < n; e++)
                            for(int f = 0; f < n; f++)
                                for(int g = 0; g < n; g++)
                                    for(int h = 0; h < n    ; h++){
                                        int[] tablero = {a,b,c,d,e,f,g,h};
                                        if(!rAtaque(tablero)){
                                            return tablero;
                                        }
                                    }
        return null;
    }
}
