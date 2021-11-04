package lambdas.lambdas2;

import java.util.Arrays;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Bia", "Lia", "Ana", "Gui");

        System.out.println("Forma tradicional...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda version 01...");

        //Nesse caso estamos utilizando uma lambda para percorrer cada
        //elemento da lista, nesse caso como temos apenas um parâmetro
        //não precisa necessariamente deixa-lo dentro de (), {} e ;.
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        System.out.println("\nMethod Reference 01...");
        //A passagem é por referencia ao método
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda version 02...");
        aprovados.forEach(nome -> imprimir(nome));

        System.out.println("\nMethod Reference 02...");
        //Passando uma referencia a um método static criado na classe
        aprovados.forEach(ForEachTest::imprimir);
    }

    static void imprimir(String nome) {
        System.out.println("Olá! Meu nome é " + nome);
    }
}
