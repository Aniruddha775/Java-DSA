package com.aniruddha.BinarySearch;

public class FindSecondLargestElement {
    static int secondLargest(int[] arr){
        int largest=arr[0];
        int secondlargest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int[] arr={-1,2,-5,7,3,-8,9};
        System.out.println(secondLargest(arr));
    }
}
