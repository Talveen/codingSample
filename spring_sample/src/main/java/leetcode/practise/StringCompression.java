package leetcode.practise;/*
    Created By: Talveen Rakhra
    Created On: 26-04-2021
    Question URL:
    Time Taken:
    Complexity:
*/

public class StringCompression {

    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();
        String str = "aaabbccccdsdd444";
        System.out.println(stringCompression.solve(str));
    }

    public String solve(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char last = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (last == currChar) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(str.charAt(i - 1)).append(count);

                } else {
                    sb.append(str.charAt(i - 1));
                }
                count = 1;
                last = str.charAt(i);
            }
        }
        if(count>1){
            sb.append(last).append(count);
        }
        else{
            sb.append(last);
        }
        return sb.toString();
    }

}
