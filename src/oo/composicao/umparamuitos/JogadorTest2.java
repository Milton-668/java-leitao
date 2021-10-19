package oo.composicao.umparamuitos;

public class JogadorTest2 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("KAKA");
        Time time1 = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        time1.setJogadores(jogadores);

        System.out.println("---Jogador---");

        jogador1.imprime();
        jogador2.imprime();

        System.out.println("---Time---");

        time1.imprime();
    }
}
