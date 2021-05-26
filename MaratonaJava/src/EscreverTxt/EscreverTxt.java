
package escrevertxt;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class EscreverTxt {

    public static void main(String[] args) {
        Path caminho = Paths.get("C:/Users/Gelson/Desktop/teste.txt");
        String texto = "teste a ser gravado no arquivo \ndois";
        byte[] textoEmByte = texto.getBytes();
        try{
        Files.write(caminho, textoEmByte);
    }catch(Exception erro) {
        
    }
    
}
