package leetcode.practise;
/*
    Created By: Talveen Rakhra
    Created On: 28-09-2020 
    Question URL: https://codeforces.com/problemset/problem/71/A
    Time Taken: 
    Complexity: 
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args){

        WayTooLongWords words = new WayTooLongWords();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> allWords= new ArrayList<String>();
        for(int i = 0; i<n; i++){
            allWords.add(scanner.next());
        }
        words.processWords(allWords);
    }

    private void processWords(List<String> allWords) {
        for(int j=0; j<allWords.size();j++){
            String ss = allWords.get(j);
            if(ss.length()>10){
                ss = ss.substring(0,1)+String.valueOf(ss.length()-2)+ss.substring(ss.length()-1);
            }
            System.out.println(ss);
        }
    }
}
