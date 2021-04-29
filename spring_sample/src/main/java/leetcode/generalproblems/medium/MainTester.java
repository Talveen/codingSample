package leetcode.generalproblems.medium;
/*
    Created By: Talveen Rakhra
    Created On: 09-09-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainTester {
    public static void main(String[] args){

       /* //ZigZagTester
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = "PAYPALISHIRING"; //scanner.next();
        System.out.println("Enter number of rows ");
        int rows = 5; //scanner.nextInt();
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert(s,rows);
        System.out.println(result);
*/
      /* int l= 14, n=3;
        int fullV = l/(n+(n-2));
        int remaining = l%(n+(n-2));
        int fullCol = remaining/n;
        int fullColMod = remaining%n;
        int singlerows = fullV*(n-2);
        int finalrow = fullV + fullCol+fullColMod/n+singlerows;
        System.out.println(finalrow);
        System.out.println(Integer.MAX_VALUE);*/
        Map<Integer, Integer> map = new HashMap<>(3);
        System.out.println(map.size());
    }
}
