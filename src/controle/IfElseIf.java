package controle;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a nota do aluno:");
        double nota = scanner.nextDouble();

        if(nota>10 || nota<1){
            System.out.println("Nota inválida!");
        }else if(nota>=8){
            System.out.println("Conceito A");
        }else if (nota>=6 && nota<8){
            System.out.println("Conceito B");
        }else if(nota>=4 && nota<6){
            System.out.println("Conceito C");
        }else if(nota>=2 && nota<4){
            System.out.println("Conceito D");
        }else System.out.println("Conceito E");

        System.out.println("Até mais");
        scanner.close();
    }
}
