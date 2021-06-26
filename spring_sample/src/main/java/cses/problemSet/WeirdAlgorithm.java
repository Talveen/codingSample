package cses.problemSet;/*
    Created By: Talveen Rakhra
    Created On: 10-06-2021
    Question URL:https://cses.fi/problemset/task/1068
    Time Taken:
    Complexity:
*/

import java.util.Scanner;

public class WeirdAlgorithm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        WeirdAlgorithm wa = new WeirdAlgorithm();
        wa.solve(n);
    }

    public void solve(long n){
        System.out.print(n);
        if(n==1)
                return;
        while(n>1){
            if(n%2==0)
                n=n/2;
            else
                n=n*3+1;

            System.out.print(" "+n);
        }
    }

}
