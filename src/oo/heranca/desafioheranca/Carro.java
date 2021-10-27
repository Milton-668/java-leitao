package oo.heranca.desafioheranca;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int range = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if (velocidadeAtual + range > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += range;
        }
    }

    void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    public String toString() {
        return "" + velocidadeAtual;
    }
}
