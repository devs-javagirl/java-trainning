## Dividir para conquistar
"Dividir para conquistar" é um princípio fundamental na programação e algoritmos que se baseia na estratégia de resolver um problema **dividindo-o em partes menores**, mais simples e mais gerenciáveis. Esse método permite lidar com problemas complexos de forma mais eficiente, reduzindo a complexidade geral da solução.

Em termos práticos, o "dividir para conquistar" envolve três etapas principais:

### Divisão
O problema original é dividido em subproblemas menores. Essa divisão pode ser realizada de forma recursiva ou iterativa, dependendo da natureza do problema.

### Conquista
Cada subproblema é resolvido de forma independente. Isso pode envolver aplicar a mesma estratégia "dividir para conquistar" recursivamente nos subproblemas até que eles se tornem trivialmente resolvíveis.

### Combinação
As soluções dos subproblemas são combinadas para formar a solução do problema original. Esta etapa garante que a solução para o problema global seja construída corretamente a partir das soluções dos subproblemas.

Segundo o livro `Entendendo Algoritmos, escrito por Aditya Bhargava`, esses passos podem ser divididos em dois:
1. **Descubra o caso-base** (_caso envolva um array, o caso-base muitas vezes será um array vazio ou um array com apenas um elemento_).
2. **Você deve chegar o mais perto possível de um array vazio a cada recursão.**


### CASOS DE USO

O "dividir para conquistar" é amplamente utilizado em algoritmos eficientes para problemas como ordenação (por exemplo, merge sort, quicksort), busca (por exemplo, binary search), e problemas de divisão e conquista em geral. 

Ele não apenas simplifica a abordagem de solução de problemas complexos, mas também pode melhorar significativamente o desempenho do algoritmo quando implementado corretamente, reduzindo a complexidade temporal e espacial em comparação com abordagens mais ingênuas ou lineares.