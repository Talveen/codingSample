package practise;

import java.util.HashSet;
import java.util.Set;

public class FindDistinctSubstring {
    public static void main(String[] args) {
        FindDistinctSubstring f = new FindDistinctSubstring();
        String str = "abcde";
        f.solve(str);
    }

    private void solve(String str) {
        Set<String> result = new HashSet<>();
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {

                // Add each substring in Set
                result.add(str.substring(i, j));
            }
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}
