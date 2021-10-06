package classesMetodos.recodingDesafio;

public class People {

    String nome;
    double peso;

    People(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comida(Food food) {
        this.peso += food.peso;
    }

    String show() {
        return "Esse é " + nome + " ele tem " + peso + " kilos";
    }

    String showAfter() {
        return "Depois do jantar " + nome + " ficou com " + peso + " kilos";
    }

}
