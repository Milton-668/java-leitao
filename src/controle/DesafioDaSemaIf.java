package controle;

import java.util.Scanner;

public class DesafioDaSemaIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o dia da semana");
        String dia = entrada.nextLine();
        //equalIgnoreCase -> não importa o tamanho da letra
        if (dia.equalsIgnoreCase("domingo"))
            System.out.println("1° dia da semana");
        else if (dia.equalsIgnoreCase("segunda"))
            System.out.println("2° dia da semana");
        else if (dia.equalsIgnoreCase("terça")
                || dia.equalsIgnoreCase("terca"))
            System.out.println("3° dia da semana");
        else if (dia.equalsIgnoreCase("quarta"))
            System.out.println("4° dia da semana");
        else if (dia.equalsIgnoreCase("quinta"))
            System.out.println("5° dia da semana");
        else if (dia.equalsIgnoreCase("sexta"))
            System.out.println("6° dia da semana");
        else if (dia.equalsIgnoreCase("sabado")
                || dia.equalsIgnoreCase("sábado"))
            System.out.println("7° dia da semana");
        else System.out.println("Entrada inválida");

        entrada.close();

    }
}
