package controle;


import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Digite palavras e acerte a saída:");
            texto = entry.nextLine();
        } while (!texto.equalsIgnoreCase("pf"));

        System.out.println("Acertou!!!");
        entry.close();

    }
}
