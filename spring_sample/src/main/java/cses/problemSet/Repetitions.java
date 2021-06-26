package cses.problemSet;/*
    Created By: Talveen Rakhra
    Created On: 10-06-2021
    Question URL:https://cses.fi/problemset/task/1069
    Time Taken:
    Complexity:
*/

import java.util.Scanner;

public class Repetitions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seq = scanner.next();
        int count=1, max=0;
        char last = seq.charAt(0);
        for(int i=1;i<seq.length();i++){
            char curr = seq.charAt(i);
            if(curr==last){
                count++;
            }
            else{
                max = Math.max(count, max);
                count=1;
            }
            last=curr;
        }
        max = Math.max(count, max);
        System.out.println(max);
    }

}
