package leetcode.numberwise;/*
    Created By: Talveen Rakhra
    Created On: 25-04-2021
    Question URL:https://leetcode.com/problems/longest-substring-without-repeating-characters/
    Time Taken:
    Complexity:
*/

import java.util.HashMap;
import java.util.Map;

public class Leetcode3 {

    public static void main(String[] args) {
        Leetcode3 leetcode3 =  new Leetcode3();
        String str = "pwwkew";
        System.out.println(leetcode3.lengthOfLongestSubstring(str));
    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int startIndex = 0;
        int maxLength = 0;
        for(int i=0; i<s.length(); i++) {
            if(!hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), i);
            } else {
                if(hm.get(s.charAt(i)) < startIndex) {
                    hm.put(s.charAt(i), i);
                } else {
                    maxLength = Math.max(i-startIndex, maxLength);
                    int index = hm.get(s.charAt(i));
                    startIndex = index+1;
                    hm.put(s.charAt(i), i);
                }
            }
        }
        return Math.max(s.length() - startIndex, maxLength);
    }

}
