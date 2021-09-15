package fundamentos.operadores;

public class Ternario {

    public static void main(String[] args) {

        double media = 5.5;
        //Estrutura do operador ternario
        /*condição ? condição1 : condição2*/
        String resultadoParcial = media >= 7.0 ? "Aprovado" : "Reprovado";

        System.out.println("O aluno está: " + resultadoParcial);

        String premio = resultadoParcial == "Aprovado"? "Tem desconto": "Sem desconto";

        System.out.println(premio);
    }
}
