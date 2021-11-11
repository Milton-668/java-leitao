package stream;

public class Aluno {

    final String nome;
    final double nota;
    final boolean bomComportarmento;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean bomComportarmento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportarmento = bomComportarmento;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " Nota: " + nota;
    }
}
