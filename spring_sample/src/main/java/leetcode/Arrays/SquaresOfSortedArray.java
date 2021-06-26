package leetcode.Arrays;/*
    Created By: Talveen Rakhra
    Created On: 24-05-2021
    Question URL:
    Time Taken:
    Complexity:
*/

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void main(String[] args) {
        SquaresOfSortedArray sq = new SquaresOfSortedArray();
        int[] nums = {-4,-1,0,3,10};
        System.out.println(sq.findSquares(nums).toString());
    }

    public int[] findSquares(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;
    }

}
