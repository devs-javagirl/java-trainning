public class PolimorfismoSobrecarga {

    // Método que aceita dois inteiros como argumentos
    public int somar(int a, int b) {
        return a + b;
    }

    // Método que aceita três inteiros como argumentos
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método que aceita dois números de ponto flutuante como argumentos
    public double somar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        PolimorfismoSobrecarga calculadora = new PolimorfismoSobrecarga();

        // Chamando o método de soma com dois inteiros
        int resultado1 = calculadora.somar(5, 10);
        System.out.println("Soma de inteiros: " + resultado1);

        // Chamando o método de soma com três inteiros
        int resultado2 = calculadora.somar(5, 10, 15);
        System.out.println("Soma de três inteiros: " + resultado2);

        // Chamando o método de soma com dois números de ponto flutuante
        double resultado3 = calculadora.somar(3.5, 2.5);
        System.out.println("Soma de números de ponto flutuante: " + resultado3);
    }
}
