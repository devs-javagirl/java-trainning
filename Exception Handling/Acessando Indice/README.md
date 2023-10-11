# Acessando Index

### Introdução

Ao utilizarmos arrays em Java lidamos com a possibilidade do lançamento de exceções.

Somente em tempo de execução é possível saber o retorno da consulta do índice de um array, caso não seja exista, 
uma exceção do tipo ArrayIndexOutOfBoundsException é lançada e nossa aplicação precisa estar preparada para lidar com 
essa situação mantendo seu fluxo normal.

## Funcionamento do Programa

O programa realiza as seguintes etapas:

1. Cria um array de inteiros com tamanho 8.
2. Solicita ao usuário que digite um índice que deseja acessar.
3. Tenta acessar o valor no índice especificado no array.
4. Se o índice for válido, ele imprime o valor.
5. Se o índice não existir (for maior ou igual a 8), ele trata a exceção `ArrayIndexOutOfBoundsException` e exibe uma 
mensagem de erro.