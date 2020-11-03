package leetcode.generalproblems.easy;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args){
        ValidParanthesis vp = new ValidParanthesis();
        String s = "]";
        System.out.println(vp.isValid(s));
    }

    private boolean isValid(String s){
        Stack<String> braces = new Stack<>();
        boolean flag = false;
        int i = 0;
        while (i < s.length()) {
            Character current = s.charAt(i);
            if(current == '[' || current == '(' || current == '{'){
                braces.push(current.toString());
            }
            else{
                if(!braces.isEmpty() &&
                        ((current == ']' && braces.peek().equals("["))
                        || (current == '}' && braces.peek().equals("{"))
                        || (current == ')' && braces.peek().equals("("))) ){
                    braces.pop();
                }
                else{
                    braces.push(current.toString());
                }
            }
            i++;
        }
        if(braces.size()==0){
            flag=true;
        }
        return flag;
    }
}
