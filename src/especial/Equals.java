package especial;

import java.util.Date;

public class Equals {

    public static void main(String[] args) {

        User u1 = new User();
        User u2 = new User();
        u1.name = "João Carlos Bezerra";
        u1.email = "joao_carlos@yahoo.com";
        u2.name = "João Carlos Bezerra";
        u2.email = "joao_carlos@yahoo.com";

        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(new Date()));

    }
}
