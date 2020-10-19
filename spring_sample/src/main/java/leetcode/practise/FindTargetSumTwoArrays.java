package leetcode.practise;
/*
    Created By: Talveen Rakhra
    Created On: 28-09-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTargetSumTwoArrays {
    public static void main(String[] args){
        FindTargetSumTwoArrays subArray = new FindTargetSumTwoArrays();
        int[] num1 = {-1,3,8,2,9,5};
        int[] num2= {4,1,2,10,5,20};
        System.out.println(subArray.sumSubArray(num1, num2));
    }

    public int sumSubArray(int[] num1, int[] num2){
        int best=0, sum=0;
        Set<Integer> set = new HashSet<Integer>();
        for (int v : num1) {
            set.add(v);
        }
        for(int i=0;i<num2.length;i++){
            sum =Math.max(num1[i], sum+num1[i]);
            best=Math.max(best,sum);
        }
        return best;
    }
}
