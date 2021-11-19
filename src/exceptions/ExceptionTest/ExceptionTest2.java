package exceptions.ExceptionTest;

public class ExceptionTest2 {

    public static void main(String[] args) {
        divisao(1, 0);
    }

    private static int divisao(int a, int b) throws IllegalArgumentException {

        if (b == 0) {
            //Nesse caso está sendo lançado uma exceção diretamente
            //caso a validação seja true, estou passando a RuntimeExpetion
            //mais abrangente, mas posso lançar uma exceção mais específica
            //que se encaixa nesse caso
           // throw new RuntimeException("Argumento ilegal, não pode ser zero");
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
        }
        return a / b;
       /* try {
            return a / b;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return 0;*/
    }
}
