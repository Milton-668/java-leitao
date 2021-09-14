package fundamentos;

public class ConversaoStringNumerico {

    public static void main(String[] args) {
        String valor1 = "1000.00";
        String valor2 = "1500.00";
        String valor3 = "2500";
        String valor4 = "4500";
        System.out.println(valor1 + valor2);

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        int num3 = Integer.parseInt(valor3);
        int num4 = Integer.parseInt(valor4);

        double soma = num1 + num2;
        System.out.println("Soma conversao: " + soma);

        int somaInt = num3 + num4;
        System.out.println("Soma inteiros: " + somaInt);
    }
}
