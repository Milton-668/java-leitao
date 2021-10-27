package oo.heranca;

public class Jogo {

    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.y = 10;
        monstro.x = 10;

        Heroi heroi = new Heroi();
        heroi.y = 10;
        heroi.x = 11;

        System.out.println("Life of Monster " + monstro.life);
        System.out.println("Life of Hero " + heroi.life + "\n");

        monstro.atack(heroi);
        heroi.atack(monstro);

        monstro.atack(heroi);
        heroi.atack(monstro);

        monstro.walk(Direcao.NORTE);
        monstro.atack(heroi);
        heroi.atack(monstro);

        System.out.println("Pós ataque!");
        System.out.println("Life of Monster " + monstro.life);
        System.out.println("Life of Hero " + heroi.life);
    }
}
