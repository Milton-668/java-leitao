package oo.heranca.desafioheranca;

public class Pista {

    public static void main(String[] args) {

        Carro c1 = new Corsa(220);

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println("Acelera Corsa " + c1);

        c1.frear();
        c1.frear();
        System.out.println("Breca Corsa " + c1);


        Ferrari f1 = new Ferrari(330);

        f1.acelerar();
        f1.acelerar();
        f1.acelerar();
        f1.acelerar();

        System.out.println("Acelera Ferrari " + f1);


        f1.frear();
        f1.frear();
        System.out.println("Breca Ferrari " + f1);
    }
}
