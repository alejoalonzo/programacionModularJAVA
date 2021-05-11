
package programacionmodular;

import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        //variables
        float decimal;
        boolean positivo;
        
        System.out.println("Introduzca un numero decimal");
        decimal = in.nextFloat();
        
        positivo = numPar(decimal);//positivo pasa a ser la resolucion de la funcion
        if (positivo){//Si la funcion retorna true que entre aqui
            System.out.println("Es positivo");
        }else{
            System.out.println("Es negativo");
        }  
    }
    //----------------------------------FUNCION-------------------------------
    public static boolean numPar(float x){//Me mandan un float
        if(x>0){
            return true;
        }else{
            return false;
        }   
    }
}
