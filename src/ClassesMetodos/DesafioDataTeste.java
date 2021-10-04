package ClassesMetodos;

public class DesafioDataTeste {

    public static void main(String[] args) {

        DesafioData d1 = new DesafioData();
        var d2 = new DesafioData();

        d1.dia = 25;
        d1.mes = 10;
        d1.ano = 2000;

        d2.dia = 10;
        d2.mes = 5;
        d2.ano = 2005;

        System.out.printf("Dia %d, mês %d, ano %d.\n", d1.dia , d1.mes , d1.ano);
        System.out.printf("Dia %d, mês %d, ano %d.\n", d2.dia , d2.mes , d2.ano);


    }
}
