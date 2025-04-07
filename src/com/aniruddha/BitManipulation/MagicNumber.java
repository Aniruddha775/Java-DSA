package com.aniruddha.BitManipulation;
import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();

        int base=5;
        int ans=0;
        while(n>0){
            int lastdigit=n & 1;
            n=n >> 1;
            ans+=lastdigit*base;
            base=base*5;
        }
        System.out.println(ans);
    }
}
