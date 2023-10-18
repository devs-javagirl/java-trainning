import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        try {

            FileInputStream fileInputStream = new FileInputStream("./Arquivos/arquivo.txt");
            
            int conteudo;

            while ((conteudo = fileInputStream.read()) != -1) {
                System.out.print((char) conteudo);
            }
           
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
