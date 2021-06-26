package leetcode.Arrays;/*
    Created By: Talveen Rakhra
    Created On: 24-05-2021
    Question URL:
    Time Taken:
    Complexity:
*/

public class FindEvenNumberofDigits {

    public static void main(String[] args) {
        FindEvenNumberofDigits ones = new FindEvenNumberofDigits();
        int[] nums = {12,345,2,6,7896};
        System.out.println(ones.findEvenDigits(nums));
    }

    public int findEvenDigits(int[] nums) {
        int counter = 0;
        for(int i: nums){
            int j = (int) Math.log10(i)+1;
            //System.out.println(i+"-->"+j);
            if(j%2==0)
                counter++;
        }
        return counter;
    }

}
