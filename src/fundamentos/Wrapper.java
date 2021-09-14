package fundamentos;

public class Wrapper {
    public static void main(String[] args) {
        // O Wrapper é utilizado quando queremos utilizar
        // as os tipos primitivos mas em formas de classes
        // afim de conseguirmos utlizar os métodos das mesmas
        // sendo assim abaixo segue os 8 tipos Wrapper

        Byte b = 100;
        Short s = 1000;

        Integer i = 1000;
        Long l = 10000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toLowerCase());

        Character c = '#';
        System.out.println(c + "...");
    }
}
