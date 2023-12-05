package practise;

import java.util.Arrays;

/*
Squares of a Sorted Array - https://leetcode.com/problems/squares-of-a-sorted-array/description/
 */
public class Leetcode977 {
    public static void main(String[] args) {
        Leetcode977 l = new Leetcode977();
        int[] nums = new int[] {-4,-1,0,3,10};
        System.out.println("With sorting");
        l.withSorting(nums);
        System.out.println("\nWithout sorting");
        l.withoutSorting(nums);
    }

    private void withoutSorting(int[] nums) {
        int left = 0, right = nums.length-1, index = nums.length-1;
        int[] res = new int[nums.length];
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                res[index] =   nums[left]*nums[left];
                left++;
            }
            else{
                res[index] =   nums[right]*nums[right];
                right--;
            }
            index--;
        }
        for(int j = 0; j <res.length; j++){
            System.out.print(res[j] + " ");
        }
    }

    private void withSorting(int[] nums){
        int[] res = new int[nums.length];

        for(int j = 0; j <nums.length; j++){
            res[j] = nums[j]*nums[j];
        }
        Arrays.sort(res);
        for (int j = 0; j <res.length; j++){
            System.out.print(res[j] + " ");
        }
    }

}
