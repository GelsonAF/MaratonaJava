/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlocoDeInicializacao.Teste;

import BlocoDeInicializacao.Classes.Cliente;

/**
 *
 * @author gelso
 */
public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Dentro do main");
        for(int parcela : c.getParcelas()){
            System.out.print(parcela +" ");
        }
        System.out.println("");
    }
}
