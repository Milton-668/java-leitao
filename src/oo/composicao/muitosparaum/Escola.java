package oo.composicao.muitosparaum;

public class Escola {

    private String nome;
    private Professor[] professores;

    public void imprime() {
        System.out.println("Escola: " + this.nome);
        if (professores == null) return;
        for (Professor professor : professores) {
            System.out.println("Professor: " + professor.getNome());
        }

    }

    //Sobrecarga do construtor para não só passar o nome, mas tbm o professor
    //diretamente na instanciação do objeto na classe de teste
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
