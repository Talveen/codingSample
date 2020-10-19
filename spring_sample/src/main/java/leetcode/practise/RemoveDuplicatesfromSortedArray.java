package leetcode.practise;
/*
    Created By: Talveen Rakhra
    Created On: 26-09-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args){

        RemoveDuplicatesfromSortedArray sortedArray = new RemoveDuplicatesfromSortedArray();
        int[] nums =  {1,1,2,3,4,5,5};
        System.out.println(sortedArray.removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(int j=1;j<n;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
