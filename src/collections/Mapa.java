package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        //put() adiciona e substitui caso necessário;
        usuarios.put(1, "Marcos");
        usuarios.put(2, "Chris");
        usuarios.put(3, "Beto");
        usuarios.put(4, "Marcio");

        System.out.println("Tamanho " + usuarios.size());
        System.out.println("Vazio? " + usuarios.isEmpty());
        System.out.println("Chave " + usuarios.keySet());
        System.out.println("Valor " + usuarios.values());
        System.out.println("Chave/Valor " + usuarios.entrySet());

        System.out.println("Contêm? " + usuarios.containsKey(1));
        //Case sensitive
        System.out.println("Contêm? " + usuarios.containsValue("Marcio"));
        System.out.println("Elemento " + usuarios.get(4));
        //Remove por chave e retorna o valor
        System.out.println("Method remove " + usuarios.remove(1));
        //Remove por chave e valor retornando um boolean
        System.out.println("Method remove " + usuarios.remove(4, "Mario"));

        //Percorre por chave
        for (int chave : usuarios.keySet()) {
            System.out.printf("%d, ", chave);
        }
        System.out.println();
        //Percorre por valor
        for (String valor : usuarios.values()) {
            System.out.printf("%s, ", valor);
        }
        System.out.println();
        //Percorre por chave e valor
        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey() + "==> ");
            System.out.println(registro.getValue());
        }

    }
}
