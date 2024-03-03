package com.lc.practice.questionbanksolutions;
/*
You are given a sorted array of integer and a number to find

Return a boolean true if number is found in array
Return a boolean false if number is not found in array

Example 1
Input: nums = [1,2,3,4,5] 3
Output: true
Explanation: 3 is in position 2 of the array

Example 2
Input: nums = [1,2,3,4,5] 6
Output: false
Explanation: 6 is not in the input array
 */
public class FindInSortedArray {
    public static boolean suboptimalSolution(int[] input, int find) {
        for (int j : input) {
            if (j == find) return true;
        }
        return false;
    }

    public static boolean optimalSolution(int[] input, int find) {
        return  optimalSolutionHelper(input, find, 0, input.length - 1);
    }

    static boolean optimalSolutionHelper(int[] input, int find, int low, int high) {
        if (low > high) return false;
        int mid = (low + high) / 2;
        if (input[mid] == find) return true;
        else if (input[mid] > find) return optimalSolutionHelper(input, find, low, mid - 1);
        return optimalSolutionHelper(input, find, mid + 1, high) ;
    }
}
