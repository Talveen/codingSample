package practise;/*
    Created By: Talveen Rakhra
    Created On: 01-12-2021
    Question Description: Best average mean of marks for a student
    Time Taken:
    Complexity:
*/

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Q2readmeQ {

    static class Average{
        String studentName;
        int count;
        int marks;
        public Average(String studentName, int marks, int count){
            this.count=count;
            this.marks=marks;
            this.studentName=studentName;
        }
    }

    public static void main(String[] args) {
        Q2readmeQ q = new Q2readmeQ();
        String[][] s = {{"jerry","65"},{"bob","91"}, {"jerry","23"}, {"Eric","83"}, {"bob","10"}};
        q.findBestAverage(s);
    }

    private void findBestAverage(String[][] s) {
        int max=-1;
        Map<String, Average> map = new HashMap<>();
        for(String[] str :  s){
            if(map.containsKey(str[0])){
                Average a = map.get(str[0]);
                int mar = a.marks+Integer.parseInt(str[1]);
                int c = a.count+1;
                map.put(str[0], new Average(str[0], mar, c));
                max=Math.max(max, mar/c);
            }
            else{
                map.put(str[0], new Average(str[0], Integer.parseInt(str[1]), 1));
                max=Math.max(max, Integer.parseInt(str[1]));
            }
        }
        System.out.println("done, max="+max);
    }


}
