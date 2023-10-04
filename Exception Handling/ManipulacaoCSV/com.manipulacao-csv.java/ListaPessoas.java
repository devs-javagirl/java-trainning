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
        if(!pessoaList.isEmpty()){
            int somaIdades = 0;
            for (Pessoa p : pessoaList){
                somaIdades = somaIdades + p.getIdade();
            }
            return (double) somaIdades / pessoaList.size();
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        String pathArquivoCsv = "Exception Handling/ManipulacaoCSV/com.manipulacao-csv.java/dados.csv";
        List<Pessoa> pessoas = PreencheLista(pathArquivoCsv);
        if(!pessoas.isEmpty()){
            for (Pessoa p: pessoas){
                System.out.println(p);
            }

            double mediaIdade = calcularMediaIdade(pessoas);
            System.out.println("Média de idade das pessoas: "+mediaIdade);
        } else {
            System.out.println("Arquivo está vazio");
        }
    }
}
