package leetcode.generalproblems.medium;

import java.util.Stack;

public class StringOperation {
    public static void main(String[] args){
        String s = "3[a2[c]]";
        System.out.println(solve(s));
    }

    private static String solve(String s) {
        Stack<String> letters =  new Stack<>();
        Stack<Integer> count =  new Stack<>();
        String res = "";
        int i=0;
        while(i<s.length()){
            Character current = s.charAt(i);
            if(Character.isDigit(current)){
                int num=0; //323
                while(Character.isDigit(s.charAt(i))){
                    num = num * 10 + Integer.parseInt(String.valueOf(s.charAt(i)));
                    i++;
                }
                count.push(num);
            }
            else if(current == '['){
                letters.push(res);
                res="";
                i++;
            }
            else if(current == ']'){
                StringBuilder sb = new StringBuilder(letters.pop());
                int con = count.pop();
                for(int j=0; j<con; j++){
                    sb.append(res);
                }
                res=sb.toString();
                i++;
            }
            else{
                res=res+current;
                i++;
            }
        }
        return res;
    }
}
