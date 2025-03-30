package com.aniruddha.tcs;

import java.util.*;

public class MostRepeatingCharacter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input=in.nextLine();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<input.length();i++){
            map.put(input.charAt(i),map.getOrDefault(input.charAt(i),0)+1);
        }
        char ch1=' ',ch2=' ';
        boolean b=true;

        for(Character s:map.keySet()){
            if(b && map.get(s)==1){
                b=false;
                ch1=s;
            }
            else{
                if(map.get(s)>map.getOrDefault(ch2,0)){
                    ch2=s;

                }
            }
        }
if(b){
    System.out.println("None "+ch2);

}
else{
    System.out.print(ch1+" "+ch2);
}
    }
}
