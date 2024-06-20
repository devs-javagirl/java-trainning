package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercice1 {
    private static final int FIRST_POSITION_IN_LIST = 0;
    private static final int SECOND_POSITION_IN_LIST = 1;

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println("Result: "+ sum(list));
    }

    public static int sum(List<Integer> list) {
        System.out.println("Actual list: " + list);

        if (list.isEmpty()) {
            return 0;
        }

        if (list.size() < 2) {
            return list.get(FIRST_POSITION_IN_LIST);
        }

        return list.get(FIRST_POSITION_IN_LIST) + sum(list.subList(SECOND_POSITION_IN_LIST, list.size()));
    }
}
