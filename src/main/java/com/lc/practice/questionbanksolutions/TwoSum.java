package com.lc.practice.questionbanksolutions;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/two-sum/description/
You are given an array of integer and a target sum of 2 integers

Return a boolean true if two sum found
Return a boolean false if two sum not found

Example 1
Input: nums = [1,2,3,4,5] 3
Output: true
Explanation: 3 is in position 2 of the array

Example 2
Input: nums = [1,2,3,4,5] 1
Output: false
Explanation: no two numbers in the array add up to 1
 */
public class TwoSum {
    public static boolean suboptimalSolution(int[] input, int sum) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == sum) return true;
            }
        }
        return false;
    }

    public static boolean optimalSolution(int[] input, int sum) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i : input) {
            cache.put(i, cache.getOrDefault(i, 1));
        }
        for (int i : input) {
            int target = sum - i;
            if (i == target && cache.containsKey(target) && cache.get(target) > 1) return true;
            else if (cache.containsKey(target)) return true;
        }
        return  false;
    }
}
