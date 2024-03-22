package com.lc.practice.questionbank;

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
    static int suboptimalSolution(int input) {
        if (input == 0){
            return 0;
        }
        else if (input == 1){
            return 1;
        }
        else if (input == 2){
            return 1;
        }
        else{
            return suboptimalSolution(input-1) + suboptimalSolution(input-2);
        }
    }

    static int optimalSolution(int input) {
        return  0;
    }
}
