package leetcode.interview.serviceNow;/*
    Created By: Talveen Rakhra
    Created On: 28-04-2021
    Question URL:
    Time Taken:
    Complexity:
    Q1: Compress String. Given string "aaabbccab" return "a3b2c2a1b1"
*/

public class CompressString{
    public static void main(String[] args){
        CompressString cs = new CompressString();
        String str = "aaabbca";
        System.out.println(cs.compress(str));
    }


    public String compress(String str){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char lastChar = str.charAt(0);
        for(int i=1;i<str.length();i++){
            char currChar = str.charAt(i);
            if(lastChar  == currChar)
            {
                count++;
            }
            else{
                sb.append(lastChar).append(count);
                count=1;
                lastChar=currChar;
            }
        }
        sb.append(lastChar).append(count);
        return sb.toString();
    }
}

