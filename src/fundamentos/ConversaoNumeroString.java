package fundamentos;

public class ConversaoNumeroString {

    public static void main(String[] args) {
        /*Convertendo valores numericos em String apartir dos Wrappers*/
        Integer num1 = 1000;
        System.out.println(num1.toString().length());

        int num2 = 10000;
        System.out.println(Integer.toString(num2).length());

        Double num3 = 5000.00;
        System.out.println("Double "+ Double.toString(num3).length());

    }
}
