import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Main {
    
    public static void main(String[] args){
        File file = new File("");
        String path = file.getAbsolutePath().concat("/Exception Handling/Leitura e Processamento de arquivo/Color.txt");
        
        List<String> data = readFileReader(path);
        
        Collections.sort(data);
        data.forEach(System.out::println);
    }
    
    public static List<String> readFileReader(String pathAbs) {
        List<String> data = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathAbs))){
            String line;
            while(Objects.nonNull(line = bufferedReader.readLine())) {
                data.add(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado, verifique se ele existe!");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return data;
    }
}