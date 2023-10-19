import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ListaPessoas {

    public static List<Pessoa> PreencheLista(String arquivoCSV) {
        List<Pessoa> pessoasList = null;
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            pessoasList = new ArrayList<>();
            String linha;
            boolean primeiraLinha = true;
            while ((linha = br.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue; // Ignora o cabeçalho
                }
                String[] campos = linha.split(",");
                if (campos.length == 3) {
                    String nome = campos[0].trim();
                    int idade = Integer.parseInt(campos[1].trim());
                    String email = campos[2].trim();
                    Pessoa pessoa = new Pessoa(nome, idade, email);
                    pessoasList.add(pessoa);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return pessoasList;
    }

    public static double calcularMediaIdade(List<Pessoa> pessoaList){
return pessoas.stream()
                .mapToDouble(Pessoa::getIdade)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        String pathArquivoCsv = "Exception Handling/ManipulacaoCSV/com.manipulacao-csv.java/dados.csv";
        List<Pessoa> pessoas = PreencheLista(pathArquivoCsv);
        if(!pessoas.isEmpty()) {
            pessoas.forEach(System.out::println);
            System.out.println("Média de idade das pessoas: "+ calcularMediaIdade(pessoas));
        } else {
            System.out.println("Arquivo está vazio");
        }
    }
}
