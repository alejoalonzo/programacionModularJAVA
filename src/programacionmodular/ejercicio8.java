
package programacionmodular;

public class ejercicio8 {
    public static void main(String[] args){
        
        //Variables
        int[] numeros = { 3, 4, -7, -8, -3, 1};
        int posis;
        
        posis = numPos(numeros);//Llamo a la funcion, posis pasa a ser el valor de return de la funcion
        System.out.println("el numero de positivos es: " + posis);
    }
    //------------------------------------FUNCION----------------------
    public static int numPos(int array[]){//Me mandan un array y devuelvo un int
        int resultado =0;
        for(int i = 0; i < array.length; i++){//Recorro el array en busca  de los positivos
            if (array[i] > 0 ){ //Si se encuentra un positivo lo suma a "resultado" 
                resultado++;
            }
        }return resultado;//Mando el numero de positivos
    }
}
