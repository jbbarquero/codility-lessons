package com.malsolo.codility.lesson1;

public class Solution {
	
	public int solution(int n) {
		int sol = 0;
		
		System.out.printf("Solution for %d%n", n);
		
		String binary = Integer.toBinaryString(n);
		System.out.printf("Processing %s%n", binary);
		char[] bits = binary.toCharArray();
		
		if (bits.length > 2) {
			int i = 0;
			for (int j = 1; j < bits.length; j++) {
				if (bits[i] == '0') {
					i++;
					continue;
				}
				else {
					if (bits[j] == '1') {
						int valor = (j - i - 1);
						sol = (valor > sol ? valor : sol);
						i = j;
					}
					else {
						continue;
					}
				}
			}
		}
		
		System.out.printf("Solution for %d: %d%n", n, sol);
		return sol;
	}

}
