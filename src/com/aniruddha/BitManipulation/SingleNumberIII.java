package com.aniruddha.BitManipulation;
import java.util.*;
public class SingleNumberIII {
    static List<Integer> singleNumber(int[] nums){
        int xorr=0;
        for (int i = 0; i < nums.length; i++) {
            xorr=xorr^nums[i];

        }
        int rightmost;
        if(xorr==Integer.MIN_VALUE)
            rightmost=Integer.MIN_VALUE;
        else
            rightmost=(xorr&(xorr-1))^xorr;
        int bucket1=0,bucket2=0;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i]& rightmost)!=0)
                bucket1=bucket1^nums[i];
            else
                bucket2=bucket2^nums[i];
        }
        List<Integer> ans=new ArrayList<>();
        ans.add(bucket1);
        ans.add(bucket2);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 1, 3, 2, 5};
        List<Integer> result=singleNumber(arr);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
