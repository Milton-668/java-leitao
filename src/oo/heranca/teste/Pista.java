package oo.heranca.teste;

import oo.heranca.desafioheranca.Carro;
import oo.heranca.desafioheranca.Corsa;
import oo.heranca.desafioheranca.Ferrari;

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
        // f1.ligarTurbo();
        f1.acelerar();
        // f1.desligarTurbo();
        f1.acelerar();
        //f1.acelerar();
        //f1.acelerar();
        System.out.println("Velocidade do Ar " + f1.velocidadeAr());
        System.out.println("Acelera Ferrari " + f1);


        f1.frear();
        f1.frear();
        System.out.println("Breca Ferrari " + f1);
    }
}
