package com.lc.practice.questionbanksolutions;

import java.util.HashMap;
import java.util.Map;
/*
https://leetcode.com/problems/fibonacci-number/description/
You are given a integer >= 0

Return the Fibonacci number of the input

Example 1
Input: nums = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = F(1) + F(0) + F(1)

Example 2
Input: nums = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = F(2) + F(1) + F(2) = F(1) + F(0) + F(1) + F(2) = F(1) + F(0) + F(1) + F(1) + F(0)
 */
public class Fibonacci {
    // O(n!) recursive
    public static int suboptimalSolution(int input) {
        if (input == 1) return 1;
        else if (input == 0) return 0;
        return suboptimalSolution(input - 1) + suboptimalSolution(input - 2);
    }

    public static int optimalSolution(int input) {
        return optimalSolutionHelper(input, new HashMap<>());
    }

    // O(n) recursive with memoization
    static int optimalSolutionHelper(int input, Map<Integer, Integer> cache) {
        if (input == 1) return 1;
        else if (input == 0) return 0;
        else if (cache.containsKey(input)) return cache.get(input);
        int solution = optimalSolutionHelper(input - 1, cache) + optimalSolutionHelper(input - 2, cache);
        cache.put(input, solution);
        return solution;
    }
}
