package classesMetodos.DesafioModulo;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Bean", 0.250);
        Comida c2 = new Comida("Rice", 0.250);

        Pessoa p1 = new Pessoa("Mario", 80.00);

        System.out.println(p1.apresentar());
        p1.comer(c1);
        p1.comer(c2);
        System.out.println(p1.jantado());
    }
}
