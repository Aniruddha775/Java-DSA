package com.aniruddha.BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,8,9,14,15,17,20};
        int target=10;
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if (target>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return arr[end];
    }

}
