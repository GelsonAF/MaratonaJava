
package Arrays;

public class Arrays5Matriz1 {
    
    public static void main(String[] args){
        
        int [][] dias = new int[2][2];
        
        dias[0][0]= 1;
        dias[0][1]=2;
        dias[1][0]=3;
        dias[1][1]=4;
        
       // int dia = new int[2][2];
        int [][] valor = {{11,22},{33,44}}; // a inicialização dessa forma não funcionou
        
        for(int i =0; i < dias.length; i++){
            //System.out.println(dias[i]); //colocado para mostrar o que aparece sem um dos arrays
            for(int j=0; j<dias[i].length;j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("-----for eatch-----");
        
        for(int[] auxreferencia : valor){
            System.out.println("------");
            for(int aux : auxreferencia){
                System.out.println(aux);
            }
        }
        
    }
    
}
