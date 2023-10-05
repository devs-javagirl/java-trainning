# Builder Pattern
O padrão **Builder**, que é um dos _23 padrões de design do
Gang of Four (GoF)_, é um padrão de criação 
que permite construir objetos complexos passo a passo.
Além de encapsular a construção, é capaz de produzir diferentes
tipos e representações de um item utilizando o mesmo código.

## Motivação
O padrão Builder foi introduzido para resolver alguns 
dos problemas de outros padrões de design semelhantes, como
o **Factory** e **Abstract Factory**. 

Imagine uma classe que possua muitos atributos, sendo eles, 
variados entre opcionais e obrigatórios. No momento de criação
de uma instância, os valores para os atributos obrigatórios sempre
precisarão existir. Entretanto, a variação desses objetos com os campos
opcionais pode ser enorme.

Para solucionar e adequar os construtores aos casos conforme
a necessidade, tradicionalmente, é usado o conceito de 
**construtor telescópico**: onde o primeiro construtor 
ocupa apenas os campos obrigatórios, para cada campo opcional, 
existe um construtor adicional que utiliza os campos obrigatórios
**mais** os campos opcionais.

``` java
class Pizza {
    public Pizza (Size size, Dough dought) { ... }
    public Pizza (Size size, Dough dought, Sauce sauce) { ... }
    public Pizza (Size size, Dough dought, Sauce sauce, List<Toppings> toppings) { ... }
    // ...
}
```

O maior problema dessa solução, se dá pela manutenção desse 
código e leitura a longo prazo, pois os construtores tendem 
a aumentar conforme aumenta o número de atributos da classe.

Outra possibilidade, é a utilização do **padrão JavaBeans**, ou
seja, a criação de um construtor sem parâmetros e setters 
para inicialização dos valores necessários.

```java
    ...
    Pizza pizza = new Pizza();
    pizza.setSize(SMALL);
    pizza.setSauce(RED);
    ...
```

Uma desvantagem relacionada é que o padrão JavaBeans 
exclui a possibilidade de tornar uma classe imutável e 
requer esforço adicional por parte do programador para 
garantir a segurança da thread. Se eu esqueço um dos parâmetros
obrigatórios, como o tamanho, por exemplo, posso ter problemas
futuros na utilização desse objeto.

Com o objetivo de resolver esses problemas, surgiu o padrão 
Builder.

Algumas vantagens e desvantagens dessa abordagem são:


| Vantagens                                                  | Desvantagens                                                          |
|------------------------------------------------------------|-----------------------------------------------------------------------|
| Encapsulamento bem definido                                | Sempre é necessário criar um builder para a instanciação de um objeto |
| Flexibilidade e possibilidade de customização de um objeto | Mais verboso que os demais métodos                                    |
| Imutabilidade                                              |                                                                       |
| Segurança e integridade dos dados                          |                                                                       |
| Reusabilidade de código                                    |                                                                       |
| Maior controle no processo de construção de um objeto      |                                                                       |

## Exemplo

No nosso caso de uso, temos a construção de uma `Pizza`. Temos 
algumas possíveis variações aqui: Com ou sem azeitonas, 
tipos diferentes de tamanho, tipos de massa, possibilidades 
de molhos, quantidades e tipos de toppings 
(ou sem, se você tiver gostos peculiares).

A estrutura do projeto é a seguinte:
```
.
├── ...
├── com.builder.java      # Pacote destinado ao exemplo
│   ├── Dought            # Enum de tipos de Massa
│   ├── Pizza             # Classe da construção da Pizza
│   ├── Sauce             # Enum de tipos de Molho
│   ├── Size              # Enum de tipos de Tamanho
│   └── Topping           # Enum de tipos de Toppings
├── README.md             # Documentação do exemplo
└── ...

```


Uma forma de utilizar o padrão para a construção
dessas Pizzas é como no exemplo abaixo:

``` java
  Pizza sausagePizza = new PizzaBuilder(Size.SMALL, Dought.WHITE)
                .withSauce(Sauce.RED)
                .withTopping(Topping.CHEESE, Topping.SAUSAGE, Topping.ONION)
                .withOlive()
                .build();

        Pizza cheesePizza = new PizzaBuilder(Size.LARGE, Dought.WHITE)
                .withSauce(Sauce.WHITE)
                .withTopping(Topping.CHEESE)
                .build();
```

## Casos de Uso
- [java.lang.StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)
- [java.lang.StringBuffer](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html#append-boolean-)

## Para saber mais
Os exemplos mostrados aqui, foram inspirados na versão do
padrão Builder de Joshua Bloch, autor do livro Effective Java.
Essa versão alternativa, é uma variação da versão original
apresentado pelo Gang of Four, que contém outros
elementos, entre eles, um Director, responsável
por notificar o construtor sempre que uma parte do produto 
deve ser construída.

Caso tenha curiosidade, o livro **Design Patterns: Elements of Reusable Object-Oriented Software**,
o site do Refactor Guru e livro Head First Design Patterns,
todos presentes na seção **Fonte**, abordam o padrão
em sua forma original.


## Fonte
- [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Object-Oriented-Addison-Wesley-Professional-ebook/dp/B000SEIBB8)
- [Refactoring Guru](https://refactoring.guru/design-patterns/builder)
- Head First Design Patterns
- Effective Java
- [DigitalOcean](https://www.digitalocean.com/community/tutorials/builder-design-pattern-in-java)
- [JournalDev: Builder Design Pattern](https://www.youtube.com/watch?v=D5NK5qMM14g&ab_channel=JournalDevITServices)
- [Exploring Joshua Bloch’s Builder design pattern in Java](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java)

