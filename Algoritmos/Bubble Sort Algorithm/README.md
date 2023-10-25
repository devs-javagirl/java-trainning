# Algoritmo de Ordenação: Bubble Sort

Algoritmo é uma descrição, passo a passo, para a realização de uma determinada tarefa.
<br>
<br>
Um dos problemas que podem ser resolvidos por meio de um algoritmo é a ordenação de elementos, como números ou palavras.
<br>
<br>
Essa tarefa pode ser realizada de diferentes formas, ou seja, existem diversos algoritmos diferentes que produzirão o mesmo resultado.
<br>
<br>
No entanto, em muitas situações, o processo importa tanto quanto o resultado, e um determinado algoritmo pode ser mais adequado que outro, ainda que seus produtos sejam idênticos.
<br>
<br>
Quando se trata da ordenação de elementos, um dos algoritmos existentes é o Bubble Sort, ou "Classificação por Bolha".


# Bubble Sort

O Bubble Sort é um algoritmo simples, mas pouco eficiente.
<br>Com ele, cada elemento de uma lista é comparado com o elemento seguinte, e caso o segundo seja menor do que o primeiro, eles trocam de lugar.
<br> A lista precisa ser percorrida quantas vezes seja necessário, até que todos os elementos estejam ordenados.

Vamos exemplificar com a seguinte lista numérica, onde os valores entre [ ] representam a posição de cada elemento:

![img.png](img.png)


* **Primeira passagem:**
    - O elemento na posição [0] é comparado ao elemento na posição [1], e caso o elemento [1] seja menor, eles trocam de lugar:
        <br> 5 < 3: Falso - Os elementos são mantidos em suas posições.<br> 
    - O elemento na posição [1] é comparado ao elemento na posição [2], e caso o elemento [2] seja menor, eles trocam de lugar:
        <br> 1 < 5: Verdadeiro - Os elementos trocam de lugar.<br> 
    - O elemento na posição [2] é comparado ao elemento na posição [3], e caso o elemento [3] seja menor, eles trocam de lugar:
      <br> 2 < 5: Verdadeiro - Os elementos trocam de lugar.<br> 
    - O elemento na posição [3] é comparado ao elemento na posição [4], e caso o elemento [4] seja menor, eles trocam de lugar:
      <br> 4 < 5: Verdadeiro - Os elementos trocam de lugar.

![BubbleSort.gif](BubbleSort.gif)

O processo se repete até que todos os elementos estejam ordenados.
