package especial.examples;

public class EqualsTest1 {

    public static void main(String[] args) {
        Smartphones s1 = new Smartphones("UAPOC", "Samsung");
        Smartphones s2 = new Smartphones("UAPOC", "Samsung");
        System.out.println(s1.equals(s2));
    }
}
