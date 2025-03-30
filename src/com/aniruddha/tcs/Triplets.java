package com.aniruddha.tcs;
import java.util.*;
public class Triplets {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int P=in.nextInt();
            int Q=in.nextInt();
            int R=in.nextInt();
            System.out.println(minSteps(P,Q,R));
        }
        in.close();
    }

    public static int minSteps(int p, int q, int r) {
        int[] arr={p,q,r};
        Arrays.sort(arr);
        if(arr[0]==arr[1] && arr[1]==arr[2]){
            return 0;
        }
        int steps=0;
        while(true){
            arr[0]+=1;
            arr[1]+=1;
            arr[2]-=1;
            steps++;
            Arrays.sort(arr);

            if(arr[0]==arr[1] && arr[1]==arr[2]){
                return steps;
            }

            if(arr[0]==arr[1] && arr[1]+1==arr[2] || arr[1]==arr[2] && arr[0]+1==arr[1]){
                return -1; //base condition
            }
        }
    }
}
