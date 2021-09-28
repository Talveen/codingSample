package practise;/*
    Created By: Talveen Rakhra
    Created On: 23-09-2021
    Question URL:
    Time Taken:
    Complexity:
*/

import java.util.Stack;

public class EvaluateExpression {

    public static void main(String[] args) {
        String s = "2+(5*3+2)+7-4/2";
        String s1 = "2+(5*3)";
        char[] tokens = s.toCharArray();
        Stack<Character> ops = new Stack<Character>();
        Stack<Integer> num = new Stack<Integer>();

        for(int i =0 ;i<tokens.length; i++){
            if(tokens[i]>='0' && tokens[i]<='9'){
                num.push(Integer.parseInt(String.valueOf(tokens[i])));
            }
            else if(tokens[i]=='('){
                ops.push(tokens[i]);
            }
            else if(tokens[i]==')'){
                while(ops.peek()!='('){
                    num.push(performCalc(ops.pop(), num.pop(), num.pop()));
                }
                ops.pop();
            }
            else if(tokens[i]=='+' || tokens[i]=='-' ||tokens[i]=='*' || tokens[i]=='/'){
                while (!ops.empty() && checkPrecedence(tokens[i], ops.peek())){
                    num.push(performCalc(ops.pop(), num.pop(), num.pop()));
                }
                ops.push(tokens[i]);
            }
        }
        while(!ops.isEmpty()){
            num.push(performCalc(ops.pop(), num.pop(), num.pop()));
        }
        System.out.println(num.pop());
    }

    private static boolean checkPrecedence(char op1, char op2) {
        if(op2=='(' || op2 ==')')
                return false;
        if((op1=='*' || op1=='/') && (op2=='+' || op2=='-'))
                return false;

        return true;
    }

    private static Integer performCalc(char op1, Integer num1, Integer num2) {
        switch (op1){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
        }
        return 0;
    }

}
