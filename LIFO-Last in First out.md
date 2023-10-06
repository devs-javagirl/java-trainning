# LIFO - Last In, First Out

## Conceito

O LIFO é uma política de processamento aplicada em estrutura de dados, que basicamente consiste na seguinte regra: o último a entrar é o primeiro a sair! Ou seja, quem chegou por último é o primeiro a ser processado/atendido.

A estrutura de dados que aplica esta política é a Pilha (*Stack*).

As operações comuns em pilhas são:

* **Empilhar - *push***: inseri item na pilha. O item é inserido após o último item da pilha, logo o item adicionado passa a ser o último;
* **Desempilhar - *pop***: remove item da pilha. O item removido é o último adicionado;
* **Vazia - *empty***: verifica se a pilha está vazia.;

## Código em Java

Em Java, a classe *Stack* implementa a política LIFO. Ela pertence ao pacote *java.util*.

Segue abaixo um exemplo de código de uso da classe Stack e alguns dos métodos disponíveis nela:

<code> 
    public void Lifo {

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
</code>