# Singleton Pattern
A estratégia Singleton é uma forma de garantir que uma classe tenha apenas uma instância criada, e ao mesmo tempo, disponibilizar acesso a esta única instância. Este padrão de projeto tem como objetivo controlar o acesso a um único recurso que será utilizado em vários lugares, como por exemplo: conexão compartilhada ao banco de dados, *logger*, gerenciador de arquivos.

## Implementação
Para implementar uma classe do tipo Singleton, são necessários dois passos:

1. Transformar o construtor da classe em um método privado, para que apenas a própria classe seja capaz de criar uma instância.
2. Disponibilizar um método de acesso público com a responsabilidade de retornar a instância criada.

## Vantagens
- A classe só será instanciada quando for pedida pela primeira vez
- Garantia de que apenas uma instância existe o tempo todo
- Ponto de acesso global a instância criada através do método acessor

## Desvantagens
- Este padrão viola o princípio de responsabilidade única, já que a classe fica responsável não só por disponibilizar um ponto de acesso mas também pela sua própria criação.
- A instância pode a qualquer momento ser alterada por algum cliente e causar problemas em outros clientes que dependam de um estado específico, caso não haja garantia de imutabilidade da classe (por exemplo, métodos que alterem propriedades da única instância).
- Em ambientes multi-thread, como o Java, é necessário tratamento especial para que a classe não possa ser inicializada ao mesmo tempo em threads diferentes, resultando em múltiplas instâncias.
