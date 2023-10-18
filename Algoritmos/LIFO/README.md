# LIFO - Last In, First Out

## Conceito

O LIFO é uma política de processamento aplicada em estrutura de dados, que basicamente consiste na seguinte regra: o último a entrar é o primeiro a sair! Ou seja, quem chegou por último é o primeiro a ser processado/atendido.

A estrutura de dados que aplica esta política é a Pilha (*Stack*).

As operações comuns em pilhas são:

* **Empilhar - *push***: inseri item na pilha. O item é inserido após o último item da pilha, logo o item adicionado passa a ser o último;
* **Desempilhar - *pop***: remove item da pilha. O item removido é o último adicionado;
* **Vazia - *empty***: verifica se a pilha está vazia.

## Código em Java

Em Java, a classe *Stack* implementa a política LIFO. Ela pertence ao pacote *java.util*.

Segue abaixo um exemplo de código de uso da classe Stack e alguns dos métodos disponíveis nela:


    public void Lifo{

        // Instancia a classe Stack
        Stack<String> tube = new Stack<>();

        // Verifica se a pilha está vazia
        tube.empty();

        // Empilha item na pilha
        tube.push("Vermelha");
        tube.push("Amarela");
        tube.push("Azul");
        tube.push("Verde");
        
        // Conta o número de itens na pilha
        tube.size();
        
        // Desempilha item na pilha 
        System.out.println(tube.pop());  // Retorna: Verde

        // Informa quem está no topo da pilha
        System.out.println(tube.peek()); // Retorna: Azul

        // Informa a posição que o item está na pilha
        System.out.println(tube.search("Azul")); // Retorna: 1
    }

## Aplicações

Transportando para o mundo real, a LIFO pode ser empregado na seguinte situação:

1. Imagine que você tenha um copo em formato de tubo e algumas bolinhas do tamanho do copo.

2. Então você vai inserindo uma bolinha por vez dentro do copo, ou seja, empilhando as bolinhas.

3. Para esvaziar o copo, o que faremos? Acredito que a única maneira seja você primeiro remover a última bolinha e assim sucessivamente. É isso, você acabou que aplicar a LIFO!

<figure style="display:flex; flex-direction:column; justify-content:center; ">
    <img height="500px" src="https://cdn.codegym.cc/images/article/f8e725f0-50c1-4854-a2f0-85a4b17cacbc/original.gif"
         alt="stack">
    <figcaption>
    <i>
    (Fonte: <a href="https://codegym.cc/groups/posts/java-stack">Java Stack - CodeGym</a>)
    </i>
    </figcaption>
</figure>

## Links de conteúdos auxiliares

* [Documentação](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)
* [Java Stack](https://www.baeldung.com/java-stack)