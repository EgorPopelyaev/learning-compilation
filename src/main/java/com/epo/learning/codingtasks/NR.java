package com.epo.learning.codingtasks;

import java.util.HashMap;

public class NR {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        nonRepeating("abcab"); // should return 'c'
        nonRepeating("abab"); // should return null
        nonRepeating("aabbbc"); // should return 'c'
        nonRepeating("aabbdbc"); // should return 'd'
    }

    // Implement your solution below.
    public static Character nonRepeating(String s) {
        HashMap<Character, Integer> container = new HashMap<Character,Integer>();
        Character unic = null;
        
        for (Character elem : s.toCharArray()) {
            if (!container.containsKey(elem)) {
                container.put(elem, 1);
            } else {
                int count = container.get(elem) + 1;
                container.put(elem, count);
            }
        }

        for (Character chr : s.toCharArray()) {
          if (container.get(chr).equals(1)) {
            unic = chr;
          }
        }
        return unic;
    }
}