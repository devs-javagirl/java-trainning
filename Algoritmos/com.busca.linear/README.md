# Busca linear

### Introdução

A busca linear consite em um método de busca através do qual percorremos um array de elementos comparando cada elemento com o valor que desejamos encontrar.
Esse tipo de busca é muito utilizado quando não sabemos a posição do elemento que desejamos encontrar. 
Contudo, para a complexidade desse algoritmo é O(n), ou seja, o tempo de execução é proporcional ao tamanho do array. Em caso de arrays muito grandes, esse tipo de busca pode ser muito custoso.

## Funcionamento do algoritmo
O algoritmo realiza as seguintes etapas:
1. Cria um array com 5 posições.
2. Preenche o array com valores inteiros.
3. Solicita ao usuário que digite um valor que deseja encontrar.
4. Percorre o array através deu um for comparando cada elemento com o valor que desejamos encontrar.
5. Se o valor for encontrado, ele atribue o valor 'true' à variável isNumero, e atribui o valor encontrado à variável numeroLocalizado.
6. Caso o valor não seja encontrado, ele atribui o valor 'false' à variável isNumero.
7. Exibe o resultado da busca.
