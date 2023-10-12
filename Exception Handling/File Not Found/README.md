# Exceções relacionadas a arquivos não encontrados

## Introdução

Ao tentar ler um arquivo, é possível que ocorram alguns problemas no fluxo como, por exemplo, o arquivo não estar na pasta esperada, ou o arquivo estar nomeado incorretamente, dentre outras situações. É possível verificar esse tipo de situações e lançar exceção File Not Found Exception, que ajude a entender e resolver o problema. 

## Funcionamento

Executar Main.java

via console:
```console

javac Main.java
java Main

```
Ou

Outras formas são executando com botão direito sobre o arquivo -> Run As java application (maioria das IDEs)

1. O programa foi feito para ler o arquivo exemplo que esta na pasta Arquivos.
2. Caso o arquivo exemplo que esta na pasta Arquivos exista, será exibido o seu conteúdo no console.
3. Caso não seja encontrado, a exceção java.io.FileNotFoundException será lançada.