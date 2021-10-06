package ClassesMetodos;

public class AreaCirc {

    double raio;
    //Define um atributo constante e estatico
    final static double PI = 3.1415;

    //construtor manipulado

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }

    public double are(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
