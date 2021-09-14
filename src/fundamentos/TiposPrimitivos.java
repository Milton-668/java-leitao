package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        //Tipos numéricos inteiros
        byte tempoDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L; // o L no final do n° indica que é Long caso contrário ele pega int

        //Tipos numéricos reais
        float salario = 11_445.44F; // o F aponta que o número realmente é float para não puxar double
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean estadoDeFerias = false;

        //Tipo Caractere
        char status = 'A';

        System.out.println(tempoDeEmpresa * 365);
        System.out.println(numeroDeVoos/2);
        System.out.println(pontosAcumulados/vendasAcumuladas);
        System.out.println(id);
        System.out.println(estadoDeFerias);
        System.out.println(status );
    }
}
