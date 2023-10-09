# Proxy Pattern

O Proxy é um padrão de projeto estrutural que permite que você forneça um substituto ou um espaço reservado para outro objeto. 
Um proxy controla o acesso ao objeto original, permitindo que você faça algo ou antes ou depois do pedido chegar 
ao objeto original.

## Quando usar o padrão de design de proxy?

1. Fornecer um substituto ou espaço reservado para outro objeto para controlar o acesso a ele.
2. Para dar suporte ao acesso distribuído, regulamentado ou inteligente, adicione outra indireção.
3. Para evitar que o componente real se torne excessivamente complexo, adicione um wrapper e uma delegação.

## Vantagens

- A segurança é um benefício do padrão de proxy.
- Esse design evita a duplicação de itens potencialmente muito grandes e que consomem muita memória. Isso melhora o desempenho do aplicativo.

## Desvantagens

- Esse padrão adiciona outra camada de abstração, que ocasionalmente pode causar problemas se alguns clientes acessarem o código do assunto Real diretamente, enquanto outros acessarem as classes Proxy. Isso pode causar comportamento inconsistente.

# Referências
- [refactoring.guru](https://refactoring.guru/design-patterns/proxy)
- [java.dev.journal](https://www.javadevjournal.com/java-design-patterns/proxy-design-pattern/)