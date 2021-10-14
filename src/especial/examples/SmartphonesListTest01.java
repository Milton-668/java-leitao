package especial.examples;

import java.util.ArrayList;
import java.util.List;

public class SmartphonesListTest01 {

    public static void main(String[] args) {

        Smartphones s1 = new Smartphones("1111", "Samsung");
        Smartphones s2 = new Smartphones("2222", "Pixel");
        Smartphones s3 = new Smartphones("3333", "Iphone");

        List<Smartphones> smartphones = new ArrayList<>(3);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        //Autonomia do objeto para ser inserido no index que precisar
        smartphones.add(0, s3);
        for (Smartphones sm : smartphones) {
            System.out.println(sm);
        }

        Smartphones s4 = new Smartphones("3333", "Iphone");
        System.out.println("Contem? " + s4.equals(s3));
        System.out.println("Contem? " + smartphones.contains(s4));

        //busca os indices que contem igualdade
        //Caso não bata as informações o retorno será -1
        int sm4 = smartphones.indexOf(s4);
        System.out.println(sm4);
        System.out.println(smartphones.get(sm4));

    }
}
