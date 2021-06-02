/*
 *classe para exercicio de modificador de acesso Static
 */
package ModificadorDeAcessoStatico.Teste;

/**
 *
 */
public class Carro {
    //Velcidade limite deve ser 210 km/h
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240; // o modificador static faz com que o este valor pertença a classe e não mais ao objeto

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }
    
    public void Imprime(){
        System.out.println("------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade Maxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade Limite: "+this.velocidadeLimite);
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
    
    
    
}
