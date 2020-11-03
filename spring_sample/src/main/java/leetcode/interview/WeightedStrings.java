
/*
In Hacker Land every character has a weight. The weight of an , In Hacker Land every character has a weight. 
The weight of an English uppercase alphabet A-Z is given below.asy -A = 1B = 2*A + AC = 3*B +  
In Hackerland every character has a weight. The weight of an English uppercase alphabet A-Z is given below : 
A = 1. B = 2*A + A. C = 3*B + B . D = 4*C + C …. Z = 26*Y + Y. 
The weight made up of these characters is the summation of weights of each character. 

Given a total string weight, determine shortest string of given weight
*/

package leetcode.interview;

import java.util.*;

public class WeightedStrings {
    static int values[] = new int[26];

    static void insertValues() {
        values[0] = 1;
        int prev = 1;
        for (int i = 1; i < 26; i++) {
            values[i] = (i + 1) * prev + prev;
            prev = values[i];
        }
    }

    static StringBuffer formedString(StringBuffer sb, int k) {
        int low = 0;
        int high = 25;
        while (k != 0) {
            int ind = findfloor(k, low, high);
            sb.insert(0, (char) (ind + 'A'));
            k = k - values[ind];
        }
        return sb;

    }

    static int findfloor(int k, int low, int high) {
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (values[mid] <= k) {
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        insertValues();
        int k = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        StringBuffer res = formedString(sb, k);
        System.out.println(res);

    }
}
