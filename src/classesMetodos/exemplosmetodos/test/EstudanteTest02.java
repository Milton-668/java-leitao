package classesMetodos.exemplosmetodos.test;

import classesMetodos.exemplosmetodos.domain.Estudante;

public class EstudanteTest02 {

    public static void main(String[] args) {


        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Filó";
        estudante1.idade = 20;
        estudante1.sexo = 'F';

        estudante2.nome = "Eriberto";
        estudante2.idade = 30;
        estudante2.sexo = 'M';

        estudante1.print();
        estudante2.print();

    }
}
