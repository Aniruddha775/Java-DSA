package com.aniruddha.tcs;

import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();

        while(t-->0){
            String pin=in.nextLine();
            int sum=0;
            for(char digit:pin.toCharArray()){
                sum+=Character.getNumericValue(digit);
            }
            if(sum%4==0)
                System.out.println("OPEN");
            else
                System.out.println("LOCKED");
        }

    }
}
