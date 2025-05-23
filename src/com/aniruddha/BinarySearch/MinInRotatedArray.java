package com.aniruddha.BinarySearch;

public class MinInRotatedArray {
    static int findMin(int[] arr){
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                // keep the minimum:
                ans = Math.min(ans, arr[low]);

                // Eliminate left half:
                low = mid + 1;

            } else { //if right part is sorted:

                // keep the minimum:
                ans = Math.min(ans, arr[mid]);

                // Eliminate right half:
                high = mid - 1;
            }
        }
        return ans;

    }
    public static void main(String[] args){
        int[] arr={3,1,2};
        System.out.println(findMin(arr));
    }
}
