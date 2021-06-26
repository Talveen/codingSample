package cses.problemSet;/*
    Created By: Talveen Rakhra
    Created On: 10-06-2021
    Question URL:
    Time Taken:
    Complexity:
*/

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = 0;
        for(int i=0;i<n-1;i++){
            s = s + scanner.nextLong();
        }
        System.out.println(n*(n+1)/2-s);
    }


}
