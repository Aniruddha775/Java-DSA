package com.aniruddha.tcs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SumOfFibonacci {

//    With O(1) Space Complexity
    static int sumFib(int n){
        int sum=1,b=0,curr=1;
        if(n<=0){
            sum=0;
        }
        for (int i = 1; i <n ; i++) {
            int a=b;
            b=curr;
            curr=a+b;
            sum+=curr;
        }
        return sum;

    }

//    With O(n) Space Complexity
    static int sumFib2(int n){
        if (n<=0){
            return 0;
        }
        int[] fib=new int[n+1];
        fib[0]=0;
        fib[1]=1;

        int sum=fib[0]+fib[1];

        for (int i = 2; i < n+1; i++) {
            fib[i]=fib[i-1]+fib[i-2];
            sum+=fib[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(sumFib(n));
//        System.out.println(sumFib2(n));
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }

}