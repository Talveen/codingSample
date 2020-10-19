package leetcode.generalproblems.medium;
/*
    Created By: Talveen Rakhra
    Created On: 10-10-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

import java.util.Arrays;
import java.util.Comparator;

public class MinimumArrowsBurstBalloons {
    public static void main(String[] args){
        MinimumArrowsBurstBalloons mns = new MinimumArrowsBurstBalloons();
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(mns.findMinArrowShots(points));
    }

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        // sort by x_end
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int arrows = 1;
        int xStart, xEnd, firstEnd = points[0][1];
        for (int[] p : points) {
            xStart = p[0];
            xEnd = p[1];
            // if the current balloon starts after the end of another one,
            // one needs one more arrow
            if (firstEnd < xStart) {
                arrows++;
                firstEnd = xEnd;
            }
        }

        return arrows;

    }
}
