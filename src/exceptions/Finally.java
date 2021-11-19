package exceptions;

public class Finally {

    public static void main(String[] args) {

        try {
            int num = 2;
            System.out.println(7.5 / num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //Não importa o que tenha acontecido acima,
            //sempre irá executar o finally
        } finally {
            System.out.println("FINAL DO PROGRAMA");
        }

        try {
            int num = 4;
            System.out.println(10 / num);
        } finally {
            System.out.println("FINAL DO PROGRAMA");
        }
    }
}
