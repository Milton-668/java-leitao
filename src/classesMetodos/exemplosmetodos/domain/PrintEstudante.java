package classesMetodos.exemplosmetodos.domain;

public class PrintEstudante {

    //Esse método serve para imprimir o conteudo que existe dentro
    //da classe estudante a qual o seu objeto foi construido dentro
    //de EstudanteTest01
    public void print(Estudante estudante) {

        System.out.println("-------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        //Altera o nome depois de passar pela primeira vez no método
        //Referência
        estudante.nome = "Maria";
    }
}
