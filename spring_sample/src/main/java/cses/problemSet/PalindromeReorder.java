package cses.problemSet;/*
    Created By: Talveen Rakhra
    Created On: 28-06-2021
    Question URL:
    Time Taken:
    Complexity:
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromeReorder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder sb = new StringBuilder();
        int count=0;
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.merge(c, 1,Integer::sum);
        }
        for(char c : map.keySet()){
            if(map.get(c)%2==1){
                count++;
            }
        }
        if(count!=1){
            System.out.println("NO SOLUTION");
        }
        else{

        }

    }

}
