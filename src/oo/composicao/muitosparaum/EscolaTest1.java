package oo.composicao.muitosparaum;

public class EscolaTest1 {

    public static void main(String[] args) {

        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Marcos");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("PIANO BIANCHI", professores);

        escola.imprime();

    }
}
