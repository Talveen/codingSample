package leetcode.practise;
/*
    Created By: Talveen Rakhra
    Created On: 02-10-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

public class FindDigitsDouble {
    public static void main(String args[]){
        FindDigitsDouble fts =  new FindDigitsDouble();
        int n = 99;
        System.out.println(fts.solve(n));
    }

    private int solve(int n) {
        String number = String.valueOf(n);
        int sumDigit=0;
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            sumDigit+=+j;
        }
        int newSum=0;int j=n; int target=0;int targetSumDigit =0;
        while(sumDigit*2!=targetSumDigit){
            j++;
            targetSumDigit =0;
            String jStr = String.valueOf(j);
            for(int i = 0; i < jStr.length(); i++) {
                int k = Character.digit(jStr.charAt(i), 10);
                targetSumDigit+=+k;
            }
            target=j;
        }
        return target;
    }
}
