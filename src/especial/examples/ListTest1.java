package especial.examples;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();

        names.add("Joao");
        names.add("Beto");
        names.add("Marcos");
        names2.add("Mario");
        names2.add("Ludovico");
        names2.add("Pitagoras");
        names2.add("Marcos");

        //Adiciona em names tudo que há em names2
        names.addAll(names2);

        for (String nomes : names) {
            System.out.println(nomes);
        }
        names.add("Junior");
        System.out.println("-----------");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    }
}

