package controle;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int num = 0;
        // i % 2 == 0

        System.out.println("Insira o numero:");
        num = entry.nextInt();
        if( num % num== 1){
            System.out.println("Primo");
        }

        entry.close();
    }
}
