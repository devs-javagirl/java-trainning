import java.util.Arrays;

public class CountingSort {
    public void sortList(int[] list) {
        // Nada a fazer se o array estiver vazio ou já estiver ordenado.
        if (list == null || list.length <= 1) {
            System.out.println("Vetor inválido");
            return;
        } else if (this.verifySorting(list)) {
            System.out.println("O vetor já está ordenado");

        } else {
            // Encontrar o valor máximo no array.
            int maxValue = Arrays.stream(list).max().getAsInt();

            // Criar um vetor de contagem com base no valor máximo
            // Lembre-se que o 0 também é um valor válido.
            int[] count = new int[maxValue + 1];

            // Contar a frequência de cada valor no array original
            // e armazenar na posição correspondente ao valor.
            for (int value : list) {
                count[value]++;
            }

            // Acumular as frequências.
            for (int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }

            // Criar vetor auxiliar para armazenar valores ordenados.
            int[] aux = new int[list.length];
            // Construir a lista ordenada.
            for (int i = list.length - 1; i >= 0; i--) {
                aux[count[list[i]] - 1] = list[i];
                count[list[i]]--;

            }

            // Copiar os elementos ordenados de volta para o array original.
            System.arraycopy(aux, 0, list, 0, list.length);
        }
    }

        private boolean verifySorting ( int[] list){
            boolean isSorted = true;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    isSorted = false;
                    break;
                }
            }
            return isSorted;
        }

    public void printList(int[] list){
        System.out.print("[ ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println(" ]");
    }




}


