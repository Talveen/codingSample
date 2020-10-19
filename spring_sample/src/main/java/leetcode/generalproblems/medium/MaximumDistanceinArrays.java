package leetcode.generalproblems.medium;
/*
    Created By: Talveen Rakhra
    Created On: 07-10-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

import java.util.*;
import java.util.stream.Collectors;

public class MaximumDistanceinArrays {
    public static void main(String[] args){
        MaximumDistanceinArrays mda = new MaximumDistanceinArrays();
        List<List<Integer>> arrays = Arrays.asList(Arrays.asList(1,4),Arrays.asList(0,5));
        System.out.println(mda.maxDistance(arrays));
    }

    public int maxDistance(List<List<Integer>> arrays) {
        TreeSet<Integer> set = new TreeSet<>();
        for(List<Integer> list : arrays){
            set.addAll(list.stream().collect(Collectors.toSet()));
        }
        return set.last() - set.first();
    }
}
