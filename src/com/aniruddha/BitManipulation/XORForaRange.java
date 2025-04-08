package com.aniruddha.BitManipulation;

public class XORForaRange {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        //xor from a to b= xor(b) ^ xor(a-1)
        int ans = xor(b) ^ xor(a - 1);
        System.out.println(ans);
    }

    // this will give xor from 0 to a
    static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }
        return 0;
    }
}
