
package programacionmodular;

public class funcionConMatriz {
    public static void main(String[] args){
        
        int buscar = 1;
        int [][] tabla = new int [2][6];
        
        tabla [0][0] = 1;
        tabla [0][1] = 2;
        tabla [0][2] = 5;
        tabla [0][3] = 5;
        tabla [0][4] = 27;
        tabla [0][5] = 13;
        
        tabla [1][0] = 123;
        tabla [1][1] = 13;
        tabla [1][2] = 2;
        tabla [1][3] = 90;
        tabla [1][4] = 8;
        tabla [1][5] = 19;
        
        //declaro la variable booleana
        boolean esta;
        
        //Hago la llamada de la funcion
        esta = numBuscado(tabla, buscar);//la matriz "tabla" no la llamo con los corchetes
        
        if (esta == true){//se compara con el true o false no con otra variable
            System.out.println("el " + buscar + " está");
        }else
             System.out.println("el " + buscar + " no está");
    }
    
    //-----------------------------FUNCION--------------------------------------
    public static boolean numBuscado (int lista[][], int num){
        for(int i = 0; i < lista.length; i ++ ){
            for(int j = 0; j < lista[i].length; j++){
                if (num == lista[i][j]){//Recuerda que esta es una comparacion son dos iguales.
                return true;
                }
            }    
        }return false;
    }
}
