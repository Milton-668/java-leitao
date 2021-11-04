package lambdas.lambdas2;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambdas {

    public static void main(String[] args) {
        /*
         * 1. A partir do produto calcular o preço real (com desconto)
         * 2. Imposto Municipal: >= 2500 (8,5%)/<2500(Isento)
         * 3. Frete: >=3000 (100)/<300 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$1234,56
         * */
        Produto p = new Produto("Celular", 1500.00, 0.10);

        Function<Produto, Double> precoFinal = produto -> p.preco * (1 - p.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 300 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> preco;
        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preço final é: " + preco);

    }
}
