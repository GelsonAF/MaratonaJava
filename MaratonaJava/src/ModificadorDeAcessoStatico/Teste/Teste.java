/*
 * To change this license header, choose License Headers in Project Properties.
 * adicionado o modificador de acesso na classe Carro na variável velocidadeLimite
 * isto faz com que a variavel pertença a classe e não mais ao objeto
 * então quando essa variavel é modificadas isso reflerirá em todos os objetos
 */
package ModificadorDeAcessoStatico.Teste;

/**
 *
 * @author gelso
 */
public class Teste {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c3 = new Carro("AUDI", 275);
        Carro c2 = new Carro("VW", 290);
        
        c1.Imprime();
        c2.Imprime();
        c3.Imprime();
        
        System.out.println("############");
        
        c1.setVelocidadeLimite(220);
        
        c1.Imprime();
        c2.Imprime();
        c3.Imprime();

    }
    
}
