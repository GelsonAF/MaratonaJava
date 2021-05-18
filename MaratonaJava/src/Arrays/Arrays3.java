
package Arrays;

public class Arrays3 {
    
    public static void main(String[] args){
        
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};
        
        for (int i = 0 ; i<numeros2.length;i++){
            System.out.println(numeros2[i]);
        }
        // for eatch
        System.out.println("-----for eatch-----");
        for(int aux : numeros3){ //deve ser criada a variavel aux dentro do for
            System.out.println(aux);
        }
        
    }
    
}
