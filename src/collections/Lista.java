package collections;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Paulo");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        //Acessa pelo índice
        System.out.println("Index: " + lista.get(3).nome);

        //Remove pelo index e retorna String
        System.out.println(">>>" + lista.remove(1));
        //Remove pelo objeto e retorna boolean
        System.out.println("Removeu? " + lista.remove(new Usuario("Manu")));
        //Busca o valor pelo objeto
        System.out.println("Contêm? "+ lista.contains(new Usuario("Lia")));
        //Busca pela várival do objeto
        System.out.println("Contêm? "+ lista.contains(u1));

        for (Usuario user : lista) {
            System.out.println(user);
        }
    }
}
