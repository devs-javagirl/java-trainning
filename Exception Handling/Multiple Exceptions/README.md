
## Múltiplas Exceções

Em Java, é possível capturar múltiplas exceções em um único bloco **catch** usando o caractere pipe **|** para 
separar os tipos de exceção.

Também é possível usar blocos **catch** separados para lidar com os diferentes tipos de exceções.

Neste exemplo, o bloco **try** contém código que pode lançar uma **ArithmeticException** (se a divisão for por zero) 
ou um 
**ArrayIndexOutOfBoundsException** (se tentar acessar um elemento de array que não existe). Essas exceções são capturadas no primeiro bloco **catch**.

Um bloco **try-catch-finally** separado demonstra como capturar uma **NumberFormatException** e executar um bloco **finally** que é executado independentemente de ter ocorrido uma exceção ou não.
