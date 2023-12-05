package leetcode.interview.serviceNow;/*
    Created By: Talveen Rakhra
    Created On: 28-04-2021
    Question URL:
    Time Taken:
    Complexity:
*/

import java.util.*;

public class  CheckSumArray {

    public static void main(String[] args) {
        CheckSumArray cs = new CheckSumArray();
        int[] a = {-1,0,1,2,5};
        int[] b = {-1,-4,2,-2};
        int[] c = {-2,3,-3};
        List<List<Integer>> result = cs.solve(a,b,c);
        System.out.println(result.toString());

    }

    public List<List<Integer>> solve(int[] a,int[] b,int[] c){
        List<List<Integer>> result = new ArrayList<>();
        Map<List<Integer>, Boolean> map = new HashMap();
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                for(int k=0; k<c.length; k++){
                    int sum = a[i]+b[j]+c[k];
                    if(sum==0){
                        List<Integer> list = Arrays.asList(a[i],b[j],c[k]);
                        if(!map.containsKey(list)){
                            map.put(list, true);
                            result.add(list);
                        }
                    }
                }
            }
        }
        return result;
    }

}
