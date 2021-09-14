package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        //métodos do tipo String
        //Indice do caracter
        System.out.println("Hello pessoal".charAt(2));
        String s = "Boa Tarde";

        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.endsWith("Boa"));
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("ma"));


    }
}
