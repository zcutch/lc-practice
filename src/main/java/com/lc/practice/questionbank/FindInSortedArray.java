package com.lc.practice.questionbank;

/*
https://www.geeksforgeeks.org/binary-search/
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
    static boolean suboptimalSolution(int[] input, int find) {
        for (i : input){
            if (i == find){
                return true;
            }
        }
        return false;
    }
    static boolean splitter(int[] input, int find, int low, int high){
        if (high < low ){
            return false;
        }
        int mid =  (high + low)/ 2;
        
        if input[mid] == find{
            return true;
        }
        if input[mid] < find{
            return splitter(input, find, mid+1, high)
        }
        if input[mid] > find{
            return splitter(input, find, low, mid-1)
        }
    }
    static boolean optimalSolution(int[] input, int find) {
        
        return  splitter(input, find, 0, input.length-1);
    }
}
