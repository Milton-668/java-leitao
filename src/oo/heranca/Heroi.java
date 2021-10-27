package oo.heranca;

public class Heroi extends Jogador {

    boolean atack(Jogador oponente) {
        boolean atack1 = super.atack(oponente);
        boolean atack2 = super.atack(oponente);
        boolean atack3 = super.atack(oponente);

        //atack1 || atack2 || atack3 ? true : false;
        return atack1 || atack2 || atack3;
    }
}
