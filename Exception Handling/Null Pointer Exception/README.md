# Lidando com Exceções de Ponteiro Nulo (NullPointerException)

## Introdução
Null Pointer Exceptions (Exceções de Ponteiro Nulo) ocorrem quando se tenta acessar ou operar em um objeto que não foi
inicializado, ou seja, tem um valor nulo. 
Essas exceções ocorrem porque o programa tenta utilizar uma referência que aponta para nenhum local na memória. 
Esta documentação explora cenários comuns em que NullPointerExceptions ocorrem e como você pode lidar com elas de forma eficaz.

## Cenários

Para ilustrar os cenários em que as NullPointerExceptions podem ocorrer, criamos uma classe chamada "Produto" com um único atributo: "descrição".
O objetivo é tentar acessar a descrição desse produto, considerando situações em que o atributo não foi preenchido.

```java
public class Produto {
    private String descricao;
}
```

### Acessando a descrição de um objeto nulo

No primeiro cenário, o objeto "Produto" não é instanciado, e em vez disso, é definido como nulo.

```java
public static void mostrarDescricaoObjetoNulo(){
    System.out.println("Produto Nulo:");
    Produto produto = null;
}
```

Como a variável "produto" é do tipo "Produto," ela tem acesso aos métodos da classe "Produto," incluindo "getDescricao." 
Ao tentar obter a descrição do produto, uma exceção NullPointerException é lançada, pois estamos tentando acessar um valor que não está armazenado na memória.

### Acessando um objeto instanciado sem inicializar seu atributo

No segundo cenário, um objeto "Produto" é instanciado, mas seu atributo "descricao" não é inicializado explicitamente.

```java
public static void mostrarDescricaoNula(){
    System.out.println("Produto Sem Descrição:");
    Produto produto = new Produto();
}
```

Quando um objeto é criado, os atributos da classe são inicializados com valores padrão, que, no caso de uma String, 
é "null". Portanto, ao tentar acessar a descrição usando "getDescricao," uma NullPointerException não é lançada, 
pois a descrição tem um valor padrão de "null".

Para que a exceção fosse lançada, o getter da classe Produto foi modificado.

```java
public String getDescricao(){
        if(descricao==null){
        throw new NullPointerException("Descrição não preenchida.");
        }
        return descricao;
        }
```

O método primeiro verifica se "descricao" é nula. Se for, o método lança uma exceção dizendo que a descrição do
produto não foi preenchida. Caso não seja nula, retornará a descrição.

### Acessando um objeto instanciado e atributo inicializado

No terceiro cenário, um objeto "Produto" é instanciado, e o atributo "descricao" é preenchido com um valor.

```java
public static void mostrarDescricaoPreenchida(){
    System.out.println("Produto com Descrição:");
    Produto produto = new Produto("Livro 'A Vida de Ada Lovelace'");
}
```

Ao usar "getDescricao" para obter a descrição do produto, o valor da descrição é retornado, pois agora o atributo "descricao" foi inicializado.

## Remediação

Quando uma exceção é lançada, o programa é interrompido no momento em que a exceção ocorre, a menos que haja tratamento adequado. Para lidar com exceções, você pode usar a estrutura "try/catch" ("tente" e "capture").

```java
public static void main(String[] args){
    try {
        mostrarDescricaoPreenchida();
        mostrarDescricaoNula();
        mostrarDescricaoObjetoNulo();
    } catch (NullPointerException e) {
        System.err.println(e.getMessage());
    }
}
```

No método "main", chamamos os três cenários mencionados anteriormente. Tudo o que queremos que o programa tente 
fazer é colocado dentro do bloco "try". Se ocorrer alguma exceção, o programa entrará no bloco "catch" para tratá-la.
Isso nos permite continuar a execução do programa, mesmo após uma exceção.

O resultado no terminal será:

```bash
Produto com Descrição:
Livro 'A Vida de Ada Lovelace'
Produto Sem Descrição:
Descrição não preenchida.
```

Com tratamento apropriado das exceções, o programa pode continuar a execução sem ser interrompido por exceções de ponteiro nulo.