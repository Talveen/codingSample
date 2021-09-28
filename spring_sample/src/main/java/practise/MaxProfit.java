package practise;/*
    Created By: Talveen Rakhra
    Created On: 23-09-2021
    Question URL:
    Time Taken:
    Complexity:
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxProfit {

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        List<Integer> nums = new ArrayList<Integer>();
        nums.addAll(Arrays.asList(71, 45, 55, 70, 67, 43));
        //maxProfit.solveSingle(nums);
        maxProfit.test();
    }

    private void solve(List<Integer> nums) {
        int max=0;
        int buy=0, sell=0;
        for(int i = 0; i<nums.size(); i++){
            for(int j = i+1; j<nums.size(); j++){
                if(nums.get(i)<nums.get(j)){
                    if(max<nums.get(j)-nums.get(i)){
                        max = nums.get(j)-nums.get(i);
                        buy=i+1; sell=j+1;
                    }
                }
            }
        }
        System.out.println(max+" "+buy+" "+sell);
    }

    private void solveSingle(List<Integer> nums) {
        int max=0, min=nums.get(0);
        int buy=0, sell=0;
        for(int i = 1; i<nums.size(); i++){
            if(min<nums.get(i)){
                min=nums.get(i);
                max=Math.max(max,nums.get(i)-min);
            }
        }
        System.out.println(max);
    }

    private void test(){
        for(int i =1;i<=20;i++){
            if((i/10)%2==0)
            {
                System.out.print(i +" ");
            }
            else{
                System.out.print(i +" ");
                System.out.println(" ");
                int j=i+9; //20
                while(j!=i){
                    System.out.print(j +" ");
                    j--;
                }
                i=i+9;
                System.out.println(" ");
            }
        }
    }

}
