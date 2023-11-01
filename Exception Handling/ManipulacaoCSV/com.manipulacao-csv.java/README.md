# Programa para Leitura e Cálculo da Média de Idade a partir de um arquivo CSV

Este é um programa Java que tem como objetivo ler dados de um arquivo CSV chamado "dados.csv", onde cada linha do arquivo representa informações de uma pessoa, contendo os campos: Nome, Idade e Email. O programa realiza as seguintes tarefas:

1. **Ler o arquivo "dados.csv"**: O programa abre o arquivo "dados.csv" e lê suas linhas.

2. **Separar os campos**: Para cada linha do arquivo, o programa separa os campos Nome, Idade e Email.

3. **Armazenar os registros**: Os registros lidos são armazenados em uma estrutura de dados apropriada, neste caso, uma lista de objetos da classe "Pessoa".

4. **Calcular e imprimir a média de idade**: O programa calcula a média de idade das pessoas listadas e imprime o resultado no console.

## Arquivos Necessários

Para executar o programa, você precisa dos seguintes arquivos:

- `ListaPessoas.java`: O código Java que realiza a leitura do arquivo CSV, cálculo da média de idade e trata exceções.
- `Pessoa.java`: A classe que define a estrutura de dados de uma pessoa.
- `dados.csv`: O arquivo CSV contendo os dados das pessoas.

## Uso

Certifique-se de que os arquivos `ListaPessoas.java`, `Pessoa.java` e `dados.csv` estão no mesmo diretório. Para executar o programa, siga os seguintes passos:

1. Compile o código Java:

   ```shell
   javac ListaPessoas.java
   ```

2. Execute o programa:

   ```shell
   java ListaPessoas
   ```

O programa lerá o arquivo "dados.csv", calculará a média de idade das pessoas listadas e imprimirá os resultados no console.

Certifique-se de que os dados no arquivo "dados.csv" estão no formato correto, com cada linha contendo Nome, Idade e Email, separados por vírgulas.

O programa trata exceções relacionadas à leitura do arquivo e à conversão de dados. Se ocorrerem problemas ao ler o arquivo, você verá uma mensagem de erro no console, informando sobre o erro.

Se o arquivo "dados.csv" estiver em um diretório diferente, ajuste o caminho no código-fonte em `String pathArquivoCsv` para refletir o local correto do arquivo.

Lembre-se de que este programa ignora a primeira linha do arquivo CSV, que é considerada o cabeçalho.
