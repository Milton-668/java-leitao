package oo.composicao.umparamuitos;

public class Motor {

    Carro carro;
    boolean ligado = false;
    double fatorInjecao = 1;

    //Estamos forçando que dentro do motor há um carro.
    Motor(Carro carro) {
        this.carro = carro;
    }

    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }

    }
}
