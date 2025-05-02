package com.aniruddha.Arrays_and_Strings;

public class PrimesSieveOfErasthonesis {
    public static void main(String[] args) {
        int n=40;
        boolean[] primes=new boolean[n+1];
        sieve(n,primes);
    }

    //False in array means number is prime
    private static void sieve(int n, boolean[] primes) {
        for (int i = 2; i*i <=n ; i++) {
            if(primes[i]==false){
                for(int j=2*i;j<=n;j+=i){ //eliminating the multiples
                    primes[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(primes[i]==false){
                System.out.print(i+ " ");
            }
        }
    }
}
