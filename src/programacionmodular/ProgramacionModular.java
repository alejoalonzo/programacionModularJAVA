package programacionmodular;
public class ProgramacionModular {
    
    /*En la programacion modular basicamente dividiremos nuestro programa en 
    fracciones en las cuales estara el MAIN que es el programa principal y luego
    las funciones y metodos que son como mini programas que llamaremos desde el main.
    Estos pueden ir debajo o arriba del main.
    */
    public static void main(String[] args) {
      
        int var;
        miPrimerMetodo(); // Asi se llama al metodo, entre los parentesis pueden ir parametros 
        
        miSegundoMetodo();
        
        var = miPrimeraFuncion();//Esta funcion devuelve un 6 que ahora pasa a almacenarce en variable VAR
        System.out.println(var);
        
        var = miSegundaFuncion(6); //Aqui le estamos pasando un parametro, ese parametro se multiplica por dos como esta puesto en RETURN      
        System.out.println(var);//Ahora lavariable que valia 6 pasa a valer 12 
        
        miPrimerMetodo();//Se puede llamar a las funciones y metodos todas las veces que queramos.  
    }
    
    /*Fuera del MAIN en esta ocacion en la parte de abajo irian nuestros metodos o funciones
    los metodo se diferencian de las funciones porque no devuelven nada, y eso se pone justo 
    antes del nombre del metodo con un VOID
    */
    public static void miPrimerMetodo(){
        System.out.println("hola soy un metodo");
    }
      public static void miSegundoMetodo(){//si queremos meter otro metodo no puede ir con el mismo nombre
        System.out.println("hola soy un metodo");
    }
    
        public static int miPrimeraFuncion(){//Las funsioned si devuelven cosas en esta ocacion un INT, por eso el RETURN
        return 6;
    }
        
        public static int miSegundaFuncion(int x){//metiendo parametros enteros INT
        return x*2;//Sepueden pasar varios parametro int, boolean, String etc.
        //cuando se ejecuta el RETURN la funcion termina
    }
}
