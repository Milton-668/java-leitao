package exceptions.error;

public class StackOverFlowTest {
    /*Exception in thread "main" java.lang.StackOverflowError
     * Exceção lançada devido a classe ser chamada infinitivamente
     * estouro da memória*/
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
