package classesMetodos.recodingDesafio;

public class Dinner {

    public static void main(String[] args) {

        Food f1 = new Food("Hamburguer", 0.300);
        Food f2 = new Food("French Fries", 0.200);

        People p1 = new People("Jhon", 105.00);

        System.out.println(p1.show());
        p1.comida(f1);
        System.out.println(p1.showAfter());


    }
}
