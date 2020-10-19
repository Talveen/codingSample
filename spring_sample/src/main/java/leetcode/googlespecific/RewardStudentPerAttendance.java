package leetcode.googlespecific;
/*
    Created By: Talveen Rakhra
    Created On: 13-09-2020 
    Question URL: 
    Time Taken: 
    Complexity: 
*/

class RewardStudentPerAttendance
{
    public static void main(String[] args){
        RewardStudentPerAttendance sol = new RewardStudentPerAttendance();
        String s = "PPALLL";
        System.out.println(sol.checkRecord(s));
    }
    public boolean checkRecord(String s) {
        boolean flagA = true, flagL = true; int count =0;
        for(int i=0;i<s.length();i++){
            String val = String.valueOf(s.charAt(i));
            if(val.equalsIgnoreCase("A")){
                count++;
                if(count>1){
                    flagA=false;
                }
            }
            else if (val.equalsIgnoreCase("L")){
                String substr = s.substring(i, i+2<=s.length()?i+2:s.length());
                if(substr.equalsIgnoreCase("LL")){
                    flagL=false;
                }
            }
        }
        return flagA || flagL;
    }
}

