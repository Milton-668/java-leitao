package fundamentos;

public class ConversaoTiposPrimitivosNumerico {

    public static void main(String[] args) {
        //Temos duas formas para fazer esses tipos
        //de conversões a implicita e a explicita

        //implicita -> nesse caso temos o tipo double passando um n° inteiro
        double a = 1;
        System.out.println(a);

        //explicita -> nessa caso temos a explicita
        //passando o float antes do valor, pois como
        //nesse caso o tipo é float ele pegaria como
        //o literal a qual iria passar como double
        float b = (float) 1.12345678888;
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; //explicita (CAST)
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; //explicita (CAST)
        System.out.println(f);

    }
}
