package com.aniruddha.Arrays_and_Strings;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={3,1,4,5,2};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap with current index
            int lastIndex=arr.length-i-1;
            int max=getMaxIndex(arr,0,lastIndex);
            swap(arr,max,lastIndex);

        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for (int i = start; i <=end ; i++) {
            if(arr[max]<arr[i])
                max=i;

        }
        return max;
    }
}
