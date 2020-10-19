package leetcode.googlespecific.interview;
/*
    Created By: Talveen Rakhra
    Created On: 13-10-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

import java.util.*;

public class SquishableWord {

    public class Obj {
        String word;

        public Obj(String word) {
            this.word = word;
        }
    }

    public static void main(String[] args) {
        SquishableWord sq = new SquishableWord();
        List<String> dict = Arrays.asList("pint", "int", "print", "in", "i");
        String beginWord = "sprint";
        System.out.println(sq.solve(dict, beginWord));

    }

    public String solve(List<String> dict, String beginWord) {
        String result = "Not Squishable";
        Deque<Obj> q = new LinkedList<>();
        q.add(new Obj(beginWord));

        while (!q.isEmpty()) {
            Obj curr = q.getLast();
            String tmp = isAdjascent(curr.word, dict);
            if (!tmp.isEmpty()) {
                q.add(new Obj(tmp));
                if (tmp.length() == 1) {
                    return "Squishable";
                }
            }
        }
        return result;
    }

    private String isAdjascent(String word, List<String> dict) {
        String nextProposedWord = "";
        String res = "";
        for (int i = 0; i < word.length(); i++) {
            nextProposedWord = word.substring(0, i) + word.substring(i + 1);
            if (dict.contains(nextProposedWord)) {
                res = nextProposedWord;
            }
        }
        return res;
    }
}
