package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        //O <> é utilizado para inserir um tipo unico que será
        //utilizado para percorrer a lista dentro do Set
        //Set<String> list = new HashSet<>();
        //O SortedSet é responsável por trazer dados ordenados
        //no caso estamos usando o TreeSet que organiza os dados
        //em ordem alfabética
        Set<Double> nums = new HashSet<>();
        nums.add(1.1);
        nums.add(5.5);
        nums.add(4.5);
        nums.add(4.8);

        for (Double values : nums) {
            System.out.println(values);
        }

        System.out.println("################################################################");
        SortedSet<String> candidatos = new TreeSet<>();
        candidatos.add("Ana");
        candidatos.add("Marcos");
        candidatos.add("Paulo");
        candidatos.add("Pitolomeu");

        for (String nome : candidatos) {
            System.out.println(nome);
        }


    }
}
