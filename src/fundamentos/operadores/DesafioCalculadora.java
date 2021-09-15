package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o 1° valor: ");
        double valor1 = Double.parseDouble(entrada.nextLine());
        System.out.println("Insira o 2° valor: ");
        double valor2 = Double.parseDouble(entrada.nextLine());

        System.out.println("Qual operação deseja fazer? ");
        String op = (entrada.nextLine());

        double add = valor1 + valor2;
        double sub = valor1 - valor2;
        double mult = valor1 * valor2;
        double div = valor1 / valor2;
        double mod = valor1 % valor2;

        String incorreto = "Caracter Invalido";

        String modulo = String.valueOf(op.equals("%")?mod:incorreto);
        String dividir = String.valueOf(op.equals("/")?div:modulo);
        String multiplicar = String.valueOf(op.equals("*")?mult:dividir);
        String subtrair = String.valueOf(op.equals("-")?sub:multiplicar);
        String tipoOp = String.valueOf(op.equals("+")? add: subtrair);

        System.out.println("O Resultado eh: "+ tipoOp);
        entrada.close();

    }
}
