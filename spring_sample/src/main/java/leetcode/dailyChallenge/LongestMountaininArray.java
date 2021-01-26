package leetcode.dailyChallenge;

/*
    Created By: Talveen Rakhra
    Created On: 16-11-2020
    Question URL:https://leetcode.com/problems/longest-mountain-in-array/
    Time Taken:
    Complexity:Medium
*/

public class LongestMountaininArray {
    public static void main(String[] args){
        LongestMountaininArray lm = new LongestMountaininArray();
        int[] A = {2,1,2,3,4,5,4,3,1,5};
        System.out.println(lm.solve(A));
    }

    private int solve(int[] A) {
        int curr=1; int best=0;
        for(int i=1; i<A.length;i++){
            if(A[i]>A[i-1]){
                curr++;
                continue;
            }
            else{
                if(curr==1){
                    continue;
                }
                else{
                    boolean flag=true;int k=curr;
                    for(int j=i; j<i+curr-1; j++){
                        if(A[j]>A[j-1]){
                            flag=false;
                            k++;
                        }
                    }
                    if(flag){
                        i=i+curr-1;
                        best = Math.max(best, curr*2-1);
                    }else{
                        if(k>curr){
                            i=i+curr-1;
                            best = Math.max(best, curr*2-1);
                        }
                    }
                }
            }
        }
        return best;
    }
}
