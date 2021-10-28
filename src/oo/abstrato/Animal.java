package oo.abstrato;

public abstract class Animal {

    public String respirar() {
        return "CO2";
    }
    //Cada animal se move de uma forma, sendo assim
    //o metodo fica como abstrato
    public abstract String mover();
}
