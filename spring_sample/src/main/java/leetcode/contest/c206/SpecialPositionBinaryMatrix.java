package leetcode.contest.c206;
/*
    Created By: Talveen Rakhra
    Created On: 13-09-2020 
    Question URL: https://leetcode.com/contest/weekly-contest-206/problems/special-positions-in-a-binary-matrix/
    Time Taken: 
    Complexity: Easy
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialPositionBinaryMatrix {
    public static void main(String[] args){
        SpecialPositionBinaryMatrix specialPositionBinaryMatrix = new SpecialPositionBinaryMatrix();
        int[][] mat = {{1,0,0},{0,0,1},{1,0,0}};
        System.out.println(specialPositionBinaryMatrix.countSpecial(mat));
    }

    private int countSpecial(int[][] mat) {
        int finalans=0;
        for(int i=0;i<mat.length;i++){
            int count=0;
            int l =0, m=0;
            for(int j =0; j<mat[i].length; j++){
                if(mat[i][j]==1){
                    count++; l=j; m=i;
                }
            }
            if(count==1){
                for(int k=0;k<mat.length;k++){
                    if(k!=m && mat[k][l]==1){
                        count++;
                    }
                }
            }
            if(count==1){
                finalans++;
            }
        }
        return finalans;
    }
}
