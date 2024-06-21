# Quicksort

O algoritmo Quicksort é um método eficiente para ordenar elementos em uma lista. Ele segue uma abordagem de divisão e conquista, onde:

1. **Divisão**: A lista é particionada em duas sub-listas baseadas em um elemento pivô.
2. **Conquista**: As sub-listas são ordenadas recursivamente.

### Passos principais do Quicksort:

- Escolhe-se um elemento da lista como pivô (geralmente o primeiro, último ou um elemento aleatório).
- Reorganiza a lista de forma que todos os elementos menores que o pivô estejam antes dele, e todos os elementos maiores estejam depois dele.
- Aplica recursivamente o Quicksort nas sublistas geradas.


### Tempo de Execução:

1. **Melhor Caso**: Ocorre quando o pivô divide a lista em duas sublistas aproximadamente iguais. O tempo de execução é O(n log n).
2. **Pior Caso**: Ocorre quando a lista já está ordenada ou quase ordenada, e o pivô escolhido é o menor ou o maior elemento da lista. O tempo de execução é O(nˆ2).
3. **Caso Médio**: O tempo de execução médio do Quicksort é O(n log n), onde n é o número de elementos na lista.


### Explicação do Tempo de Execução:

- No caso médio, o Quicksort tem desempenho muito bom, comparável ao Merge Sort, devido à sua eficiente divisão das sublistas.
- O pior caso ocorre quando o pivô não divide a lista de forma equilibrada, levando a uma partição muito desigual e aumentando o tempo de execução.
- Estratégias como a escolha do pivô (por exemplo, escolher o pivô aleatoriamente ou usar o método de mediana de três) podem melhorar o desempenho do Quicksort em casos práticos.

Em resumo, o Quicksort é um algoritmo eficiente com um desempenho médio de O(n log n), mas é sensível à escolha do pivô, o que pode afetar significativamente seu desempenho no pior caso.