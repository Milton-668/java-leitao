package oo.heranca.desafioheranca;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setRange(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getRange() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }

    /*Ferrari(int velocidadeMaxima, int range) {
        //Como foi passado um parametro aqui nesse constructor,
        //passaremos o valor direito na main
        super(velocidadeMaxima,range);
        //range
        //range = 15;
    }*/

   /* @Override
    void acelerar() {
      super.acelerar();
    }*/

}
