package controle;

public class Break {

    public static void main(String[] args) {
        //A onde está o comando break
        //Ele interrompe o código
        //Ele é bastante
        //utilizando em laços
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Fim!!!");
    }
}
