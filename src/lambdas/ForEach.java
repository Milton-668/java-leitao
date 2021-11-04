package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
/*
        System.out.println("Forma Tradicional");
        for (String nome : aprovados) {
            System.out.println(nome);
        }*/

        System.out.println("\nLambda version01...");
        //Uma outra forma que temos para percorrer dentro de uma lista,
        //é através da utilização do .forEach com a estrutura lambda
        //conforme abaixo:
        //Na estrutura nós passamos a variável de referencia de lista de aprovados
        //iniciamos a estrutura do forEach passando uma váriavel interna no caso nome
        //passando uma a arrow function e colocando entre chaves a execução que no caso
        //é trazer as informações contidas da lista de aprovados (nomes)
        aprovados.forEach((nome) -> {
            System.out.println(nome + "!!!");
        });

        System.out.println("\n Method Reference version 01");
        //nesse caso fizemos uma referencia a aprovados
        //imprimindo ele na saida de cada vez que passa
        //pelo Foreach
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda version 02...");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference version 02");
        aprovados.forEach(ForEach::meuImprimir);

    }

    static void meuImprimir(String nome) {
        System.out.println("Hey! Meu nome é: " + nome);
    }

}
