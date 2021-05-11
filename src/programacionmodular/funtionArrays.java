
package programacionmodular;


public class funtionArrays {
    

    public static void main(String[] args){
        
        int[] num = {1, -1, 5, 6, 6, 8};
        
        boolean negativo;//declaro variable booleana
        negativo = numNegativo(num);//la llamada de la funcion
        if (negativo){
            System.out.println("Hay un numero negativo");
        }
    }
    
    //--------------------------------FUNCION---------------------------------
    //paso como parametro un array, es el mismo de arriba  pero le pongo diferente nombre "lista[]"
    public static boolean numNegativo(int lista[]){ 
        for(int i = 0; i < lista.length; i++){//Recorro el array en busca del negaativo
            if (lista[i] < 0){
                
                return true;//Si lo encuentro mando True pa arriba, "negativo" pasara a valer true 
            }
        }return false;//si no lo encuentro que termine el bucle y mando false, "negativo" pasara a valer false
    } 
}


