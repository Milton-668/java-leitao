
package exceptions;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("FIM :)");
    }

    //Não checada ou não verificada
    static void geraErro1() {
        //Nesse caso está sendo lançada uma exception a partir
        //da palavra reservada throw lançando RuntimeException
        throw new RuntimeException("Ocorreu um erro #1");
    }

    //Checada e verificada -> nesse caso preciso expor na assinatura
    //o lançamento da exceção com a palavra reservada throws e o tipo
    //da exception
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro #2");
    }
   /* static void geraErro2() throws Exception{
        try {
            throw  new Exception("Ocorreu um erro #2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
