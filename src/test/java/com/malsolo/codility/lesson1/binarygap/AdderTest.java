package com.malsolo.codility.lesson1.binarygap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.malsolo.codility.Adder;

public class AdderTest {

    private Adder adder = new Adder();

    @Test
    public void simpleTest() {
        assertEquals("1 + 1 is 2", 2, adder.add(1, 1));
    }

    @Test
    public void orderTest() {
        assertEquals("Order does not matter ", 5, adder.add(2, 3));
        assertEquals("Order does not matter ", 5, adder.add(3, 2));
    }

}
