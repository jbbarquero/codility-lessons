package com.malsolo.codility.sampletest.equilibriumindex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.malsolo.codility.sampletest.equilibriumindex.Solution;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        int expected = 1;
        int[] array = { -1, 3, -4, 5, 1, -6, 2, 1 };
        assertEquals(expected, solution.solution(array));
    }
}
