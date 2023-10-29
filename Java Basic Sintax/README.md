# Sintaxe Básica de Java

### Introdução

Além de ser uma linguagem orientada a objetos, Java tem uma sintaxe básica muito importante. É estruturada em pacotes, com classes contendo métodos. A assinatura de uma classe inclui sua visibilidade e nome, enquanto a de um método inclui seu retorno, nome e parâmetros e seus arquivos tem uma regra clara. Variáveis são declaradas com tipos específicos e nomes, seguindo convenções de nomenclatura, como CamelCase para classes e minúsculas para variáveis. 
A sintaxe básica é de extrema importância para compreensão da linguagem.

# Estrutura de Arquivo Java

Um arquivo Java segue uma estrutura padrão que inclui várias partes essenciais. Confira abaixo cada uma delas:

## 1. Declaração de Pacotes (Package Declaration)

Pacotes são empregados para agrupar classes afins. Essa abordagem nos permite prevenir conflitos de nomes entre classes, simplificar a manutenção e atualização do código. Além disso, pacotes tornam a localização e identificação de classes, interfaces e enumerações mais acessíveis.

Exemplo de declaração de pacote:
```java
package com.example.minhapasta;
```

## 2. Declaração de Importações (Import Statements)

As declarações de importações permitem que você use classes de outros pacotes sem a necessidade de especificar o caminho completo toda vez.

Exemplo de declaração de importações:
```java
import java.util.ArrayList;
import java.io.File;
```

IMPORTANTE: O termo "import" é uma palavra reservada e não pode ser utilizada para nomear variável.

## 3. Declaração de Classe (Class Declaration)

Uma classe é um modelo usado para definir vários objetos com características semelhantes. Os elementos básicos de uma classe são divididos em duas categorias:
 
Exemplo de declaração de classe:
```java
public class MinhaClasse {
    // Conteúdo da classe aqui
}
```

## 4. Tipos permitidos no arquivo

Um arquivo Java pode conter os seguintes tipos:

- **Classes**: Definem objetos e seu comportamento.
- **Interfaces**: Define um contrato que as classes devem seguir.
- **Enums**: Enumerações definem um conjunto de valores constantes.

### Exemplo de Arquivo Java

Aqui está um exemplo de arquivo Java que ilustra os conceitos acima:

```java
package com.example.minhapasta;

import java.util.ArrayList;
import java.io.File;

// Classe principal
public class MinhaClasse {
    
    // Atributos
    private String nome;
    private int idade;
    
    // Construtor
    public MinhaClasse(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Método da classe
    public void saudacao() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
    
    // Enumeração
    enum DiaDaSemana {
        SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO
    }
    
    // Interface
    interface Saudacao {
        void cumprimentar();
    }
}
```

#Variáveis

As variáveis server para nomear\armazenar dados e elas são compostas por:

- Tipo
- Nome
- Valor

Por exemplo:
```java
int pontos = 80;
int jogadas = 3
```

### Tipo

Existem dois tipos:

- Primitivos
Os tipos primitivos são boolea (ex: true\false), byte (ex: 100), char (ex: 'A'), short (ex:-20), int (ex: 98), long(8765456878L), float (ex: 19.99f) e double (ex: 2.1827182763752). 

- Referência
Os tipos por referência, são classes que especificam os tipos de objeto Strings (ex: "Olá!"), Arrays (ex: [1, 2, "a", "u"]) e Objetos(ex: {"fruta": "uva"}).


### Nomemclatura de variáveis

Existe uma convenção de nomenclatura, que são recomendações para nomear variáveis. O objetivo disso existir é para fazer com que os códigos sigam uma padrão onde qualquer desenvolvedor consiga ler o cõdigo, ou seja, é uma boa prática.

Confira abaixo algumas delas:

- Camel case
Camel case deve começar com a primeira letra minúscula e a primeira letra de cada nova palavra subsequente maiúscula

```java
coisasParaFazer = ...

idadeDoAmigo = ...

valorFinal = ...
```

- Pascal case
Também conhecido como “upper camel case” ou “capital case”, pascal case combina palavras colocando todas com a primeira letra maiúscula

```java
CoisasParaFazer = ...

IdadeDoAmigo = ...

ValorFinal = ...
```

- Snake case
Em snake case, conhecido também como “underscore case”, utilizamos underline no lugar do espaço para separar as palavras. Quando o snake case está em caixa alta, ele é chamado de “screaming snake case”

```java
coisas_para_fazer = ...

idade_do_amigo = ...

valor_final = ...

PRIMEIRO_NOME = ...

LISTA_INICIAL = ...
```

IMPORTANTE: O Java possui o [Java Secure Coding Guidelines](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html), uma documentação disponibilizada pela Oracle, baseada nos padrões de codificação apresentados no Java Language Specification. É importante ressaltar que essas convenções de código Java foram escritas em 1999 e não foram atualizadas desde então, portanto algumas informações contidas no documento podem não estar atualizadas. As convenções mais comuns são:

camelCase para variáveis, atributos e métodos;
PascalCase para classes, enum e interfaces;
SCREAMING_SNAKE_CASE para constantes.

Fontes:
[Boson Treinamentos em Ciência e Tecnologia](http://www.bosontreinamentos.com.br/java/curso-de-java-o-que-sao-packages-pacotes/#:~:text=Os%20pacotes%20s%C3%A3o%20usados%20para,de%20classes%2C%20interfaces%20e%20enumera%C3%A7%C3%B5es.)

[DevMedia](https://www.devmedia.com.br/tipos-de-dados-por-valor-e-por-referencia-em-java/25293#:~:text=As%20vari%C3%A1veis%20de%20inst%C3%A2ncia%20de,boolean%20s%C3%A3o%20inicializadas%20como%20false.)

[ALURA](https://www.alura.com.br/artigos/convencoes-nomenclatura-camel-pascal-kebab-snake-case#camel-case)