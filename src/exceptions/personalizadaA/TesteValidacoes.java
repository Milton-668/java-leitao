package exceptions.personalizadaA;

import exceptions.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("a", -1);
            Validar.usuario(aluno);
            Validar.usuario(null);
        } catch (StringVaziaException | NumeroForaIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
