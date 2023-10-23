# Exceções em Java e Encadeamento de Exceções

Este README fornece uma visão geral das exceções em Java e como você pode lidar com elas, incluindo o encadeamento de exceções.

## Introdução às Exceções em Java

Em Java, exceções são eventos anormais ou erros que ocorrem durante a execução de um programa. As exceções permitem que você lide com erros de maneira mais controlada e forneçam informações detalhadas sobre o que deu errado. As exceções podem ser divididas em duas categorias principais:

1. Exceções Verificadas (Checked Exceptions): Essas são exceções que o compilador Java exige que você trate explicitamente, usando blocos try-catch ou declarando que seu método lança a exceção. Um exemplo comum é a IOException.

2. Exceções Não Verificadas (Unchecked Exceptions): Também conhecidas como exceções de tempo de execução, essas exceções não são verificadas pelo compilador e geralmente resultam de erros lógicos ou problemas de programação, como tentar acessar um elemento de uma lista vazia. Um exemplo é a NullPointerException.

## Lidando com Exceções

Para lidar com exceções em Java, você pode usar blocos try-catch para capturar e tratar exceções. Aqui está um exemplo básico:

```java
public class Exemplo {
    
    try {
        // Código que pode gerar uma exceção
    } catch (TipoDeExcecao e) {
        // Trate a exceção aqui
    }
}
```
No bloco try, você coloca o código que pode lançar uma exceção. No bloco catch, você especifica o tipo de exceção que deseja capturar e define como tratá-la.

## Encadeamento de Exceções
O encadeamento de exceções é a prática de capturar uma exceção, transformá-la em outra e lançá-la novamente.
Isso pode ser útil quando você deseja adicionar informações específicas sobre a causa da exceção ou quando deseja criar exceções personalizadas.

Aqui está um exemplo de encadeamento de exceções:

```java
public class Exemplo {
    
    try {
        // Algum código que pode lançar uma exceção
    } catch (IOException e) {
        throw new ExcecaoPersonalizada("Ocorreu um erro específico: " + e.getMessage());
    }
}
```
Neste exemplo, uma IOException é capturada e, em seguida, uma exceção personalizada chamada ExcecaoPersonalizada é lançada com uma mensagem específica, incluindo informações da exceção original.

## Conclusão
Lidar com exceções é uma parte essencial da programação em Java. Com o uso adequado de blocos try-catch e a capacidade de encadear exceções,
você pode desenvolver aplicativos mais robustos e diagnosticar problemas de maneira mais eficaz. 