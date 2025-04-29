package com.aniruddha.Arrays_and_Strings;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,8,9,14,15,17,20};
        int target=2;
        System.out.println(Binarysearch(arr,target));
    }
    static int Binarysearch(int[] arr,int target){
       int start=0;
       int end=arr.length-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(arr[mid]==target)
               return mid;
           else if (target>arr[mid])
               start=mid+1;
           else
               end=mid-1;
       }
       return -1;
    }
}
