
package Janelas;

import javax.swing.JFrame;


public class Janela {// poderia ter colocado um extends JFrame e não precisaria do jf
    
    public Janela(){
        JFrame jf = new JFrame();
        jf.setTitle("Titulo da Janela");
        jf.setSize(500,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // encerra ao fechar a janela
        jf.setLocationRelativeTo(null);// posição relativa, para janela não abrir no canto do monitor
        jf.setResizable(false);// para que a janela não possa ser redimencionada
        jf.setVisible(true);
        
    }
    
}
