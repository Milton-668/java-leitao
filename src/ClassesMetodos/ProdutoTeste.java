package ClassesMetodos;

public class ProdutoTeste {

    public static void main(String[] args) {
        //Instanciando a objeto (era uma classe)
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        //identifica o tipo apartir do objeto
        var p3 = new Produto();

        p1.nome = "Desktop";
        p1.preco = 4.500;
        p1.desconto = 0.10;

        p2.nome = "Game";
        p2.preco = 3.500;
        p2.desconto = 0.20;

        p3.nome = "Game";
        p3.preco = 3.500;
        p3.desconto = 0.20;

        double final1 = ((p1.preco * p1.desconto) + p1.preco);
        double final2 = ((p2.preco * p2.desconto) + p2.preco);
        double final3 = ((p3.preco * p3.desconto) + p3.preco);

        System.out.printf("Media R$ %.2f\n",final1);
        System.out.printf("Media R$ %.2f\n",final2);
        System.out.printf("Media R$ %.2f\n",final3);
    }
}
