package leetcode.generalproblems.medium;
/*
    Created By: Talveen Rakhra
    Created On: 02-10-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

public class StringCompression {

    public static void main(String[] args){
        StringCompression stringCompression = new StringCompression();
        String str = "aaabbbcc";
        System.out.println(stringCompression.compressStr(str));
    }

    public String compressStr(String str){
        StringBuilder sb= new StringBuilder();
        int c = 1;
        for(int i=1;i<=str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i-1)){
                c++;
            }
            else{
                sb.append(str.charAt(i-1)).append(c);
                c=1;
            }
            if(i==str.length()-1){
                sb.append(str.charAt(i-1)).append(c);
                c=1;
            }
        }
        return sb.toString();
    }
}
