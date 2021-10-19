package oo.composicao.umparamuitos;

public class CompraTest {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.nome = "Valdo";

        //Criei o constructor na classe Item e já preenchi direto no add
        compra1.adicionarItem("Lápis", 4, 1.50);
        compra1.adicionarItem("Caneta", 5, 5.50);
        compra1.adicionarItem("Borracha", 2, 2.5);

        System.out.println("Size " + compra1.itens.size());
        System.out.println("O valor total é: " + compra1.getValorTotal());

        //Demonstração da relação bidirecional
        double total = compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
        System.out.println("O total é: " + total);
    }
}
