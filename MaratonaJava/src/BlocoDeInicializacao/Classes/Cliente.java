/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlocoDeInicializacao.Classes;

/** sequencia de construção de uma classe
 * 1 alocado espaço na memoria para o objeto que será inicializado
 * 2 Cadas atributo de classe é criado e inicializado com seus valores defaut ou valores explicitos
 * 3 Bloco de inicialização é executado
 * 4 o construtor é executado
 * 
 */
public class Cliente {
    private int[] parcelas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    
    { //---- BLOCO DE INICIALIZAÇÃO --
        // o bloco de inicialização é útil para inicializa valores em variaveis
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for(int i=1 ; i<=100 ; i++){
            parcelas[i-1] = i;
        }
        System.out.println("");
    }
    
    public Cliente(){
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
    
}
