package com.aniruddha.Arrays_and_Strings;
import java.util.ArrayList;
public class FactorsofNumber {
    public static void main(String[] args){
        factors(36);
        System.out.println();
        factors2(36);
    }
    static void factors(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");//ignoring  the duplicate roots
                }
                else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }
    //Now for printing in sorted order
    static void factors2(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");//ignoring  the duplicate roots
                }
                else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }

            }

        }
        //list will store value in descending order
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i)+" ");

        }
    }
}
