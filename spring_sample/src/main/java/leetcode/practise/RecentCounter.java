package leetcode.practise;
/*
    Created By: Talveen Rakhra
    Created On: 04-10-2020 
    Question URL: https://leetcode.com/problems/number-of-recent-calls/
    Time Taken: 30m
    Complexity: Easy
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class RecentCounter {
    Deque deque = null;

    public static void main(String[] args){
        RecentCounter rc = new RecentCounter();
        System.out.println(rc.ping(1));
        System.out.println(rc.ping(100));
        System.out.println( rc.ping(3000));
        System.out.println(rc.ping(3001));
        System.out.println(rc.ping(3002));

    }
    public RecentCounter() {
        deque = new ArrayDeque();
    }

    public int ping(int t) {
        deque.addLast(t);

        while((Integer)deque.peek()<t-3000){
            deque.removeFirst();
        }
        return deque.size();
    }

}
