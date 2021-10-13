package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        //add e add -> adicionam elementos na fila
        //Diferença é o comportamento quando a fila está cheia!
        fila.add("Paulo"); // retorna falso
        fila.offer("Marcos"); // lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Raphael");


        //peek e element -> acessam os próximos
        // elementos da fila (sem remover)
        //Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.peek());// return null
        System.out.println(fila.element());// retorna exception

        System.out.println("-----------------------------");
        //poll e remove -> Obtêem o próximo elemento da fila e remove
        //Diferença é o comportamento que ocorre
        //quando a fila está vazia
        System.out.println(fila.poll());   // retorna false
        System.out.println(fila.remove()); //Lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        //Quando todos os outros elementos já foram acessados
        //O remove lança uma exceção
        System.out.println(fila.remove());

        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        //fila.contains(...);


    }
}
