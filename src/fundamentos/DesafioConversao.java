package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o 1° salario: ");
        String sal1 = entrada.next().replace(",",".");

        System.out.println("Insira o 2° salario: ");
        String sal2 = entrada.next().replace(",",".");

        System.out.println("Insira o 3° salario: ");
        String sal3 = entrada.next().replace(",",".");

        double num1 = Double.parseDouble(sal1);
        double num2 = Double.parseDouble(sal2);
        double num3 = Double.parseDouble(sal3);

        double media = ((num1 + num2 + num3) / 3);

        System.out.printf("A media das notas eh: %.2f ", media );

        entrada.close();
    }
}
