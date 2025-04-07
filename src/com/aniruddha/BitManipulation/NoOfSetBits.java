package com.aniruddha.BitManipulation;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 8587678;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(checkBits(n));

    }

    private static int checkBits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
