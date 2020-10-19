package leetcode.practise;
/*
    Created By: Talveen Rakhra
    Created On: 22-09-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

import leetcode.contest.c206.SpecialPositionBinaryMatrix;

public class CasinoCoins {
    public static void main(String[] args){
        CasinoCoins coins = new CasinoCoins();
        int n= 18, k=2;
        System.out.println(coins.countTurns(n,k));
    }

    private int countTurns(int n, int k) {
        int counter=0;
        while(n!=1){
            if(k!=0 && n%2!=1){
                n=n/2; k=k-1;
                counter++;
            }
            else{
                n=n-1;
                counter++;
            }
        }
        return counter;
    }
}
