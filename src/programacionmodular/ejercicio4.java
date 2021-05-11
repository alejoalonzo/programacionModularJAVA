package programacionmodular;

public class ejercicio4 {
    public static void main(String[] args){
        
        //Declaro mi variable
        char crt;
        
        crt = letra("hola");//Hago la llamada de la función, "ch" pasa a ser "ctr"
        System.out.println("La primera letra de hola es: " + crt);
    }
    
    //---------------------------------------FUNCION-------------------------
    public static char letra(String x){//Recibo  una cadena para poder trabajar
        char ch;
        ch = x.charAt(0);//Busco el primer caracter  de la cadena que me han dado del main
        return ch;
    }
}
