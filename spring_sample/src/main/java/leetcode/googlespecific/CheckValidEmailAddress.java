package leetcode.googlespecific;
/*
    Created By: Talveen Rakhra
    Created On: 12-09-2020 
    Question URL: https://leetcode.com/explore/interview/card/google/67/sql-2/3044/
    Time Taken: 
    Complexity: 
*/

import java.util.*;

public class CheckValidEmailAddress  {
    public static void main(String[] args){
        CheckValidEmailAddress checkValidEmailAddress = new CheckValidEmailAddress();
        String[] emails= {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(checkValidEmailAddress.countValid(emails));
    }

    public int countValid(String[] emails){
        int count=0;
        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
        for(int i=0;i<emails.length;i++){
            List<String> localNamesList = new ArrayList<String>();
            String val = emails[i];
            String domain = val.substring(val.indexOf("@"));
            String localName = val.substring(0, val.indexOf("@"));
            if(localName.contains("+")){
                localName=localName.substring(0, localName.indexOf("+"));
            }
            if(localName.contains(".")){
                localName= localName.replace(".","");
            }
            if(!map.containsKey(domain)){
                localNamesList.add(localName);
                map.put(domain,localNamesList);
                count++;
            }
            else{
                localNamesList = map.get(domain);
                if(!localNamesList.contains(localName)){
                    localNamesList.add(localName);
                    map.put(domain,localNamesList);
                    count++;
                }
            }
        }
        return count;
    }
}
