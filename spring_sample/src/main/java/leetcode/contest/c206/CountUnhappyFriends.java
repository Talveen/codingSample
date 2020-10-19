package leetcode.contest.c206;
/*
    Created By: Talveen Rakhra
    Created On: 13-09-2020 
    Question URL: https://leetcode.com/contest/weekly-contest-206/problems/count-unhappy-friends/
    Time Taken: 
    Complexity: Medium
*/

import java.util.Arrays;

public class CountUnhappyFriends {
    public static void main(String[] args){
        CountUnhappyFriends countUnhappyFriends = new CountUnhappyFriends();
        int n = 4;
        int[][] preferences = {{1,2,3},{3,2,0},{3,1,0},{1,2,0}};
        int[][] pairs={{0,1},{2,3}};
        System.out.println(countUnhappyFriends.unhappyFriends(n, preferences, pairs));
    }

    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int count=0;

        return count;
    }
}
