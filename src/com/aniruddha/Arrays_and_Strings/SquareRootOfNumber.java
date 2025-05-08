package com.aniruddha.Arrays_and_Strings;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        int n=40;
        int precision=3;//decimal point precision
        System.out.printf("%.3f",sqrt(n,precision));
    }
    static double sqrt(int n,int p){
        //using binary search
        double root=0.0;
        int s=0;
        int e=n;
        while(s<e){
            int m=s+(e-s)/2;
            if(m*m==n){
                return m;//for perfect square
            }
            else if(m*m>n){
                e=m-1;
                root=e;
            }
            else{
                s=m+1;
            }
        }
        double increment=0.1;
        for (int i = 0; i < p; i++) {
            while(root*root<=n){
                root+=increment;
            }
            root-=increment;//if root is greater than n then we revert back to previous root
            increment/=10;//going to the next decimal place
        }
        return root;
    }
}
