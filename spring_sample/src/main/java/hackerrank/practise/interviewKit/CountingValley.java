package hackerrank.practise.interviewKit;/*
    Created By: Talveen Rakhra
    Created On: 21-06-2021
    Question URL:
    Time Taken:
    Complexity:
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValley {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = CountingValley.countingValleys(steps, path);
        System.out.println(result);
        bufferedReader.close();
    }

    public static int countingValleys(int steps, String path) {
        int count = 0, valley=0;
        for(int i=0;i<steps;i++){
            if(path.charAt(i)=='U'){
                count++;
            }
            else{
                count--;
            }
            if(count<0){
                while(count<0){
                    i++;
                    if(path.charAt(i)=='U'){
                        count++;
                    }
                    else{
                        count--;
                    }
                    if(count==0){
                        valley++;
                    }
                }
            }
        }
        return valley;
    }

}
