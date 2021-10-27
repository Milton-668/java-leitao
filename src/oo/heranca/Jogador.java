package oo.heranca;

public class Jogador {

    int life = 100;
    int x;
    int y;

    boolean atack(Jogador oponente) {
        //aqui é verificado o valor absoluto da diferença entre os eixos
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.life -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.life -= 10;
            return true;
        } else {
            return false;
        }
    }

    boolean walk(Direcao direcao) {
        if (direcao == Direcao.NORTE) {
            y--;
        } else if (direcao == Direcao.LESTE) {
            x++;
        } else if (direcao == Direcao.SUL) {
            y++;
        } else if (direcao == Direcao.OESTE) {
            x--;
        }
        return true;
    }
}
