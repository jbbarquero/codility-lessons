package com.malsolo.codility.lesson2.OddOccurrencesInArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {

    public int solution(int[] array) {
        if (array == null)
            throw new NullPointerException("Argument array null");

        Map<Integer, Integer> ocurrences = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            Integer previous = ocurrences.put(array[i], 1);
            if (previous != null) {
                ocurrences.put(array[i], previous.intValue() + 1);
            }
        }

        Iterator<Integer> iteratorKeys = ocurrences.keySet().iterator();
        boolean found = false;
        Integer one = new Integer(1);
        Integer key = null;
        while (iteratorKeys.hasNext() && !found) {
            key = iteratorKeys.next();
            found = one.equals(ocurrences.get(key));
        }

        if (found) {
            return key;
        } else {
            throw new IllegalArgumentException("Argument array doesn't contain an unpaired element ");
        }
    }

}
