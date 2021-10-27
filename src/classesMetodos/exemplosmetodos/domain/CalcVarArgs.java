package classesMetodos.exemplosmetodos.domain;

public class CalcVarArgs {

    public void somaArray(int[] numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    //O VarArgs é a mesma coisa do array, só muda a sintaxe
    //no caso do método abaixo nós passamos o tipo 3pontos e o atributo
    //quando formos passar os valores basta coloca-los separando eles por
    //vírgula, nesse caso teremos uma lista dos dados do atributo
    // um outro ponto é que junto ao varArgs pode ter mais parametros, mas
    //ele sempre precisa ser o ultimo
    public void somaVarArgs(String valor,int... numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }
        System.out.println(valor);
        System.out.println(soma);
    }
}
