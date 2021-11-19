package exceptions.ExceptionTest;

public class ExceptionTest03 {

    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados do arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
            //Sempre será executado
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
