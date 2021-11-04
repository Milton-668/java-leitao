package lambdas.lambdas2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

        Consumer<Produto> print =
                produto -> System.out.println(produto.nome + "!");

        Produto p1 = new Produto("Caneta", 12.50, 0.10);
        //A função accept apenas recebe um valor mas não retorna
        print.accept(p1);

        Produto p2 = new Produto("Caderno", 20.00, 0.15);
        Produto p3 = new Produto("Lapiseira", 5.00, 0.15);
        Produto p4 = new Produto("Prancheta", 10.00, 0.15);
        Produto p5 = new Produto("Tabelião", 2.50, 0.15);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(print);
        produtos.forEach(produto -> System.out.println(produto.preco));
        produtos.forEach(System.out::println);
    }
}
