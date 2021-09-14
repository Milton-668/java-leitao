package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        System.out.print("Boa tarde");

        System.out.println("Bom dia!");

        System.out.printf("Megasena: %d %d %d %n", 10, 20, 30);

        System.out.printf("Salario: %.1f %n", 2500.80);

        System.out.printf("Nome: %s %n", "Joao");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Insira seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Insira a sua idade: ");
        int idade = entrada.nextInt();
        System.out.printf("%s %s tem %d anos", nome, sobrenome,idade);

        entrada.close();
    }
}
