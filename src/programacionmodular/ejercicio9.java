
package programacionmodular;

import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nombre1;
        System.out.println("Introzuzca el nombre del jugador que quiere buscar: ");
        nombre1 = scan.nextLine();
        
        String [][] nombres = new String [3][3];
        nombres [0][0] = "Kobe";
        nombres [0][1] = "Harper";
        nombres [0][2] = "Pau";
        
        nombres [1][0] = "Paxson";
        nombres [1][1] = "Kukoc";
        nombres [1][2] = "Rodman";
        
        nombres [2][0] = "Jordan";
        nombres [2][1] = "Pippen";
        nombres [2][2] = "Grant";
        
        boolean si;
        //Tiene que estar en  el mismo orden los parametros con los de la funcion (matriz, string)
        si = nombrePerso(nombres, nombre1);
        
        if (si == true){
            System.out.println( nombre1 + " Está en nuestra base de datos");
        }else{
            System.out.println( nombre1 + " No está en nuestra base de datos");
        }
    }
    //----------------------------FUNCION----------------------------------
    public static boolean nombrePerso(String [][] lista, String buscar){
        
        //Bucle para recorrer la matriz 
        for (int i = 0; i < lista.length; i++){
            for(int j = 0; j < lista[i].length; j++){
                if (buscar.equals(lista[i][j])){//No olvidar que para comparar Strings es el equals
                    return true;
                }
            }
        }
        return false;   
    }  
}
