package oo.heranca.desafioheranca;

public class Ferrari extends Carro {

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        range = 15;
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
