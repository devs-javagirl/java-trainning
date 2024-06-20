package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Exercice1Test {

    @Test
    public void given_emptyList_should_returnCorrectSum() {
        List<Integer> list = new ArrayList<>();

        Assert.assertEquals(0, Exercice1.sum(list));
    }

    @Test
    public void given_listWithOneItem_should_returnCorrectSum() {
        List<Integer> list = Arrays.asList(3);

        Assert.assertEquals(3, Exercice1.sum(list));
    }

    @Test
    public void given_listWithManyItems_should_returnCorrectSum() {
        List<Integer> list = Arrays.asList(3, 3, 4, 5, 7, 2);

        Assert.assertEquals(24, Exercice1.sum(list));
    }
}