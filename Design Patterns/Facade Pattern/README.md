FACADE PATTERN

<b>DEFINIÇÃO</b><p>
O Facade é um padrão de projeto estrutural que fornece uma interface simplificada para uma biblioteca, um framework, ou qualquer conjunto complexo de classes.

<b>PROBLEMA</b><p>
Imagine que você precisa fazer seu código funcionar com um amplo conjunto de objetos que pertencem a uma sofisticada biblioteca ou framework.<p>
Normalmente, você precisaria inicializar todos aqueles objetos, rastrear as dependências, executar métodos na ordem correta, e assim por diante.<p>
Como resultado, a lógica de negócio de suas classes vai ficar firmemente acoplada aos detalhes de implementação das classes de terceiros, tornando difícil compreendê-lo e mantê-lo.

<b>BENEFÍCIOS</b><p>
Simplicar a utilização de bibliotecas complexas, expondo ao cliente somente as operações necessárias.

<b>DESVANTAGENS</b><p>
Uma fachada pode fornecer funcionalidades limitadas em comparação com trabalhar com os subsistemas diretamente.

<b>REFERÊNCIAS</b><p>
Este exemplo foi inspirado no artigo da plataforma Medium: How to implement Facade Design Pattern using Java? by Rohan Ravindra Kadam
https://bit.ly/45Ateds

Curso na Udemy: Padrões de Projeto em JAVA na Prática - Cod3r
Site Refactoring Guru: https://refactoring.guru/design-patterns/facade