package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Anonilda", 7);
        Aluno aluno2 = new Aluno("Hermes", 5);
        Aluno aluno3 = new Aluno("Lora", 8);
        Aluno aluno4 = new Aluno("Raquel", 10);
        Aluno aluno5 = new Aluno("Marto", 6.5);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);

        Predicate<Aluno> aprovado = aprovados -> aprovados.nota >= 7;
        Function<Aluno, String> mapeado =
                aprovados -> "Aprovado!!! " + aprovados.nome + " " + aprovados.nota;

        alunos.stream()
                //Esse é o caso do filtro em cima da condicional da nota
                .filter(aprovado)
                //O Map nesse caso é apenas para retornar mapeado o filtro.
                .map(mapeado)
                .forEach(System.out::println);
    }
}
