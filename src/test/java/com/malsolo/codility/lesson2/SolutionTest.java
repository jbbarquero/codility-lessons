package com.malsolo.codility.lesson2;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import com.malsolo.codility.lesson2.Solution;

public class SolutionTest {

	private final Solution solution = new Solution();
	
	@Test
	public void test9() throws Exception {
		int[] givenArray = {3, 8, 9, 7, 6};
		int k = 3;
		int[] expectedArray = {9, 7, 6, 3, 8};
		assertTrue(Arrays.equals(expectedArray, solution.solution(givenArray, k)));
	}
}
