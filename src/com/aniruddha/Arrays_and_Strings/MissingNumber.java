package com.aniruddha.Arrays_and_Strings;

//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1,2};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex])
                swap(nums, i, correctIndex);
            else
                i++;
        }
        //search for missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index)
                return index;


        }
        return nums.length;//if nothing is missing
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}

