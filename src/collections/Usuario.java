package collections;

import java.util.Objects;

public class Usuario {

    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }

    //O objeto que chamar Usuario passará por esse método
    public String toString() {
        return "Meu nome é " + this.nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return nome.equals(usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
