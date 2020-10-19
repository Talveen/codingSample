package leetcode.generalproblems.medium;
/*
    Created By: Talveen Rakhra
    Created On: 11-10-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSquares {
    public static void main(String[] args){
        WordSquares wq =new WordSquares();
        String[] words = {"ball", "area", "lead", "lady"};
        System.out.println(wq.wordSquares(words));
    }

    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> op = new ArrayList<>();

        int lenWords = words[0].length();
        int numWords = words.length;

        String[][] sqArr = new String[lenWords][lenWords];
        String[][] sqArrTrans = new String[lenWords][lenWords];

        if(lenWords==numWords){
            for(int i=0;i<lenWords;i++){
                for(int j=0;j<lenWords;j++){
                    sqArr[i][j]=String.valueOf(words[i].charAt(j));
                }
            }
        }

        // transpose matrix
        for (int i = 0; i < lenWords; i++) {
            for (int j = 0; j < lenWords; j++) {
                sqArrTrans[i][j] = sqArr[j][i];
            }
        }

        if(sqArr==sqArrTrans){
            List<String> res = new ArrayList<>();
            for (int i = 0; i < lenWords; i++) {
                StringBuilder sb= new StringBuilder();
                for (int j = i; j < lenWords; j++) {
                    sb.append(sqArr[i][j]);
                }
                res.add(sb.toString());
            }
            op.add(res);
        }

        return op;
    }
}
