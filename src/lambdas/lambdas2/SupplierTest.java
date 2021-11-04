package lambdas.lambdas2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        //Não recebe nenhum parâmetro, porém retorna algo.
        Supplier<List<String>> list =
                //como não há parametro passa-se os () vazios.
                () -> Arrays.asList("Lia", "Bia", "Ana", "Ria");

        System.out.println(list.get());
    }
}
