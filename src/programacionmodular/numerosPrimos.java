/*
En este ejemplo vamos a introducir un numero por teclado y el programa nos va a responder si es primo o no.
Recordar que un numero primo es el que tiene mas de 2 divisores o sea el 1 y el mismo numero.
para ello hacemos un main y una funcion donde va a ir la ecuacion  para encontrar si es primo o no
en esa ecuacion con un FOR recorremos desde el 1 hasta el numero que introduzcamos y si en su camino
se encuentra con un reciduo que sea igual a cero deja de  ser primo porque ya pasa a tener mas de dos divisores.
esa funcion la llamaremos desde el main.
 */
package programacionmodular;

import java.util.Scanner;
public class numerosPrimos {
    public static void main(String[] args){
        //todo programa principal.
        
        //Activo scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        
        //Introduzco los datos
        System.out.print("Introduzca un numero etero positivo: ");
        int n = leer.nextInt();
        
        if(esPrimo(n)){//aqui llamo a la funcion de abajo
            System.out.println("El " + n + " es primo");
        }
        else{
            System.out.println("El " + n + " no es primo");
        }
    }
    
    //A partir de aqui las funciones y metodos
    
    public static boolean esPrimo(int x){//esto devuelve algo, asi que es funcion.
        //devuelve un booleano y recibe un entero
        
        for (int i=2; i<x; i++){
        //va a incrementar desde el 2 hasta que llegue al numero que introducimos arriba por teclado, que este caso lo llamamos X
          
            if((x%i)==0){//Si en su camino encuentra un numero que al dividirlo de un reciduo cero es que tiene otro divisor yy deja de ser primo
                return false;
            }
        }
        return true;// con el return se termina la funcion
    }
}
