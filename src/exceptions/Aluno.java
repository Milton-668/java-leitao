package exceptions;

public class Aluno {

    public final String nome;
    public final double nota;
    public final boolean bomComportarmento;

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
