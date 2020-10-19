package leetcode.generalproblems.easy;
/*
    Created By: Talveen Rakhra
    Created On: 10-09-2020 
    Question :  Given a pattern and a string str, find if str follows the same pattern.
                Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
                Example 1:
                Input: pattern = "abba", str = "dog cat cat dog"
                Output: true
    Time Taken: 
    Complexity: Mock Interview
*/

import java.util.*;

public class FollowPattern {
    public static void main(String[] args){

        //FollowPattern
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the pattern: ");
        String pattern = "abba"; //scanner.next();
        System.out.println("Enter the String ");
        String seq = "dog cat cat dfdog"; //scanner.next();
        FollowPattern followPattern = new FollowPattern();
        boolean result = followPattern.checkPattern(pattern,seq);
        System.out.println(result);
    }

    public boolean checkPattern(String pattern, String seq){
        boolean matches = true;

        List<String> patternList = new LinkedList<String>();
        for(int i =0; i < pattern.length(); i ++){
            patternList.add(String.valueOf(pattern.charAt(i)));
        }
        List<String> splitted = Arrays.asList(seq.split("\\s+"));
        if(splitted.size() != pattern.length())
            return false;
        Map<Character, String> mapper = new HashMap<Character, String>();
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            if(mapper.containsKey(ch)){
                String val = mapper.get(ch);
                if(!val.equals(splitted.get(i))){
                    matches = false;
                }
            }
            else if(mapper.containsValue(splitted.get(i))){
                matches = false;
            }
            else{
                mapper.put(ch, splitted.get(i));
            }
        }
        return matches;
    }
}
