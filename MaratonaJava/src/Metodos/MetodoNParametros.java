/*
 * exercicios Métodos com N parametros
 * Métodos com a quantidade de parametros indefinido
 */
package Metodos;

public class MetodoNParametros {
    int somarNumeros(int... numeros){
    int soma = 0;
        for(int n : numeros){
            soma += n;
        }
        return soma;
    }
    
    public static void main(String[] args) {
        MetodoNParametros teste = new MetodoNParametros();
        int resultado = teste.somarNumeros(5,3,8);
        System.out.println("Numeros somados: " + resultado );
        
    }
    
}
