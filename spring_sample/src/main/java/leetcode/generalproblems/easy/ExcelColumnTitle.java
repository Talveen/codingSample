package leetcode.generalproblems.easy;

/*
    Created By: Talveen Rakhra
    Created On: 28-10-2020
    Question URL:  https://leetcode.com/problems/excel-sheet-column-title/
    Time Taken:
    EASY
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExcelColumnTitle {
    public static void main(String[] args) {
        ExcelColumnTitle et = new ExcelColumnTitle();
        int val = 1100;
        System.out.println(et.convertToTitle(val));
    }

    private String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        Stack<Integer> ss = new Stack<>();
        while (n > 26) {
            if (n % 26 != 0) {
                ss.push(n % 26);
                n = n / 26;
            } else {
                ss.push(26);
                n = n / 26 - 1;
            }

        }
        ss.push(n);
        for (Integer i : ss) {
            res.append(values.get(i));
        }
        return res.reverse().toString();
    }

    static Map<Integer, String> values = new HashMap<Integer, String>();

    static {
        values.put(1, "A");
        values.put(2, "B");
        values.put(3, "C");
        values.put(4, "D");
        values.put(5, "E");
        values.put(6, "F");
        values.put(7, "G");
        values.put(8, "H");
        values.put(9, "I");
        values.put(10, "J");
        values.put(11, "K");
        values.put(12, "L");
        values.put(13, "M");
        values.put(14, "N");
        values.put(15, "O");
        values.put(16, "P");
        values.put(17, "Q");
        values.put(18, "R");
        values.put(19, "S");
        values.put(20, "T");
        values.put(21, "U");
        values.put(22, "V");
        values.put(23, "W");
        values.put(24, "X");
        values.put(25, "Y");
        values.put(26, "Z");
    }

}
