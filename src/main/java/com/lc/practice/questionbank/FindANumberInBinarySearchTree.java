package com.lc.practice.questionbank;

/*
You are given a Treenode

Return if you find a value in a bst

Example 1
Input: nums = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = F(1) + F(0) + F(1)

Example 2
Input: nums = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = F(2) + F(1) + F(2) = F(1) + F(0) + F(1) + F(2) = F(1) + F(0) + F(1) + F(1) + F(0)
 */
public class FindANumberInBinarySearchTree {
    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    private boolean suboptimalSolution(TreeNode input, int find) {
        return false;
    }

    private boolean optimalSolution(TreeNode input, int find) {
        return  false;
    }
}
