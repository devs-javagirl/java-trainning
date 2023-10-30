import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {

        CountingSort countingSort = new CountingSort();
        int[] list = {4, 2, 9, 1, 6, 3, 9, 5, 2};
        System.out.print("Lista de entrada:\t ");
        countingSort.printList(list);

        // ordenando lista com algoritmo Counting Sort
        countingSort.sortList(list);

        System.out.print("Lista de saída:\t\t ");
        countingSort.printList(list);


    }
}