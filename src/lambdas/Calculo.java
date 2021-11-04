package lambdas;

//Anotação que força a utilização
//de apenas um método
@FunctionalInterface
public interface Calculo {

    double executar(double x, double y );

    default String legal(){
        return "bacana";
    }
    //um método estático direto na interface
    //tem seu uso apenas na interface
    static String muchoLegal(){
        return "Bem bacana";
    }
}
