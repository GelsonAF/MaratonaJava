
package Janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BotaoComAcao extends JFrame implements ActionListener{
   JButton jb = new JButton("Mensagem");
   JButton jb2 = new JButton("Sair");
   
   public void actionPerformed(ActionEvent e){
       if(e.getSource()== jb){
           JOptionPane.showMessageDialog(null, "Mensagem...");
       }
       if(e.getSource()== jb2){
           System.exit(0);
       }
   }
   
   
    public BotaoComAcao(){
        
        jb.addActionListener(this);//this referece a onde será tratado a acão, nesta classe
        jb2.addActionListener(this);
        
        setLayout(null);//remove a pré definição de tamanho e outras coisas do botão
        jb.setBounds(10,10,100,40);//tamanho e posição do botão
        jb2.setBounds(10,60,100,40);
        
        //set janela
        getContentPane().add(jb);// habilita área na janela para adicionar o componentes como o botão
        add(jb2);
        setTitle("Titulo do botão");
        setSize(700,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
