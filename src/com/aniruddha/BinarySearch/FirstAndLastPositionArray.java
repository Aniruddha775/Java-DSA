package com.aniruddha.BinarySearch;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPositionArray {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static  int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=search(nums,target,false);
        }
        return ans;
    }
    static int search(int[] nums,int target,boolean findFirstIndex){
            int ans=-1;
            int start=0;
            int end=nums.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target) {
                    ans = mid;//potential answer found
                    if (findFirstIndex) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
                else if (target>nums[mid])
                    start=mid+1;
                else
                    end=mid-1;
            }
            return ans;
    }
}
