package leetcode.generalproblems.medium;
/*
    Created By: Talveen Rakhra
    Created On: 02-10-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

public class ContainerWithMostWater {

    public static void main(String[] args){
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] num = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater.sumSubArray(num));
    }

    public int sumSubArray(int[] num){
        int best=0;
        for(int i=0;i<num.length;i++){
            for(int j = i+1;j<num.length;j++){
                    best =Math.max(best, num[i]<num[j]?num[i]*(j-i):num[j]*(j-i));
            }
        }
        return best;
    }
}
