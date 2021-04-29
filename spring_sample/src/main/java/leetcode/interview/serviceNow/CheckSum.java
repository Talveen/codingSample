package leetcode.interview.serviceNow;/*
    Created By: Talveen Rakhra
    Created On: 28-04-2021
    Question URL:
    Time Taken:
    Complexity:
*/


import java.util.*;

public class CheckSum {

    public static void main(String[] args) {
        CheckSum cs = new CheckSum();
        int[] nums = {-1,0,1,2,-1,-4,-5,2,3};
        List<List<Integer>> result = cs.solve(nums);
        System.out.println(result.toString());
    }

    public List<List<Integer>> solve(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Map<List<Integer>, Boolean> map = new HashMap();
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> list = Arrays.asList(nums[i],nums[left],nums[right]);
                    if(!map.containsKey(list)){
                        map.put(list, true);
                        result.add(list);
                    }
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else if(sum>0){
                    right--;
                }
            }
        }
        return result;
    }
}
