# POO - Abstração
Na Programação orientada a objetos(POO), a abstração consiste em simplificar sistemas complexos do mundo real, ocultando detalhes irrelevantes e focando nos aspectos essenciais de objetos e classes.

## O que são **classes** e **objetos**?
São os dois principais aspectos da programação orientada a objetos.  
As classes são como "moldes" para construção(instanciação) dos objetos.

## Abstração em Java
A abstração em Java pode ser representada em classes abstratas ou interfaces.  
A palavra reservada *abstract* é um modificador sem acesso usado para classes e métodos:  

- classe abstrata: é uma classe restrita, que não pode ser utilizada para gerar objetos. Para ser acessada, deverá ser *herdada* por outra classe.
- método abstrato: só poder ser usado em classes abstratas e não possui corpo, este será definido na subclasse herdeira.
- classe filha: utiliza a palavra reservada **extends** para indicar a classe da qual herda os métodos abstrados(classe pai).
- notação *@Override*: utilizada para indicar, na classe filha, o método da classe pai que está sendo definido.  

---

## Bibliografia:
- [w3schools - Java](https://www.w3schools.com/java/default.asp)
- [ChatGPT](https://chat.openai.com/)


