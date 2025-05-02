package com.aniruddha.BinarySearch;
//https://leetcode.com/problems/split-array-largest-sum/description/

public class SpiltArrayLargestSum {
    public static void main(String[] args) {
    int[] nums={7,2,5,10,8};
    int k=2;
        System.out.println(splitArray(nums,k));
    }
    public static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;//minimum no. of subarray is 1
            for (int i :nums) {
                if(sum+i>mid) {//cannot add this in the subarray so we make a new subarray
                    sum = i;
                    pieces++;//calculate no of subarray
                }
                else
                    sum+=i;
            }
            if(pieces>k)
                start=mid+1;
            else
                end=mid;
        }
        return end;// we can return start also as end==start here at the end.
    }
}
