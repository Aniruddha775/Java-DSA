package com.aniruddha.Arrays_and_Strings;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/
public class MountainArray {
    public static void main(String[] args) {
    int[] arr={0,2,3,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) {
                end = mid;//descending part of array
            }else{
                start=mid+1;//ascending part of array
            }

        }
        return start;

    }
}
