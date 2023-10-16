ABSTRACT FACTORY

Definição:
Prover uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
Responsável por criar um conjunto de objetos dentro do mesmo contexto.

Projeto:
O exemplo refere-se a um certificado (Certificate) e empacotamento (Packing), que serão aplicados em um aparelho celular.
Este celular pode ser produzido no Brazil ou Estados Unidos, devendo seguir as regras do respectivo país (CountryRulesAbstractFactory).
Para testar o pattern, foi desenvolvida a classe AbstractFactoryTest.

Informações adicionais:
Este exemplo faz parte do curso Padrões de Projeto em JAVA na Prática - Udemy - Cod3r
Fonte adicional para estudo de patterns:
https://refactoring.guru/design-patterns/abstract-factory