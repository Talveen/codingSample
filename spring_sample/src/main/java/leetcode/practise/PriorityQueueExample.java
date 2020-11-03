package leetcode.practise;
/*
    Created By: Talveen Rakhra
    Created On: 13-10-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args){
        PriorityQueueExample pq = new PriorityQueueExample();
        int nums[] = {1,23,89,5,6,78,54,569,62,154,100,998,997};
        int k = 2;
        System.out.println(pq.solve(nums, k));

    }

    private int solve(int[] nums, int k) {
        //Min heap
        PriorityQueue<Integer> q = new PriorityQueue<>();
        //Max heap
        PriorityQueue<Integer> q1 = new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums){
            q.add(n);
            if(q.size()>k){
               q.poll();
            }
        }
        return q.poll();
    }
}
