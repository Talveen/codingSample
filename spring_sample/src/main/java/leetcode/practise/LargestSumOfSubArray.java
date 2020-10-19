package leetcode.practise;
/*
    Created By: Talveen Rakhra
    Created On: 27-09-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

public class LargestSumOfSubArray {

    public static void main(String[] args){
        LargestSumOfSubArray subArray = new LargestSumOfSubArray();
        int[] num = {-1,2,4,-3,5,2,-5,2};
        System.out.println(subArray.sumSubArray(num));
    }

    public int sumSubArray(int[] num){
        int best=0, sum=0;

        for(int i=0;i<num.length;i++){
            sum =Math.max(num[i], sum+num[i]);
            best=Math.max(best,sum);
        }
        return best;
    }
}
