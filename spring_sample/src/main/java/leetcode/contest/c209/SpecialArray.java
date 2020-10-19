package leetcode.contest.c209;
/*
    Created By: Talveen Rakhra
    Created On: 04-10-2020 
    Question URL: https://leetcode.com/contest/weekly-contest-209/problems/special-array-with-x-elements-greater-than-or-equal-x/
    Time Taken: 
    Complexity: 
*/

import java.util.Arrays;

public class SpecialArray {
    public static void main(String[] args){
        SpecialArray sa = new SpecialArray();
        int[] nums = {3,5};
        System.out.println(sa.solve(nums));
    }

    private int solve(int[] nums) {
        Arrays.sort(nums);
        int  j =0; int n=-1;
        for(int i=1;i<=nums.length;i++){
            if(nums[i-1]>=i){
                j=nums.length-i+1;
                if(i==j){
                    n=i;
                }
            }
        }
        return n;
    }
}
