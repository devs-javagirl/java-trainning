# Exceções customizadas

## Introdução

Ao utilizarmos a linguagem Java, podemos criar exceções personalizadas que são criadas a partir da classe Exception. Dessa forma, quando um comportamento determinado ocorrer, podemos lançar uma exceção que possua um nome que facilite o entendimento da causa e, consequentemente, a identificação e correção. Isso ajuda muito pois permite criar exceções que são próprias do projeto, e com regras de negócio inerentes a ele.

## Funcionamento do Programa

1. Ao executar a classe Main
2. Será feito a verificação se a idade da pessoa esta entre 0 e 150 anos.
3. Em caso de não estar em acordo, a exceção IdadeInvalidaException será lançada.