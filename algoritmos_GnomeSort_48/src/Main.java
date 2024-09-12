import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Ordenação de vetor Gnome Sort");

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i+1) + "º numero aleatório: ");
            numeros[i] = scan.nextInt();
        }
        System.out.println("Numeros digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + ", ");
        }
        int index = 0;
        //int n = numeros.length;

        while (index < numeros.length){
            if (index == 0){
                index++;
            }
            if (numeros[index] >= numeros[index - 1]){
                index++;
            }else {
                int temporario = numeros[index];
                numeros[index] = numeros[index - 1];
                numeros[index - 1] = temporario;
                index--;
            }
        }
        System.out.println("\nNumeros ordenados:");
        for (int num: numeros) {
            System.out.println("\n" + num);

        }
    }
}