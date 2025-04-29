package com.aniruddha.Arrays_and_Strings;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={3,1,4,5,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {//or i<=arr.legnth-2
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
                else
                    break;

            }
        }
    }
}
