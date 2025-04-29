package com.aniruddha.Arrays_and_Strings;

public class RemoveDuplicatesInPlace {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3,4,4,4};
        int k=removeDuplicates(arr);
        for (int i = 0; i < k; i++) {
           System.out.print(arr[i]+ " ");
        }

    }

    private static int removeDuplicates(int[] arr) {
        int i=0;
        for (int j = 1; j < arr.length ; j++) {
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return (i+1);
    }
}
