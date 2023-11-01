# Leitura e processamento de arquivo

## Introdução
Para leitura e processamento de arquivo em Java se pode utilizar as classes *FileReader* e a *BufferedReader*. 

A classe *FileReader* é um subtipo da classe *Reader* utilizada para leitura de arquivos que contêm texto. Caso algo não ocorra bem, ela lança a exception *FileNotFoundException*.

A classe *BufferedReader* lê o arquivo de forma eficiente. Na construção dessa classe é preciso passar uma classe tipo Reader. A exceção lançada por essa classe é a *IOException*.

O *try with resources* é uma forma de capturar exceções garantindo que os recursos utilizados por algumas classes, como as classes FileReader e BufferedReader, sejam liberados após a execução do programa ou falha. 

## Funcionamento do programa
1. Dado que exista o arquivo Color.tx no diretório raiz do projeto
2. Ao executar a classe main, o caminho do arquivo existente é montado
3. Com esse caminho é feito a leitura do conteúdo do arquivo com o auxilio das classes FileReader e BufferedReader dentro de um try with resources
4. Caso não seja lançadas nenhuma exceção do tipo IOException
5. O conteúdo do arquivo é populado em uma Lista
6. A Lista é ordernada por ordem alfabética e exibida no console.

## Links auxiliares

* [Class BufferedReader](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/BufferedReader.html)
* [Class FileReader](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileReader.html)
* [How to Read a File in Java](https://www.baeldung.com/reading-file-in-java)
* [Class IOException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/IOException.html)
* [The try-with-resources Statement](https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html)