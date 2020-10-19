package leetcode.practise;
/*
    Created By: Talveen Rakhra
    Created On: 03-10-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

import java.util.*;
import java.util.stream.Collectors;

public class MaxNumSumWithSameDigitSum {
    public static void main(String[] args){
        MaxNumSumWithSameDigitSum mns = new MaxNumSumWithSameDigitSum();
        int[] numArr = {51,71,17,42};
        System.out.println(mns.solve(numArr));
    }

    private int solve(int[] numArr) {
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for(int i=0;i<numArr.length;i++){
            String number = String.valueOf(numArr[i]);
            int sumDigit=0;
            for(int k = 0; k < number.length(); k++) {
                int j = Character.digit(number.charAt(k), 10);
                sumDigit+=+j;
            }
            if(map.containsKey(sumDigit)){
                List<Integer> li = map.get(sumDigit);
                List<Integer> liNew = new ArrayList<Integer>();
                liNew.addAll(li);
                liNew.add(numArr[i]);
                map.put(sumDigit,liNew);
            }
            else{
                map.put(sumDigit, Arrays.asList(numArr[i]));
            }
        }
        int best=0, sum=0;
        for(Integer i : map.keySet()){
            List<Integer> li = map.get(i);
            sum=li.stream().collect(Collectors.summingInt(Integer::intValue));
            best=Math.max(best,sum);
        }
        return best;
    }
}
