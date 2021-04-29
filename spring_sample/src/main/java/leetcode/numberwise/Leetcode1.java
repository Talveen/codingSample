package leetcode.numberwise;
/*
    Created By: Talveen Rakhra
    Created On: 25-04-2021
    Question URL:https://leetcode.com/problems/two-sum/
    Time Taken:
    Complexity:
*/

import java.util.HashMap;
import java.util.Map;

public class Leetcode1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Leetcode1 leetcode1 = new Leetcode1();
        //O(n) TIme complexity
        int[] output = leetcode1.optimal(nums, target);
        System.out.println(output[0]+" "+output[1]);
        //O(n2) Time complexity
        int[] output2 = leetcode1.bruteForce(nums, target);
        System.out.println(output2[0]+" "+output2[1]);
    }

    public int[] optimal(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no two sum found");
    }
    public int[] bruteForce(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
    }
}
