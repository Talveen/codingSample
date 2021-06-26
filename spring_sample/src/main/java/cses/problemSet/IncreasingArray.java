package cses.problemSet;/*
    Created By: Talveen Rakhra
    Created On: 10-06-2021
    Question URL:https://cses.fi/problemset/task/1094/
    Time Taken:
    Complexity:
*/

import java.util.Scanner;

public class IncreasingArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long max=0,sum=0;
        for(int i=0;i<n;i++){
            long j = scanner.nextLong();
            max=Math.max(max,j);
            sum = sum + max-j;
        }
        System.out.println(sum);
    }

}
