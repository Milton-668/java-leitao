package fundamentos;

import java.util.Locale;

public class NotacaoPonto {

    public static void main(String[] args) {
        //Utilizando a notação ponto em java

        String s = "Hello World X";
        s = s.replace("X","Sir");
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);

        s = s.toLowerCase();
        System.out.println(s);

        //O ponto acessa os métodos que temos dentro de uma classe
        //Por exemplo a String é uma classe que e apartir dela temos
        //temos métodos já definidos
        String y = "Java eh show"
                .replace("show","top")
                .toUpperCase()
                .concat(" j!!!");
        System.out.println(y);

    }
}
