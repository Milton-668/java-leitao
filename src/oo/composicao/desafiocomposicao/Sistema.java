package oo.composicao.desafiocomposicao;

public class Sistema {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("João Marmota");
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        compra1.adicionarItem("Caneta", 1, 10);
        compra1.adicionarItem(new Produto("Caderno", 25), 10);
        compra2.adicionarItem("Lapiseira", 5, 10);
        compra2.adicionarItem(new Produto("Lancheira", 50), 10);

        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println("Valor total da compra: " + cliente.obterValorTotal());
    }
}
