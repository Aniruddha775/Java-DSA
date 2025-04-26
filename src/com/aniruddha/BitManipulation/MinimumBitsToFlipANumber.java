package com.aniruddha.BitManipulation;

public class MinimumBitsToFlipANumber {
    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
        //Basically we need to convert 10 to 7

        int ans = start ^ goal;
        int count = 0;
//        for (int i = 0; i < 32; i++) {
//
//            if ((ans & (1 << i)) != 0) { //counting the set bits only
//                count ++;//as it is int so max size is 32
//            }
//
//
//        }
        //or another way
        while(ans!=0){
            ans&=(ans-1);
            count++;
        }
        System.out.println(count);
    }
}
