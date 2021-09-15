package controle;

import java.util.Scanner;

public class SwithWithBreak {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        String conceito = "";
        System.out.println("Entre com a nota: ");
        int nota = entry.nextInt();

        switch ((int) nota) {
            case 10:
            case 9:
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;

            case 2:
            case 1:
                conceito = "E";
                break;
        }
        System.out.println("Conceito é " + conceito);
        entry.close();

    }
}
