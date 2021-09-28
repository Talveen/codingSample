package cses.problemSet;/*
    Created By: Talveen Rakhra
    Created On: 27-06-2021
    Question URL:
    Time Taken:
    Complexity:
*/

import java.util.Scanner;

public class CoinPiles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n--!=0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if((a+b)%3==0 && 2*a>=b && 2*b>=a)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

}
