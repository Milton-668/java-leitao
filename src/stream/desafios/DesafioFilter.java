package stream.desafios;

import stream.Imposto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Imposto c1 = new Imposto("Marcos", 25.000, 2);
        Imposto c2 = new Imposto("Eriberto", 27.999, 2);
        Imposto c3 = new Imposto("Chico", 35.000, 2);
        Imposto c4 = new Imposto("Mabel", 32.000, 0);
        Imposto c5 = new Imposto("Cristina", 22.000, 2);

        List<Imposto> contribuintes = Arrays.asList(c1, c2, c3, c4, c5);
        Predicate<Imposto> pisoImposto = cont -> cont.salarioAnual >= 27.000;
        Predicate<Imposto> dependente = cont -> cont.dependente > 0;
        Function<Imposto, String> mapeado = cont -> "Parabéns " + cont.nome + " você pagará o IR com descontos!";

        contribuintes.stream()
                .filter(pisoImposto)
                .filter(dependente)
                .map(mapeado)
                .forEach(System.out::println);
    }
}
