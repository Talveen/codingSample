package leetcode.generalproblems.medium;
/*
    Created By: Talveen Rakhra
    Created On: 08-09-2020
    Question URL: https://leetcode.com/problems/longest-substring-without-repeating-characters/
    Time Taken: 
    Complexity: Medium
*/

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args){
        LongestSubstringWithoutRepeatingChars repeatingChars = new LongestSubstringWithoutRepeatingChars();
        String s = "abcabcbb";
        int len = repeatingChars.lengthOfLongestSubstring(s);
        System.out.println(len);
    }

    public int lengthOfLongestSubstring(String s) {
       int len = 0;
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<s.length();i++){
           if(!sb.toString().contains(String.valueOf(s.charAt(i)))){
               sb.append(String.valueOf(s.charAt(i)));
           }
           else{
               while(sb.toString().contains(String.valueOf(s.charAt(i)))){
                   sb.deleteCharAt(0);
               }
               sb.append(String.valueOf(s.charAt(i)));
           }
           if(sb.toString().length()>len){
               len=sb.toString().length();
           }
       }
       return len;
    }
}
