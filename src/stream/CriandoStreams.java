package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        //recebe um parametro e não retorna nada
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        //Criando uma Stream e acessando o método static of
        //apartir da intercafe Stream
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        String[] maisLangs = {"Python ", "C++ ", "Perl ", "Go\n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        //Forma de passar pelos elementos de forma delimitada
        //onde pegamos apartir do elemento de indice 0 e delimitamos
        //antes do indice dois. Passando o índice 2 como delimitador.
        Arrays.stream(maisLangs, 0, 2).forEach(print);

        List<String> outrasLangs = Arrays.asList("\nC# ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        //Os dados são apresentados sem sequencia, mas em paralelo
        outrasLangs.parallelStream().forEach(print);
        //Gera um valor de forma infinita apartir da interface Supplier
        //a qual gera não recebe nenhum parametro mais retorna uma valor
        //Stream.generate(()->"A").forEach(print);
        //Gera de forma infinita o valor 1.
        //Stream.iterate(0, n -> n + 1).forEach(println);

    }
}
