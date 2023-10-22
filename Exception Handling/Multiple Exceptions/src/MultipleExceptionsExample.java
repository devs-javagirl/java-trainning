public class MultipleExceptionsExample {
    public static void main(String[] args) {
        int[] numbers = {1, 0};
        int[] denom = {0, 2};

        for (int i = 0; i < 2; i++) {
            try {
                // Essa linha pode lançar uma exceção
                int result = numbers[i] / denom[i];
                System.out.println("Result: " + result);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                // Capturando múltiplas exceções em um bloco catch
                System.out.println("Exception caught: " + e);
            }
        }

        try {
            // Tentativa de executar algum código que pode lançar exceções
            int result = Integer.parseInt("abc");
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            // Tratando um tipo diferente de exceção em outro bloco catch
            System.out.println("Exception caught: " + e);
        } finally {
            // Esse bloco sempre será executado
            System.out.println("Finally block executed");
        }
    }
}
