package leetcode.generalproblems.medium;
/*
    Created By: Talveen Rakhra
    Created On: 09-09-2020 
    Question URL: https://leetcode.com/problems/zigzag-conversion/
    Time Taken: 
    Complexity: Medium
*/

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ZigZagConversion {

    public String convert(String s, int numRows) {
        String result = "";
        List<String> splitted = Arrays.asList(s.split(""));
        String[][] matrix = new String[numRows][10];
        int i=0,j=0;
        Iterator<String> itr = splitted.iterator();
        while(itr.next()!=null){
            matrix[i][j]=itr.next();
            i++;
            if(i>=numRows)
                break;
        }

        return result;
    }
}
