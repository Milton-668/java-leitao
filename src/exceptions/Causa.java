package exceptions;

public class Causa {
    /**
     * Existem alguns casos que uma exceção pode ser gerada por outra.
     * Como por exemplo se estamos tentando cadastrar um aluno no banco
     * de dados e por algum motivo a comunição do banco de dados está
     * interrompida por algum problema, então a causa pode ser uma
     * NetworkException, que causará uma Exception no post do banco de
     * dados. Abaixo tem um exemplo onde o métodoB está causando por acaso
     * uma exceção que trará impacto no métodoA.
     */

    public static void main(String[] args) {

        /**
         * 3°Aqui há a execução do métodos, onde que o try captura o metodoA
         * e como o aluno está chegando como mulo lança-se IllegalArgumentException
         * caso a mensangem que é capturada no catch seja diferente de nulo, será
         * impresso na tela a mensagem de erro que vem do argumento de contido no
         * catch do métodoA e sua respectiva mensagem.
         * */
        try {
            metodoA(null);
        } catch (IllegalArgumentException e) {
            if (e.getMessage() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }
        metodoA(null);

    }
    /**
     * 2° Nesse outro caso o metodo está capturando o que vem do metodoB
     * para tratar no catch laçando um IllegalArgumentException
     * */
    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (Exception cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    /**
     * 1° Nesse caso há uma condicional onde que caso o aluno seja
     * null ele lança uma NullPointerException, caso contrário
     * ele trará o nome do aluno*/
    static void metodoB(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("Aluno está NULOO");
        }
        System.out.println(aluno.nome);
    }
}
