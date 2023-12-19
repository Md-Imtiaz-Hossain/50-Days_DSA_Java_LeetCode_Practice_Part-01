package com.iimtiaz.day_03;

import java.util.ArrayList;
import java.util.List;

public class FindSubArrays {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        List<List<Integer>> result = findAllSubarrays(nums);
        for (List<Integer> subarray : result) {
            System.out.println(subarray);
        }
    }

    public static List<List<Integer>> findAllSubarrays(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int size = 0; size <= nums.length; size++) {
            for (int start = 0; start + size <= nums.length; start++) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i < start + size; i++) {
                    subarray.add(nums[i]);
                }
                result.add(subarray);
            }
        }
        return result;
    }
}


//        In Java, the concept of a subarray usually refers to a contiguous sequence of elements within
//        an array. So, [-2, 1] and [1, -2] would be considered different subarrays because they
//        contain the same elements but in a different order.