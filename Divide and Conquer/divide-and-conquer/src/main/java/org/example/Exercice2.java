package org.example;

import java.util.Arrays;
import java.util.List;

public class Exercice2 {
    private static final int SECOND_POSITION_IN_LIST = 1;

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println("Result: "+ countListSize(list));
    }

    public static int countListSize(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        if (list.size() < 2) {
            return 1;
        }

        return 1 + countListSize(list.subList(SECOND_POSITION_IN_LIST, list.size()));
    }
}
