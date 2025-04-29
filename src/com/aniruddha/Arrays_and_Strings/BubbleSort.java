package com.aniruddha.Arrays_and_Strings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={70,-10,-8,-4,4};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void bubblesort(int[] arr){
        boolean swapped=false;//checker to see whether the array is already sorted or not
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
                break;

        }
    }
}
