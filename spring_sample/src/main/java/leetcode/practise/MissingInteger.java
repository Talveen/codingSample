package leetcode.practise;
/*
    Created By: Talveen Rakhra
    Created On: 02-10-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

import java.util.*;

public class MissingInteger {
    public static void main(String[] args) {
        MissingInteger missingInteger = new MissingInteger();
        int[] num = {1,2};
        System.out.println(missingInteger.solve(num));
    }

    private int solve(int[] nums) {
        Arrays.sort(nums);
        int num=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num)
                ++num;
        }
        return num;
    }
}
