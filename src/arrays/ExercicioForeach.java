package arrays;

public class ExercicioForeach {

    public static void main(String[] args) {

        double[] alunoA = {8.5, 10, 9.5, 7.5};

        double total = 0;

        for (double nota : alunoA) {
            System.out.print(nota + " ");
            total += nota;
        }
        System.out.println();
        System.out.printf("Media das notas é %.2f\n",total / alunoA.length);
    }
}
