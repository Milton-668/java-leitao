/*
package exceptions;

import exceptions.error.Exception;

public class Basic {

    public static void main(String[] args) {
        //Nesse caso forçamos uma exceção de NullPointerException
        //ao passarmos o valor de aluno como null, pois no método
        //printAluno esperava-se um parâmetro e o parâmetro não
        //pode vir null
        Aluno a1 = null;

        try {
            printAluno(a1);
        } catch (Exception exception) {
            System.out.println("Ocorreu um erro no momento de imprimir " +
                    "o nome do usuário!");
        }

        try {
            System.out.println(7 / 0);
            //Inserção da exception
        } catch (ArithmeticException e) {
           */
/* //imprime a pilha de execução
            e.printStackTrace();*//*

            System.out.println("Ocorreu um erro:" + e.getMessage());
        }
        System.out.println("Fim:)");
    }

    public static void printAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
*/
