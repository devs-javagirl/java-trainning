package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercice3Test {
    @Test
    public void given_emptyList_should_returnGreatestItem() {
        List<Integer> list = new ArrayList<>();

        Assert.assertEquals(0, Exercice3.getGreatestNumberInList(list));
    }

    @Test
    public void given_listWithOneItem_should_returnGreatestItem() {
        List<Integer> list = Arrays.asList(3);

        Assert.assertEquals(3, Exercice3.getGreatestNumberInList(list));
    }

    @Test
    public void given_listWithManyItems_should_rreturnGreatestItem() {
        List<Integer> list = Arrays.asList(3, 3, 4, 5, 7, 2, 88, 1, 4, 6, 7, 10, 81);

        Assert.assertEquals(88, Exercice3.getGreatestNumberInList(list));
    }

}