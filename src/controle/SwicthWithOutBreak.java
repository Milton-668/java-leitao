package controle;

public class SwicthWithOutBreak {

    public static void main(String[] args) {
        //Utilizado para casos com várias opções
        //O Switch sem o break segue para o caso
        //de hierarquias onde arrastará as opções
        //seguintes

        String faixa = "roxa";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Nenhuma das opções");
        }
        System.out.println("Fim!\n\n");

        int idade = 3;

        switch (idade) {
            case 3:
                System.out.println("Sabe Falar");
            case 2:
                System.out.println("Sabe Andar");
            case 1:
                System.out.println("Sabe respirar");

        }
    }
}
