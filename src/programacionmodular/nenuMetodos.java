
package programacionmodular;

import java.util.Scanner;
public class nenuMetodos {
  public static void main (String[] args){
      
      int opcion = 0;
      Scanner teclado = new Scanner(System.in);
      
      while(opcion<4){
          
          mostrarMenu();
          
          System.out.printf("\nintroduzca opcion (1-4): ");// el printf es para darle formato por eso lleva la F
          opcion = teclado.nextInt();
          System.out.println();
          
          if(opcion == 1){
              System.out.println("Has escogido la opcion 1");
              numerosDelUnoAlDiez();
          }
          else if(opcion == 2){
              System.out.println("Has escogido la opcion 2");
              tablaDelOcho();
          }
           else if(opcion == 3){
              System.out.println("Has escogido la opcion 3");
              potenciasDeDos();
          }
           else{
              System.out.println("Has escogido salir");
          }
      }
  }

    //----------------FUNCIONES Y METODOS-------------------------
    public static void mostrarMenu(){
        System.out.printf("\n>>>MENU DE OPCIONES<<<");
        System.out.printf("\n1. Numeros del 1 al 10");
        System.out.printf("\n2. Tabla de multiplicar del 8");
        System.out.printf("\n3. Primeras 10 potencias de 2");
        System.out.printf("\n4. o superior. Salir");
        System.out.println();
    }
    
    public static void numerosDelUnoAlDiez(){
        System.out.printf("\nMUESTRO NUMEROS DEL 1 AL 10");
        for(int i=0; i<11; i++){
            //el "pritf" esta vez lleva 2 parametros separados por la coma: "%d" que dice que es un entero y el "i"
            System.out.printf("%d",i);
            System.out.printf("\n");
        }
    }
    
    public static void tablaDelOcho(){
        int contador, resultado;
        System.out.println("MUESTRO LA TABLA DEL 8");
        for(contador = 1; contador <= 10; contador++){
            resultado = contador*8; 
            System.out.printf("8 * %d = %d\n", contador,resultado);    
        }
    }
    
    public static void potenciasDeDos(){
        int contador;
        System.out.println("MUESTRO LAS PRIMERAS 10 POTENCIAS DE 2");
        for(contador = 1; contador <= 10; contador++){
            //con el "Math.pow()" sacamos la potencia de un numero
            System.out.printf("%d", (int) Math.pow(2,contador));
            System.out.printf("\n");
        }
    }
            
}
