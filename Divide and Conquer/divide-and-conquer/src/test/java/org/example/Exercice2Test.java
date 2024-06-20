package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercice2Test {
    @Test
    public void given_emptyList_should_returnCorrectSize() {
        List<Integer> list = new ArrayList<>();

        Assert.assertEquals(list.size(), Exercice2.countListSize(list));
    }

    @Test
    public void given_listWithOneItem_should_returnCorrectSize() {
        List<Integer> list = Arrays.asList(3);

        Assert.assertEquals(list.size(), Exercice2.countListSize(list));
    }

    @Test
    public void given_listWithManyItems_should_returnCorrectSize() {
        List<Integer> list = Arrays.asList(3, 3, 4, 5, 7, 2);

        Assert.assertEquals(list.size(), Exercice2.countListSize(list));
    }
}