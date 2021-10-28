package oo.encapsulamento.getandset;

public class PessoaTest {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setIdade(-30);
        p1.setNome("Marinaldo");
        p1.setNickname("Rosa");
        p1.getNomeCompleto();

        System.out.println(p1.getIdade());
        System.out.println(p1.getNome());
        System.out.println(p1.getNickname());
        System.out.println(p1.getNomeCompleto());
    }

}
