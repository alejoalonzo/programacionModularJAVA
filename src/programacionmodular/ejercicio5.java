package programacionmodular;

import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args){
       Scanner keyboard = new Scanner(System.in);
       
       int x;
       System.out.println("Introduzca (del 1 al 10) el número  de letras que quiere ver");
       x = keyboard.nextInt();
       
       char[] letras ={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
       
       //Hago la llamada
       numDeLetras(x,letras);
    }
    
    //----------------------------------METODO-------------------------------
    //No devuelvo nada, me mandan los parametros int y array del main  
    public static void numDeLetras(int num, char car[]){
       
        System.out.println("las letras son: ");
        
        for (int i =0; i <num; i++){//Bucle para llegar hasta el num introducido por teclado
            System.out.print(car[i]+", ");//Si quisiera imprimir todo el array solo quito el [i]
        }
    }
}
