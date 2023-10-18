# Polimorfismo 

## Um dos pilares da programação orientada a objetos (POO)

Morfologicamente falando ao separar a palava temos _Poli_  que significa muitos, vários e _morfismo_ que está relacionado à forma. 
Sendo assim _Polimorfismo_ que dizer "várias formas".

O polimorfismo permite que objetos de classes diferentes respondam à mesma mensagem ou método de maneiras diferentes. Isso é possível porque objetos de tipos diferentes podem ter métodos com o mesmo nome, mas comportamentos diferentes.

Portanto, o polimorfismo é uma característica importante da POO, pois torna o código mais versátil e flexível. Isso significa que você pode escrever código que funcione para objetos de várias classes diferentes, desde que essas classes implementem métodos com assinatura igual esperada.

Podemos pontuar também o fato dele ser complementado pela _herança_ (um outro pilar da POO).

E por se dividir em dois tipos principais: 
- _Sobrecarga_.
- _Sobrescrita_.

### Sobrecarga

A sobrecarga é a capacidade de uma classe ter dois ou mais métodos com o mesmo nome, mas com assinaturas diferentes. A assinatura de um método é composta pelo seu nome, tipo de retorno e lista de parâmetros.

### Sobrescrita

A sobrescrita é a capacidade de uma subclasse substituir o comportamento de um método herdado da superclasse. A sobrescrita requer que o método na subclasse tenha a mesma assinatura do método na superclasse.

#### Diferenças entre os tipos: 
| Característica | Sobrecarga | Sobrescrita |
|---|---|---|
| Definição | Capacidade de uma classe ter dois ou mais métodos com o mesmo nome, mas com assinaturas diferentes | Capacidade de uma subclasse substituir o comportamento de um método herdado da superclasse |
| Assinatura | Diferente | Igual |
| Tipo de retorno | Pode ser diferente | Deve ser o mesmo |
| Lista de parâmetros | Pode ser diferente | Deve ser a mesma |
| Modificadores | Qualquer | Não pode ser `final` ou `static` |


## Referências

 - [Java - Oracle ](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)

 - [UFSC - Prof Frank Siqueira ](http://www.inf.ufsc.br/~frank.siqueira/INE5605/10.Polimorfismo.pdf)

 - [UNESP - Prof Daniel Cardozo Mourao ](https://www.feg.unesp.br/Home/PaginasPessoais/profadanielacardozomourao/polimorfismo.pdf)

 - [UFSM - Flash utilizando Orientação a Objetos e a linguagem XML. ](http://www-usr.inf.ufsm.br/~rose/curso3/cafe/cap4_Polimorfismo.pdf)
