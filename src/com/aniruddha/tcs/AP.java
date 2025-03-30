package com.aniruddha.tcs;

import java.util.*;
public class AP{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();

        while(T-->0){
            String userInput=sc.nextLine();
            String[] values=userInput.split(" ");

            if(values.length<2){
                System.out.println("Invalid Input");
                continue;
            }
            int i=Integer.parseInt(values[0]);
            int j=Integer.parseInt(values[1]);

            if(i>=j||i<0||j>10000){
                System.out.println("Invalid Input");
            }
            else{
                System.out.print(getSum(i,j)+" ");
            }
        }
        sc.close();
    }
    public static int getSum(int i,int j){

        return ((j-i+1)*(i+j))/2;
    }
}
