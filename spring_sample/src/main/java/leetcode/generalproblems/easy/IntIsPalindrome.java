package leetcode.generalproblems.easy;
/*
    Created By: Talveen Rakhra
    Created On: 12-09-2020 
    Question URL: https://leetcode.com/problems/palindrome-number/
    Time Taken: 
    Complexity: Easy
*/

public class IntIsPalindrome {
    public static void main(String[] args){
        IntIsPalindrome intIsPalindrome = new IntIsPalindrome();
        int n=121;
        System.out.println(intIsPalindrome.isPalindrome(n));
    }

    public boolean isPalindrome(int x){
        boolean result = false;
        String xStr = String.valueOf(x);
        StringBuilder sb = new StringBuilder(xStr.length());
        for(int i = xStr.length()-1; i>=0; i--){
            sb.append(xStr.charAt(i));
        }
        if(xStr.equals(sb.toString())){
            result = true;
        }
        return result;
    }
}
