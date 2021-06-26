package leetcode.Arrays;/*
    Created By: Talveen Rakhra
    Created On: 21-05-2021
    Question URL:
    Time Taken:
    Complexity:
*/

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        MaxConsecutiveOnes ones = new MaxConsecutiveOnes();
        int[] nums = {1,1,0,1,1,1};
        System.out.println(ones.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int last = nums[0];
        int counter=0;
        int max=0;
        if(last==1){
            counter=1;max=1;
        }
        for(int i=1;i<nums.length;i++){
            int currentNum = nums[i];
            if(last==1 && currentNum==1 && last==currentNum){
                counter++;
            }
            else{
                max=Math.max(max, counter);
                if(currentNum==1){
                    counter=1;
                }
            }
            last=currentNum;
        }
        max=Math.max(max, counter);
        return max;
    }

}
