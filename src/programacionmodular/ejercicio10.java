
package programacionmodular;

public class ejercicio10 {
    public static void main(String[] args){
        double [] nums = {5, 4, 9, 11, 10, 8, 6};
        double total;
        total = media(nums);//Llamada de la funcion, "resultado" pasa a ser "total"
        System.out.println("La media de los numeros introducidos es: " + total);
        
    }
    //-----------------------------FUNCION--------------------------------
    public static double media(double[] lista){//Me mandan un array "nums", aqui le llamo "lista"
        double suma = 0;
        double resultado;
        
        for (int i = 0; i < lista.length; i++){//Recorro el array
            suma = suma + lista[i];//y voy sumando cada valor de array + 0
        }
        resultado = suma / lista.length;//Divido el total sumado entre lo largo del array
            return resultado;
    } 
}
