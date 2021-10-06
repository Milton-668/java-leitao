package ClassesMetodos;

public class DesafioDataTeste {

    public static void main(String[] args) {

        DesafioData d1 = new DesafioData();
        var d2 = new DesafioData(10,5,2005);

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());
    }
}
