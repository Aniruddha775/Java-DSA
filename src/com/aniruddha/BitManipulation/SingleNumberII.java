package com.aniruddha.BitManipulation;
import java.util.Arrays;
public class SingleNumberII {
    public static void main(String[] args){
        int[] arr={5,5,5,6,3,3,3,4,4,4};
        System.out.println(singleNumber(arr));
        System.out.println(singleNumber2(arr));
    }
    private static int singleNumber(int[] arr){
        int ans=0;
        for (int i = 0; i < 32; i++) {
            int count=0;
            for (int k : arr) {
                if ((k & (1 << i)) != 0) {
                    count++;
                }
            }
            if(count % 3==1){
                ans=ans|(1<<i);
            }

        }
        return ans;
    }
    private static int singleNumber2(int[] arr){
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i+=3) {
            if(arr[i]!=arr[i-1]){
                return arr[i-1];
            }

        }
        return (arr[arr.length-1]);
    }
}
