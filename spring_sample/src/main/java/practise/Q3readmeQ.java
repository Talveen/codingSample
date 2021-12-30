package practise;/*
    Created By: Talveen Rakhra
    Created On: 03-12-2021
    Question URL: Median of two sorted arrays
    Time Taken:
    Complexity:
*/

import java.util.*;

class Q3readmeQ {

    public static void main(String[] args)
    {
        int A[] = { -5,3,6,12,15 };
        int B[] = { -12,10,-6,-3,4,10 };
        Q3readmeQ q = new Q3readmeQ();
        System.out.println(q.findMedian(A,B));
    }

    private double findMedian(int[] a, int[] b) {
        int n=a.length, m=b.length;
        if(n>m)
            return findMedian(b,a);

        int start=0, end=n, midInMA = (n+m+1)/2;

        while(start<end){
            int mid = (start+end)/2;
            int leftASize = mid, leftBSize = midInMA-mid;
            int leftA = (leftASize>0)?a[leftASize-1]:Integer.MIN_VALUE;
            int leftB = (leftBSize>0)?b[leftBSize-1]:Integer.MIN_VALUE;
            int rightA = (leftASize<n)?a[leftASize]:Integer.MAX_VALUE;
            int rightB = (leftBSize<n)?b[leftBSize]:Integer.MAX_VALUE;

            if(leftA<=rightB && leftB<=rightA){
                if((n+m)%2==0)
                    return (Math.max(leftA,leftB) + Math.max(rightA,rightB))/2.0;
                return Math.max(leftA,leftB);
            }
            else if (leftA>rightB)
                end=mid-1;
            else
                start=mid+1;
        }

        return 0.0;
    }


}

