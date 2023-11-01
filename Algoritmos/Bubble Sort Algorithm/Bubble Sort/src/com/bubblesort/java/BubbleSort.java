package com.bubblesort.java;

public class BubbleSort {
    public int[] sortList(int[] list) {
        boolean isSorted = verifySorting(list);
        while (!isSorted){
            for (int i=0; i<list.length-1; i++) {
                int a = list[i];
                int b = list[i + 1];
                if (b < a){
                    list[i] = b;
                    list[i + 1] = a;
                }
                //Descomente a linha abaixo se desejar exibir a situação
                //da lista a cada passo do algoritmo:
                //printList(list);
            }
            isSorted = verifySorting(list);
        }
        return list;
    }

    private boolean verifySorting(int[] list){
        boolean isSorted = true;
        for (int i=0; i<list.length-1; i++){
            if (list[i] > list[i + 1]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    private void printList(int[] list){
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

