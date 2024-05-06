package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3,4};
//        int[] nums = {0, 1, 2, 3, 4};
//        int[] nums = {0, 0, 1};
        removeDuplicates(nums);
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;

        int start = 0;
        int end = start;
        while (start < nums.length - 1) {
            while (end < nums.length - 1 && nums[end] == nums[end + 1]) {
                end++;
            }
            if (end == nums.length-1) break;
            nums[start + 1] = nums[end + 1];
            start = start + 1;
            end = end + 1;
        }
        int j = 0;
        int count = 1;
        while (j < nums.length - 1 && nums[j] <= nums[j + 1]) {
            count++;
            j++;
        }
        return count;
    }
}