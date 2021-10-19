package oo.composicao.muitosparaum;

import java.util.ArrayList;

public class Professor extends ArrayList<Professor> {

    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
