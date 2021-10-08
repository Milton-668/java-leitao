package arrays;

import java.util.Arrays;

public class ExemploArray {
    public static void main(String[] args) {

        double[] alunoA = new double[3];
        System.out.println(Arrays.toString(alunoA));

        alunoA[0] = 5.5;
        alunoA[1] = 6.5;
        alunoA[2] = 8.5;

        /*//mostra todo o conteudo do Array
        System.out.println(Arrays.toString(alunoA));
        //mostra o conteudo na posição indice 0
        System.out.println(alunoA[0]);
        //mostra a ultima nota do array
        System.out.println(alunoA[alunoA.length - 1]);
*/
        double total = 0;
        for (int i = 0; i < alunoA.length; i++) {
            total += alunoA[i];
        }
        System.out.println(total / alunoA.length);

        /*double notaArmazenada = 8.5;
        double[] alunoB = {10, 5.5, notaArmazenada, 9};
        double totalAlunoB = 0;
        for (int i = 0; i < alunoB.length; i++) {
            totalAlunoB += alunoB[i];
        }
        System.out.println(totalAlunoB / alunoB.length);*/
    }
}
