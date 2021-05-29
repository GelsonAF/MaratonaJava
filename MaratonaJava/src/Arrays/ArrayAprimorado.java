
package Arrays;

import java.util.ArrayList;


public class ArrayAprimorado {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Clara");
        System.out.println(nomes.isEmpty()); //retorna true se vazio
        System.out.println(nomes.indexOf("Carlos"));// posição do registro
        System.out.println(nomes.size());// retorna quantidade de registros
        System.out.println(nomes.contains("Clara"));//verifica se a string existe no array
        System.out.println(nomes.remove(1));// remover por index ou conteudo
        System.out.println(nomes.get(0));//retorna o registro na posição
        nomes.clear();// remove tudo dentro do array
        }
}
