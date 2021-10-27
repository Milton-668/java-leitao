package classesMetodos.exemplosmetodos.test;

import classesMetodos.exemplosmetodos.domain.CalcVarArgs;

public class VarArgsTest {

    public static void main(String... args) {

        CalcVarArgs calc = new CalcVarArgs();
        int[] numeros = {1, 2, 3, 4, 5};
        calc.somaArray(numeros);
        calc.somaVarArgs("VarArgs",10, 20, 30, 40, 50);
    }
}
