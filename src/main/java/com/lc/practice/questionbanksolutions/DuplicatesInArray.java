package com.lc.practice.questionbanksolutions;

import java.util.*;

/*
You are given a 1d array

Find all duplicates in an array.
Order of the output does not matter.
Duplicates in the output are not allowed.
Return duplicates as set

Example 1
Input: nums = [1,2,3,4,7,8,9,5]
Output: [5]

Example 2
Input: nums = [1,2,3,4,7,8,9,5,1,2,3]
Output: [1,2,3,5]
 */
public class DuplicatesInArray {
    private Set<Integer> suboptimalSolution(int[] input) {
        Set<Integer> output = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    output.add(input[i]);
                }
            }
        }
        return output;
    }

    private Set<Integer> optimalSolution(int[] input) {
        Map<Integer, Boolean> cache = new HashMap<>();
        for (int i : input) {
            if (cache.containsKey(i)) {
                cache.put(i, true);
            } else {
                cache.put(i, false);
            }
        }
        Set<Integer> output = new HashSet<>();
        for (Map.Entry<Integer, Boolean> entry : cache.entrySet()) {
            Integer key = entry.getKey();
            Boolean value = entry.getValue();
            if (value) output.add(key);
        }
        return output;
    }
}
