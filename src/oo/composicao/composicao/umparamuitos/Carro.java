package oo.composicao.composicao.umparamuitos;

public class Carro {

    Motor motor;
    //Nesse caso estamos forçando que tenha um motor dentro do carro
    Carro() {
        this.motor = new Motor(this);
    }

    void acelerar() {
        if (motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligado() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}
