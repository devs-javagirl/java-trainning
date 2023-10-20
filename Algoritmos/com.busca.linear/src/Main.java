import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        int[] vetor = new int[5];
        vetor[0] = 5;
        vetor[1] = 1;
        vetor[2] = 2;
        vetor[3] = 3;
        vetor[4] = 4;

        boolean isNumero = false;
        int numeroLocalizado = 0;

        System.out.println("insira o numero a ser buscado: ");
        int numeroBuscado = sc.nextInt(); // criada uma variável pra armazenar o numero que será buscado pelo algoritmo

        for (int i : vetor) {
            if (numeroBuscado == i) {
                isNumero = true;
                numeroLocalizado = i;
            }
        }
        if (isNumero) {
            System.out.println("valor encontrado: " + numeroLocalizado);
        } else {
            System.out.println("valor nao encontrado: " + numeroBuscado);
        }
    }
}