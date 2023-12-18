package com.iimtiaz.day_02;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(new Solution_1().twoSum(nums, target)));
    }
}

/**
 Time complexity: O(n^2)
 O(1): Initializing variables like result.
 O(n * n): Nested loop iterates through each element of the array twice (n times for the outer loop and n times
           for the inner loop).
 O(1): Checking if i != j and comparing if nums[i] + nums[j] == target are both constant time operations.

 Space complexity: O(1)
 Only a few constant-size variables are used (e.g., i, j, result).
 */

class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        result = new int[]{i, j};
                    }
                }
            }
        }
        return result;
    }
}



// Note: 1. Return if no pair is found then not found, 2. If found multiple pair then return first pair and pair count,
// 3, If found then return all pair and pair count, 4. Assume for sorted array and unsorted array
// Keyword: array.length vs string.length()
// Learned: Arrays.toString(),
// Leetcode link: https://leetcode.com/problems/two-sum/