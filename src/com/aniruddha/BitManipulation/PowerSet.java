package com.aniruddha.BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    // Function to generate all subsets of
    // the input array using bitwise operators
    public static List<List<Integer>> getPowerSet(List<Integer> nums) {
        // Get the size of the input array
        int n = nums.size();
        // Calculate the total number of
        // subsets using bitwise left
        // shift operator
        int subsets = 1 << n;
        // Initialize a list
        // to store all subsets
        List<List<Integer>> ans = new ArrayList<>();

        // Iterate through all numbers
        // from 0 to subsets - 1
        for (int num = 0; num < subsets; num++) {
            // Initialize a list to
            // store the current subset
            List<Integer> subset = new ArrayList<>();

            // Iterate through each bit
            // position in the current number
            for (int i = 0; i < n; i++) {
                // Check if the ith bit of
                // the current number is set
                if ((num & (1 << i)) != 0) {
                    // If the bit is set, add the
                    // corresponding element from
                    // the input array to the subset
                    subset.add(nums.get(i));
                }
            }

            // Add the current subset
            // to the list of subsets
            ans.add(subset);
        }

        // Return the list
        // of all subsets
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 7, 8);
        List<List<Integer>> subsets = getPowerSet(nums);

        System.out.print("Initial Input Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Subsets: ");
        for (List<Integer> subset : subsets) {
            System.out.print("[ ");
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }
}

