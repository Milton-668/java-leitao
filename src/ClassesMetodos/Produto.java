package ClassesMetodos;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    double precoComDesconto() {
        double valorComDesconto = preco * (1 - desconto);
        return valorComDesconto;
    }
    double precoComDesconto(double descontoGerente) {
        double valorComDesconto = preco * (1 - desconto + descontoGerente);
        return valorComDesconto;
    }

}
