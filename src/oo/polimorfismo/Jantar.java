package oo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(90);
        Arroz arroz = new Arroz(0.25);
        Feijao feijao = new Feijao(0.150);
        Comida sorvete = new Sorvete(0.300);

        System.out.println(pessoa.getPeso());
        pessoa.comer(arroz);
        pessoa.comer(feijao);
        System.out.println(pessoa.getPeso());

        pessoa.comer(sorvete);
        System.out.println(pessoa.getPeso());

    }


}
