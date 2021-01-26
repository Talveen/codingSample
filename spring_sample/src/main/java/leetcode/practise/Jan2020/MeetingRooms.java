package leetcode.practise.Jan2020;
/*
    Created By: Talveen Rakhra
    Created On: 1/26/2021
    Question URL: 
    Time Taken: 
    Complexity: 
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRooms {
    public static void main(String[] args){
        MeetingRooms meetingRooms = new MeetingRooms();
        int[][] intervals = {{0,30},{5,10},{15,20}};
        System.out.println(meetingRooms.solve(intervals));
    }

    private int solve(int[][] intervals) {
        if(intervals == null || intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });

        queue.add(intervals[0]);

        for(int i=1; i<intervals.length;i++){
            int[] curr = intervals[i];
            int[] prev = queue.poll();
            if(curr[0]<prev[1]){
                queue.add(curr);
                queue.add(prev);
            }
            else{
                prev[1]=curr[1];
                queue.add(prev);
            }
        }

        return queue.size();
    }
}
