package com.iimtiaz.day_03;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSubArraySum(nums));

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // Generate all combinations
        for (int i = 0; i < nums.length; i++) {

            // This will store all combination one by one
            ArrayList<ArrayList<Integer>> temp = new ArrayList<>();

            for (ArrayList<Integer> a : result) {
                temp.add(new ArrayList<>(a));
            }

            // Add {nums[i]} to all existing combinations
            for (ArrayList<Integer> a : temp) {
                a.add(nums[i]);
            }

            // Add {nums[i]} as a single element combination
            ArrayList<Integer> single = new ArrayList<>();
            single.add(nums[i]);
            temp.add(single);

            result.addAll(temp);
        }

        // Print all combinations
        for (ArrayList<Integer> a : result) {
            //System.out.println(a);
        }
    }
    public static int maxSubArraySum(int[] nums) {
        // Initialize variables
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Iterate through the array
        for (int i = 1; i < nums.length; i++) {
            // Update current sum based on current element and previous sum
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maximum sum if current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum sum
        return maxSum;
    }


}


class Solution_1 {
    public int maxSubArray(int[] nums) {


        return 1;
    }
}