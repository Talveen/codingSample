package cses.problemSet;/*
    Created By: Talveen Rakhra
    Created On: 10-06-2021
    Question URL:
    Time Taken:
    Complexity:
*/

import java.util.Scanner;

public class Permuatations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if(n==1)
            System.out.println("1");
        else if(n==2||n==3)
            System.out.println("NO SOLUTION");
        else{
            if(n%2==0){
                for(int i=2;i<=n;i=i+2){
                    System.out.print(i+ " ");
                }
                for(int i=1;i<=n-1;i=i+2){
                    System.out.print(i+ " ");
                }
            }
            else{
                for(int i=2;i<=n-1;i=i+2){
                    System.out.print(i+ " ");
                }
                for(int i=1;i<=n;i=i+2){
                    System.out.print(i+ " ");
                }
            }
        }

    }

}
