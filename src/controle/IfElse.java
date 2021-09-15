package controle;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o numero: ");
        double num = scanner.nextDouble();

        if (num % 2 == 0) {
            System.out.println("Par!");
        } else {
            System.out.println("Ímpar");
        }

        scanner.close();
    }


}
