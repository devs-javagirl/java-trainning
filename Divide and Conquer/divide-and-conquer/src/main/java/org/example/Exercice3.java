package org.example;

import java.util.Arrays;
import java.util.List;

public class Exercice3 {
    private static final int FIRST_POSITION_IN_LIST = 0;
    private static final int SECOND_POSITION_IN_LIST = 1;

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 1, 5, 33, 2, 1);
        System.out.println("Result: "+ getGreatestNumberInList(list));
    }

    public static int getGreatestNumberInList(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int firstNumber = list.get(FIRST_POSITION_IN_LIST);

        if (list.size() < 2) {
            return firstNumber;
        }

        return Math.max(firstNumber, getGreatestNumberInList(list.subList(SECOND_POSITION_IN_LIST, list.size())));
    }
}
