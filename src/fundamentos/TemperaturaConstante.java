package fundamentos;

public class TemperaturaConstante {

    public static void main(String[] args) {

        //Constante em java colocamos a palavra final antes da
        //declaração da variável que deverá estar em maiuscula
        final int AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;
        final double FATOR2 = 9.0 / 5.0;
        double value = 86;
        double celsius;
        double fahrenheit;

        celsius = (value - AJUSTE) * FATOR;
        fahrenheit = (value * FATOR2) + AJUSTE;

        System.out.println("O resultado da conversao eh:" + celsius + "°C");
        System.out.println("O resultado da conversao eh:" + fahrenheit + "°F");

    }

}
