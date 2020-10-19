package leetcode.generalproblems.easy;
/*
    Created By: Talveen Rakhra
    Created On: 11-09-2020 
    Question URL: https://leetcode.com/problems/reverse-integer/
    Time Taken: 30min
    Complexity: Easy
*/

public class ReverseInteger {
    public static void main(String[] agrs){
        ReverseInteger reverseInteger = new ReverseInteger();
        int n = 123;
        System.out.println(reverseInteger.reversed(n));
    }

    public int reversed(int n){
        int val = 0;
        boolean minus = false;
        if(n < 0){
            n = n * -1;
            minus = true;
        }
        String value = String.valueOf(n);
        StringBuilder sb = new StringBuilder(value.length());
        for(int i=value.length()-1; i>=0; i--){
            sb.append(value.charAt(i));
        }
        val = Integer.parseInt(sb.toString());
        if(minus){
            val = -val;
        }
        return val;
    }
}
