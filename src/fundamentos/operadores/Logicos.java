package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean c1 = true;
        boolean c2 = 3 > 7;

        System.out.println(c1 && !c2);
        System.out.println(c1 || c2);
        System.out.println(c1 ^ c2);
        System.out.println(!!c1);
        System.out.println(!c2);

        //AND
        System.out.println("\nAND");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //OR
        System.out.println("\nOR");
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

        //XOR
        System.out.println("\nXOR");
        System.out.println(true ^ true);
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);

        //NOT
        System.out.println("\nNOT");
        System.out.println(!true);
        System.out.println(!false);
    }
}
