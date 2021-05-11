package programacionmodular;

import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       
       int opc, x, y;//Declaro mis variables
      
       for(opc = 0; opc < 4;){//Bucle para hacer operaciones hasta que se decida salir
            System.out.println("Seleccione una opción");
            menu();//Llamada del menu
            opc = in.nextInt();
            
            if (opc >= 4){
                System.out.println("Has escogido salir");   
            }
            else{
            
                //Los mismos enteros me pueden servir para todas las operaciones
                System.out.println("Introduzca 2 operandos");
                x = in.nextInt();
                y = in.nextInt();
                
                //Condicionales para llamar a cada metodo
                if (opc == 1){
                    sumar (x,y);   
                }
                else if (opc == 2){
                    restar (x,y);   
                }
                else{
                    multiplicar (x,y);   
                }
            }
        }
    }
    //--------------------------------METODOS---------------------------------
    public static void menu (){
       System.out.println("1.SUMAR");
       System.out.println("2.RESTAR");
       System.out.println("3.MULTIPLICAR");
       System.out.println("4.SALIR");
       System.out.println();
    }
   
    public static void sumar(int a, int b){
        int resultado;
        resultado = a + b;
        System.out.println("El resultado de la sumas es: " + resultado);
        System.out.println();
    }
    
    public static void restar(int a, int b){
        int resultado;
        resultado = a - b;
        System.out.println("El resultado de la resta es: " + resultado);
        System.out.println();
    }
    
    public static void multiplicar(int a, int b){
        int resultado;
        resultado = a * b;
        System.out.println("El resultado de la multiplicación es: " + resultado);
        System.out.println();
    }
}
