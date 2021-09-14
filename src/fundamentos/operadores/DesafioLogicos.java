package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        boolean terca = true;
        boolean quinta = false;

        System.out.println("A pessoa conseguiu os dois jobs?");
        System.out.println(terca && quinta);
        System.out.println("Então tem tV de 50' ?");
        System.out.println(terca && quinta);

        System.out.println("Vai comprar a TV de 32' ?");
        System.out.println(terca ^ quinta);

        System.out.println("Terá sorverte?");
        System.out.println(terca ^ quinta);

        System.out.println("Vai ficar em casa hoje?");
        System.out.println(terca && !quinta);

    }
}
