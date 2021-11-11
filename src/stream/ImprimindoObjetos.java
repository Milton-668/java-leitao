package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lia", "Gui", "Ana", "Rita");

        System.out.println("Usando o forEach...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }
        //Repetição checando se há próximos elementos para passar
        System.out.println("\nUsando o Iterator...");
        //Interface que gera a iteração
        Iterator<String> iterator = aprovados.iterator();
        //método que chega se tem próximo
        while (iterator.hasNext()) {
            //pega os próximos elementos
            System.out.println(iterator.next());
        }
        System.out.println("\nUtilizando Stream...");
        Stream<String> stream = aprovados.stream();
        //Passado por cada elemento contido na lista de aprovados
        stream.forEach(System.out::println);//Laço interno
    }
}
