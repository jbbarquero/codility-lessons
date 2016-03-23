package com.malsolo.codility.lesson1.binarygap;

import static org.junit.Assert.*;

import org.junit.Test;

import com.malsolo.codility.lesson1.binarygap.Solution;

public class SolutionTest {
	
	private final Solution solution = new Solution();
	
	@Test
	public void test9() throws Exception {
		assertEquals(2, solution.solution(9));
	}

	@Test
	public void test529() throws Exception {
		assertEquals(4, solution.solution(529));
	}

	@Test
	public void test20() throws Exception {
		assertEquals(1, solution.solution(20));
	}

	@Test
	public void test15() throws Exception {
		assertEquals(0, solution.solution(15));
	}
}
