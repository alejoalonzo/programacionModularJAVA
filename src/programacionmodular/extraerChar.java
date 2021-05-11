
package programacionmodular;

import java.util.Scanner;
public class extraerChar {
    public static void main(String[] args){
        
        Scanner entradaKey = new Scanner(System.in);
        
        int posi;
        char carac;
        String cadena;
        
        System.out.println("Introduzca una cadena");
        cadena = entradaKey.nextLine();
        
        System.out.println("Introduzca una posicion");
        posi = entradaKey.nextInt();
        
        //hago la llamada de la funcion
        carac = posiDeChar(posi, cadena);
        System.out.println("Su posicion es: " +carac);
    }
    
    
    //-------------------------------------FUNCION------------------------------
    //Recibo del main "int posi;" que aqui le llamo "i" y la "String cadena" que aqui le llamo "str"
    public static char posiDeChar (int i, String str){
        char caracter;// creo variable  Char
        caracter = str.charAt(i);
        return caracter;//devuelvo un caracter
    }
}
