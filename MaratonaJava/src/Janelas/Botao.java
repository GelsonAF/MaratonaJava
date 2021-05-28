
package Janelas;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Botao extends JFrame{
   JButton jb = new JButton("Botao 1");
   JButton jb2 = new JButton("Botao 1");
   
   
    public Botao(){
        
        setLayout(null);//remove a pré definição de tamanho e outras coisas do botão
        jb.setBounds(10,10,100,40);//tamanho e posição do botão
        jb2.setBounds(10,60,80,30);
        
        //set janela
        getContentPane().add(jb);// habilita área na janela para adicionar o componentes como o botão
        add(jb2);//adicionar ao conteiner, ou não aparece, pode ser usado sem o getContent
        setTitle("Titulo do botão");
        setSize(700,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
