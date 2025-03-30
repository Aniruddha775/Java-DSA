package com.aniruddha.tcs;
import java.util.*;
public class TreasureHuntPath {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();

        while(t-->0){
            String moves=in.nextLine();
            int x=0,y=0;

            for(char move:moves.toCharArray()){
                if(move=='U') y++;
                else if(move=='D') y--;
                else if(move=='L') x--;
                else if(move=='R') x++;
            }
            System.out.println(x+" "+y);
        }

    }
}

