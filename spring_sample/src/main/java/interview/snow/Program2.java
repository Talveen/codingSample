package interview.snow;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program2 {
    public static void main(String[] args) {
        Program2 p = new Program2();
        String str = "welcome to servicenow";
        p.solve(str);
    }

    private void solve(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int min = 0; Character chr = str.charAt(0);
        char[] charArr = str.toCharArray();
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                int repetations = map.get(c);
                map.put(c, repetations+1);
            }
            else{
                map.put(c, 1);
            }
            if(map.get(c)<=min){
                chr = c;
                min = map.get(c);
            }
        }
        System.out.println(chr);
    }
}
