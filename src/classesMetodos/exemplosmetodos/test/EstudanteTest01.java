package classesMetodos.exemplosmetodos.test;

import classesMetodos.exemplosmetodos.domain.Estudante;
import classesMetodos.exemplosmetodos.domain.PrintEstudante;

public class EstudanteTest01 {

    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        PrintEstudante printEstudante = new PrintEstudante();

        estudante1.nome = "Marcos";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        estudante2.nome = "Quezia";
        estudante2.idade = 30;
        estudante2.sexo = 'F';

        //estudante1 é a váriavel de referencia para que seja chamado
        //agora o argumento que foi passado por parametro no método
        //printEsudante.
        printEstudante.print(estudante1);
        printEstudante.print(estudante2);

        System.out.println("************************");

        printEstudante.print(estudante1);
        printEstudante.print(estudante2);

    }
}
