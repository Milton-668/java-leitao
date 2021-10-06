package classesMetodos;

public class ProdutoTeste {

    public static void main(String[] args) {
        //Instanciando a objeto (era uma classe)
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        //identifica o tipo apartir do objeto
        var p3 = new Produto();

        p1.nome = "Desktop";
        p1.preco = 4.500;
        Produto.desconto = 0.10;

        p2.nome = "Game";
        p2.preco = 3.500;
        Produto.desconto = 0.10;

        p3.nome = "Game";
        p3.preco = 3.500;
        Produto.desconto = 0.10;

        double final1 = p1.precoComDesconto();
        double final2 = p2.precoComDesconto();
        double final3 = p3.precoComDesconto();

        System.out.printf("Desconto R$ %.3f\n",final1);
        System.out.printf("Desconto R$ %.3f\n",final2);
        System.out.printf("Desconto R$ %.3f\n",final3);
    }
}
