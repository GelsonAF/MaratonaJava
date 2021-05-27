
package escrevertxt;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class EscreverTxt {

    public static void main(String[] args) {
        Path caminho = Paths.get("C:/Users/gelso/Desktop/teste.txt");
        String texto = "teste a ser gravado no arquivo \ndois\n";
        byte[] textoEmByte = texto.getBytes();
        try{
        Files.write(caminho, textoEmByte, StandardOpenOption.APPEND);//APPEND para adicionar e não sobrescrever
        }catch(Exception erro) {
            System.out.println("não foi possivel escrever no arquivo");
    }
    
}
