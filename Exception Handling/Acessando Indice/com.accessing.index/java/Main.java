import java.util.Scanner;

public class Main {

    private static final int[] arrayInteiros = {1, 2, 3, 5, 8, 13, 21, 34};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual índice do array você deseja acessar? ");

        int indice = scanner.nextInt();

        try {
            int resultado = arrayInteiros[indice];
            System.out.printf("Valor: %d", resultado);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Índice inexistente.");
        }
    }
}
