package exceptions.ExceptionTest;

import java.io.File;
import java.io.IOException;

public class ExceptionTest11 {
    public static void main(String[] args) throws IOException {
        createNewFile();
    }

    //Nesse exemplo estamos tentando criar um novo arquivo dentro de arquivo
    //mas esse diretório está bloqueado no windows para gravar um novo arquivo
    //sendo assim lança a exception de java.io.IOException
    private static void createNewFile() throws IOException {
        File file = new File("arquivo\\test.txt");
        //Pega
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);

            //Trata
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
