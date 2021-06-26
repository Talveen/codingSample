package hackerrank.practise.interviewKit;/*
    Created By: Talveen Rakhra
    Created On: 21-06-2021
    Question URL:
    Time Taken:
    Complexity:
*/

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SalesByMatch {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = SalesByMatch.sockMerchant(n, ar);

        System.out.println(result);
        bufferedReader.close();

    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int count=0;
        Map<Integer, Integer> sockMap = new HashMap<>();
        for(Integer a : ar){
            if (sockMap.containsKey(a)) {
                sockMap.put(a, sockMap.get(a) + 1);
            } else {
                sockMap.put(a, 1);
            }
        }
        for(Integer s: sockMap.keySet()){
            if(sockMap.get(s)>=2){
                count=count+sockMap.get(s)/2;
            }

        }
        return count;

    }


}
