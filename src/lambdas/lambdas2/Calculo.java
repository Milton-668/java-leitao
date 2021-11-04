package lambdas.lambdas2;

@FunctionalInterface
public interface Calculo {

    //método abstrato(implicitamente)
    double executar(double a, double b);
    //método padrão
    default String bacana(){
        return "Bacana";
    }

    static String legal(){
        return "legal";
    }
}
