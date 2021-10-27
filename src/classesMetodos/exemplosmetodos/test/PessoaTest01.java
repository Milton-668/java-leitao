package classesMetodos.exemplosmetodos.test;

import classesMetodos.exemplosmetodos.domain.Pessoa;

public class PessoaTest01 {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Marcão");
        pessoa.setIdade(70);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
