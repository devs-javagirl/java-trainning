# Builder Pattern
O padrão Builder é um padrão de projeto estrutural,
que tem como objetivo a capacidade de permitir que classes
trabalhem juntas quando não poderiam por conta de
incompatibilidade de interfaces.

## Motivação
Às vezes, uma classe projetada para reutilização não 
é reutilizável apenas porque a interface não corresponde 
à interface específica do domínio que um aplicativo exige.

Este é um dos padrões mais importantes para gerenciar 
a complexidade da base de código e trabalhar com sistemas
legados. Além disso, permite reutilizar bibliotecas de 
terceiros sem fazer alterações na aplicação e sempre 
podendo alterar as implementações com facilidade.

Esse padrão possui duas abordagens: adaptador de classe e
adaptador de objeto.

### Adaptador de Classe
Essa implementação utiliza herança: o adaptador herda
interfaces de ambos os objetos ao mesmo tempo. Observe que
essa abordagem só pode ser implementada em linguagens de
programação que suportam herança múltipla, tais como C++.

Aqui, em vez de ter um objeto adaptado dentro do adaptador
(composição) para fazer uso de sua funcionalidade, o
adaptador herda o adaptado.

![class-adapter.png](images%2Fclass-adapter.png)

### Adaptador de Objeto
Essa implementação usa o princípio de composição do objeto:
o adaptador implementa a interface de um objeto e encobre
o outro. O adaptador contém uma instância do adaptado.

![obj-adaptor.png](images%2Fobj-adaptor.png)

Algumas vantagens e desvantagens dessa abordagem são:

| Vantagens                                                                   | Desvantagens                     |
|-----------------------------------------------------------------------------|----------------------------------|
| Dados de lógica separados de dados de negócio                               | Aumenta a complexidade do código |
| Facilidade de introdução de novos tipos de adaptadores sem quebrar o código |                                  |                                                                            |                                  |

## Exemplo

![jack-to-usbc.png](images%2Fjack-to-usbc.png)

Eu, como boa amante de música, estou sempre com um fone de ouvido pluggado por aí.

Suponha que você está voltando pra casa, em São Paulo, de metrô pela estação Sé, às 18:30 de uma terça-feira apenas
com um fone de ouvido com um conector padrão Jack 3.5mm e um celular com entrada USB. Então, qual é o problema?
De uns anos pra cá, foi crescente [a mudança dos conectores do padrão Jack para o USB tipo C](https://www.theverge.com/2016/8/17/12519936/intel-usb-type-c-headphone-jack-replacement-idf-2016).
Dessa forma, dispositivos mais antigos não sabem interagir diretamente com os novos dispositivos. 
**Eles não compartilham uma interface comum.**

O celular possui uma porta USB, mas não podemos inserir o conector do fone nela, pois possuem [formas e especificações](https://www.usb.org/sites/default/files/USB%20Type-C%20Spec%20R2.0%20-%20August%202019.pdf)
diferentes, impedindo a reprodução do áudio.
Um adaptador de interfaces resolve esse problema. Afinal, ele possui um cabo USB! Ao contrário do conector Jack,
o adaptador pode ser conectado ao computador. 
**Eles compartilham uma interface comum com o computador: USB.**

![adapter.png](images%2Fadapter.png)

Na prática:

#### USB
Esta é a nossa interface USB com apenas um método de conexão via USB.

#### JackConnector
Esta é a nossa classe que representa o conector padrão Jack. Infelizmente, não
implementa a interface USB. O conector não pode ser inserido na porta USB.

#### UsbConnector
Esta é a nossa classe que representa o conector padrão Usb. Esse conector, desde que seja compativel com
o tipo da porta de entrada, pode ser inserido na porta USB.

#### JackToUsbAdapter
Esse é o nosso cabo adaptador. A classe que está sendo adaptada (JackConnector) passa a ser um dos campos do adaptador.
Quando pluggamos um conector do padrão Jack em cabo desse tipo na vida real, ele também passa a fazer parte dele
(um cabo só). Ao contrário do plug do padrão descontinuado, o adaptador compartilha uma interface com o celular.
Possui cabo USB, ou seja, pode ser conectado a outros dispositivos via USB. É por isso que nossa classe 
JackToUsbAdapter implementa a interface USB. 

Na verdade, o adaptador não faz nada sozinho. Um cabo adaptador não possui nenhuma funcionalidade independente.
Sua função é apenas conectar o celular e o fone de ouvido para permitir que o conector (e o fone de ouvido)
faça seu trabalho – reproduzir a Crazy in Love no volume em 90%!

A estrutura do projeto é a seguinte:
```
.
├── ...
├── com.adapter.java      # Pacote destinado ao exemplo
│   ├── JackConnector       
│   ├── JackToUsbAdapter             
│   ├── Main              # Programa cliente para simular o exemplo
│   ├── Usb              
│   └── UsbConnector           
├── images                # pasta para armazenamento das imagens
├── README.md             # Documentação do exemplo
└── ...

```

Uma forma de utilizar o padrão é como no exemplo abaixo:

``` java
    JackConnector jackConnector = new JackConnector();
    Usb jackConnectorAdapter = new JackToUsbAdapter(jackConnector);
    jackConnectorAdapter.connectWithUsbCable();
```

## Casos de Uso

Antigos tipos de coleções (Vector, Stack, Hashtable e
alguns outros) no Java implementam um método elements(),
que retorna uma [Enumeration](https://docs.oracle.com/javase/8/docs/api/java/util/Enumeration.html), interface que permite 
percorrer os elementos de uma coleção sem saber as
especificidades de como são gerenciadas.

Quando a Sun lançou sua classe mais recente, 
a [Collections](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html), eles começaram a usar uma Interface do 
Iterator que, como Enumeration, permite que você itere 
através de um conjunto de itens em uma coleção, mas 
também adiciona a capacidade de remover itens.

Assim, um Adapter para converter código legado em algo 
mais moderno, pode ser útil.

## Fonte
- [Head First Design Patterns](https://www.amazon.com.br/Cabe%C3%A7a-Padr%C3%B5es-Projetos-Eric-Freeman/dp/8576081741)
- [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Object-Oriented-Addison-Wesley-Professional-ebook/dp/B000SEIBB8)
- [Refactoring Guru](https://refactoring.guru/design-patterns/adapter)
- [Baeldung](https://www.baeldung.com/java-adapter-pattern)
- [Java Documentation](https://docs.oracle.com/en/java/)