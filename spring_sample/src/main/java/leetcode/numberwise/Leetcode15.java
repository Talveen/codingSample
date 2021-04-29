package leetcode.numberwise;/*
    Created By: Talveen Rakhra
    Created On: 28-04-2021
    Question URL:https://leetcode.com/problems/3sum/
    Time Taken:
    Complexity:
*/

import java.lang.reflect.Array;
import java.util.*;

public class Leetcode15 {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Leetcode15 leetcode15 = new Leetcode15();
        List<List<Integer>> trip = leetcode15.solve(nums);
        System.out.println(trip);
    }

    public List<List<Integer>> solve(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> triplet = new ArrayList();
        Map<List<Integer>, Boolean> map = new HashMap();
        if (nums.length <=2) return triplet;
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> triple = new ArrayList(Arrays.asList(nums[i], nums[left], nums[right]));
                    if (!map.containsKey(triple)) {
                        map.put(triple, true);
                        triplet.add(triple);
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                }
            }
        }
        return triplet;
    }

}
