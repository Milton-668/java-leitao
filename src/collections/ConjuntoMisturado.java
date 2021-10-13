package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoMisturado {
    //Responsável por ignorar os warnings, mencionados.
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add("Teste"); // Ele converte automaticamente para o tipo que é
        conjunto.add(1.2);      // double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('X');

        System.out.println("Tamanho do conjunto: " + conjunto.size());

        conjunto.add("teste"); //Case sensitive
        conjunto.add('X'); //Case sensitive
        System.out.println("Tamanho do conjunto: " + conjunto.size());

        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove('X'));

        System.out.println("Contêm o dado valor? " + conjunto.contains('X'));
        System.out.println("Contêm o dado valor? " + conjunto.contains(true));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //Faz a união do que há em conjunto com nums (não mostra repetidas)
        // conjunto.addAll(nums)

        //Pega a intersecção apenas, (ou seja o que é comum entre os dois conjuntos)
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
