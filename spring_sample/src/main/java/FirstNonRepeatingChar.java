import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String str = "stress";
        Map<String, Integer> charMap = new LinkedHashMap<>();
        for(int i =0; i< str.length(); i++){
            if(charMap.containsKey(String.valueOf(str.charAt(i)))){
                int count = charMap.get(String.valueOf(str.charAt(i)));
                count = count+1;
                charMap.put(String.valueOf(str.charAt(i)), count);
            }
            else{
                charMap.put(String.valueOf(str.charAt(i)), 1);
            }
        }
        for(String key: charMap.keySet()){
            if(charMap.get(key)==1) {
                System.out.println("first is " + key);
                break;
            }
        }
    }

    /*class A

    {

        public synchronized void printA() {
            2 secs
        }

        public synchronized void printB() {
            2 secs
        }

        public static synchronized void printB() {
            3 secs
        }


    }*/

}
