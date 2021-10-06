package classesMetodos.DesafioModulo;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.pesoComida;
        }
    }

    String apresentar() {
        return "Esse é " + nome + " ele estava com "
                + peso + " kilos antes de comer." +
                "Vamos ver como ele ficará depois... ";
    }

    String jantado(){
        return " Ele deu uma engordadinha não? "
                + peso + " kilos";
    }
}
