package controle;

public class Continue {

    public static void main(String[] args) {
        //O continue pula a condição e
        //parte para a próxima
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
