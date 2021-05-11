
package programacionmodular;


public class cubo {
    public static void main(String[] args){
        
        double var;
        
        var = cubo(7.5);//Aqui se produce la llamada
        
        System.out.println("el cubo de 7.5 es: " + var);
    }
    
    //FUNCIONES Y METODOS 
    /*
    despues del public static viene lo que devolvemos que es este casi es un double (numero 
    decimal grande, depues viene el nombre de la funcion "cubo".
    Despues entre parentisis lo parametros que nececitamos
    */
    public static double cubo (double x){//declaracion
        return x*x*x;//lo que devuelve
    }
}
