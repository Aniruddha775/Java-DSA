package com.aniruddha.Arrays_and_Strings;

public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target=10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        //First start with box size of 2
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;//double the box size end=previous end+ sizeofbox*2
            start=newStart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
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
