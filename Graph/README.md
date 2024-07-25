Nesse projeto, está implementado um exemplo de grafo e uma busca em largura exemplificado no livro "Entendendo algoritmos".

## Grafo

Um grafo é uma estrutura matemática utilizada para modelar relações entre objetos. É composto por dois elementos principais:

- **Vértices** (ou nós): Representam os objetos ou entidades.
- **Arestas** (ou ligações): Representam as conexões ou relações entre os vértices.

### Tipos de Grafos
- **Grafo Não Direcionado**: As arestas não têm direção, ou seja, a relação entre os vértices é bidirecional.
- **Grafo Direcionado** (ou dígrafo): As arestas têm uma direção, indicando uma relação unidirecional entre os vértices.


### Aplicações de Grafos
Grafos são utilizados em diversas áreas, como:

- **Redes de Computadores**: Para modelar a interconexão entre diferentes dispositivos.
- **Redes Sociais**: Para representar relações de amizade, seguidores, etc.
- **Roteamento**: Para encontrar o caminho mais curto ou mais eficiente entre dois pontos.
- **Bioinformática**: Para modelar relações entre genes e proteínas.

## Busca em Largura (BFS)
A **Busca em Largura** (**BFS** - Breadth-First Search) é um algoritmo de travessia ou busca em grafos que explora os vértices de um grafo de maneira sistemática, nível por nível. A BFS é particularmente útil para encontrar o caminho mais curto em grafos não ponderados.

### Como a BFS Funciona
- **Inicialização**: Comece pela raiz (ou nó inicial) e coloque-o em uma fila.
- **Exploração**: Remova o vértice da frente da fila, marque-o como visitado e coloque todos os seus vizinhos não visitados na fila.
- **Repetição**: Repita o processo de exploração até que a fila esteja vazia ou o nó de destino seja encontrado.

_Exemplo_: 

Considere o seguinte grafo não direcionado:

```
  A
 / \
B   C
|   |
D   E
```
Passos da BFS a partir do nó A:

1. Inicialização:
- **Fila**: [A]
- **Visitados**: {A}


2. Exploração do nó A:
- **Fila**: [B, C]
- **Visitados**: {A, B, C}

3. Exploração do nó B:
- **Fila**: [C, D]
- **Visitados**: {A, B, C, D}

4. Exploração do nó C:
- **Fila**: [D, E]
- **Visitados**: {A, B, C, D, E}

5. Exploração do nó D:
- **Fila**: [E]
- **Visitados**: {A, B, C, D, E}

6. Exploração do nó E:
- Fila: []
- Visitados: {A, B, C, D, E}

Ao final do processo, todos os nós alcançáveis a partir de A foram visitados na ordem de suas distâncias da raiz.

### Aplicações da BFS
- Encontrar o caminho mais curto em grafos não ponderados.
- Verificar conectividade entre dois vértices.
- Construção de árvores de cobertura mínima em grafos não direcionados.

