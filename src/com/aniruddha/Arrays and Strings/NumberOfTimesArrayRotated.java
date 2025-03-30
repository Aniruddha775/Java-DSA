package com.aniruddha.tcs;

public class NumberOfTimesArrayRotated {
    static int rotation(int[] arr){
        int low=0,high=arr.length-1;
        int index=-1;
        int ans=Integer.MAX_VALUE;

        while(low<=high){
            int mid=low+(high-low)/2;
            //if the array is not rotated
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    ans=arr[low];
                    index=low;
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    ans=arr[low];
                    index=low;
                }
                low=mid+1;
            }
            else{
                if(arr[mid]<ans){
                index=mid;
                ans=arr[mid];
                }
                high=mid-1;
            }

        }
    return index;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = rotation(arr);
        System.out.printf("The array is rotated %d times.",ans);
    }
}
