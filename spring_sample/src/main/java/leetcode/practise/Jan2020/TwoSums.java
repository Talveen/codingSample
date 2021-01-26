package leetcode.practise.Jan2020;
/*
    Created By: Talveen Rakhra
    Created On: 1/20/2021
    Question URL:
    Time Taken:
    Complexity:
*/

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args){
        int[] arr = {7,2,8,5};
        int sum=9;
        TwoSums ts = new TwoSums();
        ts.solve(arr, sum);
    }

    public void solve(int[] arr, int sum){
        Map<Integer, Integer> map = new HashMap();
        int[] result = new int[2];
        for(int i=0; i<arr.length; i++){
            int rem = sum - arr[i];
            if(map.containsKey(rem)){
                result[0] = map.get(rem);
                result[1] = i;
            }
            else{
                map.put(arr[i],i);
            }
        }
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
