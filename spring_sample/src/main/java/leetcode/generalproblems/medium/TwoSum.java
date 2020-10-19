package leetcode.generalproblems.medium;

import java.util.Arrays;
import java.util.Scanner;

/*
    Created By: Talveen Rakhra
    Created On: 07-09-2020
    Question URL: https://leetcode.com/problems/two-sum/
    Time Taken: 30min
    Compexity: Easy
*/
public class TwoSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter number at position "+i);
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter target value: ");
        int target = scanner.nextInt();
        int[] finalArr = twoSum(nums, target);
        System.out.println(Arrays.asList(finalArr));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] finalArr = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    finalArr[0]=i;
                    finalArr[1]=j;
                }
            }
        }
        return finalArr;
    }
}
