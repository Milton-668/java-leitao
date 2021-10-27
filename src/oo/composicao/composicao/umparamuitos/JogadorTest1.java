package oo.composicao.composicao.umparamuitos;

public class JogadorTest1 {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Ronaldo");
        Time time = new Time("Corinthians");

        //Relaciona o objeto jogador com o objeto time
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
