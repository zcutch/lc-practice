package com.lc.practice.questionbanksolutions;

import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
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
    // O(n^2) double for loop
    public static Set<Integer> suboptimalSolution(int[] input) {
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

    // O(n) hashset cache
    public static Set<Integer> optimalSolution(int[] input) {
        Set<Integer> cache = new HashSet<>();
        Set<Integer> output = new HashSet<>();
        for (int i : input) {
            if (cache.contains(i)) output.add(i);
            cache.add(i);
        }
        return output;
    }
}
