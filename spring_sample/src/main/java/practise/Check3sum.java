package practise;

import leetcode.interview.serviceNow.CheckSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/*
https://leetcode.com/problems/3sum/description/
 */
public class Check3sum {
    public static void main(String[] args) {
        Check3sum  c =  new Check3sum();
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        List<List<Integer>> listArr = c.solve(nums);
        System.out.println(listArr.toString());
    }

    private  List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> s = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            int left = i+1, right = n-1;
            while(left<=right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    s.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if (sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return s;
    }
}
