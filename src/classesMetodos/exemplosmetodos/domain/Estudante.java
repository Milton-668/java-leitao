package classesMetodos.exemplosmetodos.domain;

public class Estudante {

    public String nome;
    public int idade;
    public char sexo;

    public void print() {

        System.out.println("----------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
