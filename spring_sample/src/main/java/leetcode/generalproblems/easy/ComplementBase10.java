package leetcode.generalproblems.easy;
/*
    Created By: Talveen Rakhra
    Created On: 07-10-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

public class ComplementBase10 {
    public static void main(String[] args){
        ComplementBase10 complementBase10 = new ComplementBase10();
        int n=5;
        System.out.println(complementBase10.solve(n));
    }

    private int solve(int n) {
        String bin = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bin.length(); i++)
        {
            if(String.valueOf(bin.charAt(i)).equalsIgnoreCase("1")){
                sb.append("0");
            }
            else{
                sb.append("1");
            }
        }
        int result = Integer.parseInt(sb.toString(),2);
        return result;
    }
}
