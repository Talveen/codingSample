package leetcode.generalproblems.medium;
/*
    Created By: Talveen Rakhra
    Created On: 05-10-2020 
    Question URL: https://leetcode.com/problems/remove-covered-intervals/
    Time Taken: 
    Complexity: Medium
*/

import java.util.Arrays;
import java.util.Comparator;

public class RemoveCoveredIntervals {
   /* public static void main(String[] args){
        RemoveCoveredIntervals
        int[][] intervals = {{1,4},{3,6},{2,8}};

    }

    public int removeCoveredIntervals(int[][] intervals) {
        int ans = intervals.length;
        Arrays.sort(intervals, new Comparator<int []>(){
            public int compare(int a[], int b[]){
                if(a[0] == b[0])
                    return b[1] - a[1];
                return a[0] - b[0];
            }
        });
        int maxEnd = 0;
        for(int[] interval : intervals){
            if(interval[1] <= maxEnd){
                ans--;
            }
            maxEnd = Math.max(maxEnd, interval[1]);
        }
        return ans;
    }
}*/
}
