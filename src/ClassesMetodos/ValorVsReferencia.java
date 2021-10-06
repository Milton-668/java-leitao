package ClassesMetodos;

public class ValorVsReferencia {

    public static void main(String[] args) {
        // A atribuição por tipo primitivo gera uma cópia
        // do valor que está atribuido a a outra váriavel
        double a = 2;
        double b = a; //Atribuição por tipo primitivo
        a++;
        b--;
        System.out.println(a + " " + b);

        int c = 10;
        alterarTipoPrimitivo(c);
        System.out.println(c);

        //No caso de atribuição por referencia um objeto passa
        //a ter o mesmo endereço de memória do que o outro
        // conforme vemos no exemplo abaixo.
        // onde o que é manipulado em d1 tbm é manipulado em d2
        DesafioData d1 = new DesafioData();
        DesafioData d2 = d1; //Atribuição por referência ao objeto

        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2020;

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        voltarParaValorPadrao(d1);

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

    }

    static void voltarParaValorPadrao(DesafioData desafioData) {
        desafioData.dia = 1;
        desafioData.mes = 1;
        desafioData.ano = 1970;
    }
    static void alterarTipoPrimitivo(double c){
        c++;
    }

}
