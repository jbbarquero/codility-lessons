package com.malsolo.codility.sampletest.equilibriumindex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 * Codility Demo Test. Equilibrium index of an array
 * 
 * See https://codility.com/demo/take-sample-test/ Solution at http://blog.codility.com/2011/03/solutions-for-task-equi.html
 * 
 */
public class Solution {

    public int solution(int[] A) {
        if (A == null)
            throw new NullPointerException("Error, equilibrium needs a non null array");
        if (A.length == 0)
            throw new IllegalArgumentException("Error, equilibrium needs a non empty array");
        if (A.length == 1)
            throw new IllegalArgumentException("Error, equilibrium needs an array with length greater than 1");
        int sum = 0;
        Map<Integer, Integer[]> counter = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            Integer[] dupla = new Integer[2];
            dupla[0] = sum;
            counter.put(i, dupla);
            sum += A[i];
        }
        sum = 0;
        for (int i = (A.length - 1); i >= 0; i--) {
            Integer[] dupla = counter.get(i);
            dupla[1] = sum;
            sum += A[i];
        }

        int sol = -1;

        Iterator<Integer> iterator = counter.keySet().iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {// && !encontrado ) {
            int index = iterator.next();
            Integer[] dupla = counter.get(index);
            encontrado = (dupla[0].intValue() == dupla[1].intValue());
            if (encontrado) {
                System.out.printf("At index %d there is an equilibrium between lower and higher sum: %d %n", index, dupla[0].intValue());
                if (sol == -1) {
                    sol = index;
                }
            }
        }

        return sol;
    }

}
