package oo.heranca.desafioheranca;

public interface Luxo {

    void ligarAr();

    void desligarAr();

    //implementação padrão em interface
    default int velocidadeAr() {
        return 1;
    }
}
