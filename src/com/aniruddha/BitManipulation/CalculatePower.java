package com.aniruddha.BitManipulation;

public class CalculatePower {
    public static void main(String[] args) {
        int power = 3;
        int base = 4;
        int ans = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            base *= base;
            power = power >> 1;

        }
        System.out.println(ans);
    }
}
