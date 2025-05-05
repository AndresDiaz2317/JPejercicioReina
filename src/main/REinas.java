package main;


public class REinas {

    static void dibujar(int[] tablero){
        int n = tablero.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n ; j++){
                if(tablero[i] == j){
                    System.out.print("|R");
                }
                else{System.out.print("|_");}
            }
            System.out.println("|" );
        }
        System.out.println();   
    }
    
    static boolean rAtaque(int[] tablero){
        int n = tablero.length;
        boolean res = false;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(tablero[i] == tablero[j]){
                    return true;
                } 
                if(Math.abs(tablero[i] - tablero[j]) == Math.abs(i - j)){
                    return true;
                }
            }
        }
        return res; 
    }
    
    static void buscarSolucion(){
        int contador = 0;
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
                                            dibujar(tablero);
                                            contador++;
                                        }
                                    }
        System.out.println("El numero de soluciones es de: " +contador+ " solcuiones");
    }
    
    public static void main(String[] args) {

        buscarSolucion();
    }
    
}   