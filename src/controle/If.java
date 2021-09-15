package controle;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor da média");
        double media = entrada.nextDouble();

        if(media>=7 && media<=10){
            System.out.println("Aprovado!");
        }
        if (media<7 && media>4){
            System.out.println("Recuperação!");
        }
        if (media<5){
            System.out.println("Reprovado!");
        }

        entrada.close();
    }
}
