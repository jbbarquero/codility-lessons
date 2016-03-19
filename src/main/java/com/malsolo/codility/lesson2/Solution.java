package com.malsolo.codility.lesson2;

public class Solution {
	
	public int[] solution(int[] array, int k) {
		if (array == null)
			return null;
		
		int arrayLength = array.length;
		
		int[] sol = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			sol[(i + k) % arrayLength] = array[i];
		}
		
		return sol;
	}

}
