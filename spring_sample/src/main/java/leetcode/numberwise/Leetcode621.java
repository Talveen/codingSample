package leetcode.numberwise;/*
    Created By: Talveen Rakhra
    Created On: 08-05-2021
    Question URL:https://leetcode.com/problems/task-scheduler/
    Time Taken:
    Complexity:Medium
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode621 {

    public static void main(String[] args) {
        Leetcode621 leetcode621 = new Leetcode621();
        String[] arr = {"A","A","A","A","A","A","B","C","D","E","F","G"};
        int n=2;
        System.out.println(leetcode621.solve(arr, n));
    }

    public int solve(String[] arr, int n){
        int count = 1;
        /*StringBuilder sb = new StringBuilder();
        Map<String, Integer> strMap = new HashMap<>();
        for (String i : arr) {
            Integer j = strMap.get(i);
            strMap.put(i, (j == null) ? 1 : j + 1);
        }
        boolean flag = true;
        while(flag){
            for(String i : strMap.keySet()){
                if(strMap.get(i)!=0){
                    sb.append(i);
                    count++;
                    Integer j = strMap.get(i);
                    j--;
                    strMap.put(i, j);
                }
            }
        }*/
        List<String> list =  Arrays.asList(arr);
        String lastChar = arr[0];
        String secondlastChar = arr[0];
        list.remove(0);
        while(arr.length>0){
            for(int i=1; i<list.size(); i++){
                String currChar = list.get(i);
                if(currChar!=lastChar && currChar!=secondlastChar){
                    count++;
                    list.remove(i);
                    continue;
                }
                else{

                }
            }
        }
        return count;
    }

}
