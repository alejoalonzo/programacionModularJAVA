package programacionmodular;
public class ejercicio2 {
    public static void main(String[] args){
        //Todo el programa principal
        
        //Hago la llamada del metodo
        //numPorDos(76);
        
        int dos;
        
        dos = porDos(55);//Hago la llamada de la función, "num" pasa a vales "dos"
        System.out.println("El 55 multiplicado por dos es: " + dos);
    }// el 55 mejor ponerlo en una variable para imprimir esa variable como lo hice en el metodo numPorDos
    
    //----------------------------METODO-----------------------------------
    public static void numPorDos(int x){//Recibo un int del main que  aqui le llameré "x"
        int num;
        num = x*2;
        System.out.println("El " + x + " multiplicado por dos es: " + num);
    }
    
    //----------------------------FUNCION-----------------------------------
    public static int porDos(int y){//Recibo un int del main que  aqui le llameré "x"
        int num;
        num = y*2;
        return num;
    }
}//me queda pendiente saber como retornar dos valores...
