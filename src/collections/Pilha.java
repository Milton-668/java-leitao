package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("A sorte segue a coragem");
        livros.push("Cartas de um diabo a seu aprendiz");
        livros.push("O Pequeno Principe");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll()); //retorna null
        System.out.println(livros.pop()); //retorna exceção
        System.out.println(livros.poll()); //retorna exceção
        System.out.println(livros.remove());

        //livros.size();
        //livros.clear();
        //System.out.println(livros.isEmpty());

    }
}
