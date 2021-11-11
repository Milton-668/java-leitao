package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        int total1 = nums.stream()
                //O reduce é uma função terminadora, semelhante ao forEach
                .reduce(soma)
                //Quando o elemento do reduce for inteiro necessita do get
                .get();
        System.out.println(total1);

        //Nesse caso que utilizei o parallelStream o reduce fará a operação paralelamente junto com os acums e n
        Integer total2 = nums.parallelStream().reduce(100, soma);
        System.out.println(total2);

        Integer total3 = nums.stream().reduce(100, soma);
        System.out.println(total3);

        nums.stream().filter(n -> n > 5)
                .reduce(soma)
                //Optional<Integer>...
                .ifPresent(System.out::println);
    }
}
